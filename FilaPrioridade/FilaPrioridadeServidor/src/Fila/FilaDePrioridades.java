
package Fila;

import Entidades.Crianca;
import Entidades.Deficiente;
import Entidades.Operacao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Entidades.Gestante;
import Entidades.Idoso;
import Entidades.Normal;
import Entidades.Operacao;


public class FilaDePrioridades{

    
    private NoPrioridade cauda;
    private NoPrioridade frente;
    private int tamanho;
    private ArrayList<Removido> removidos;
   
    
    public FilaDePrioridades() {
    	removidos = new ArrayList<Removido>();
        frente = new NoPrioridade(null, null, null, 0, 0, 0);
        cauda = new NoPrioridade(frente, null,null,0, 0, 0);
        frente.setNext(cauda);
        tamanho=0;
 
    }
    
    
    public Operacao desenfileirar(){
        
        if(!isEmpty()){
        	Operacao temp;
                Removido r = new Removido();
        	frente.getNext().setTempoFinal(System.currentTimeMillis());
        	long tempo = (frente.getNext().getTempoFinal()-frente.getNext().getTempoInicial()) / 1000;
        	calcularMulta(frente.getNext(), tempo);
                r.setA(frente.getNext());
                r.setTempo(tempo);
        	removidos.add(r);
        	temp = frente.getNext().getOperacao();
        	frente.getNext().getNext().setPrev(frente);
        	frente.setNext(frente.getNext().getNext());
        	tamanho --;
                JOptionPane.showMessageDialog(null, "Cliente "+temp+" foi atendido(a)!!");
                return temp;
                
        }
        
        JOptionPane.showMessageDialog(null, "Não há cliente para ser atendido", "Atenção", 2);
        
        return null;
        
    }
    
    
    
    public void enfileirar(Operacao op) {
        
        
                if(isEmpty()){
                    fila.NoPrioridade novoNo = new fila.NoPrioridade(frente, cauda, op, checkPrioridade(op), System.currentTimeMillis(), 0);
                    frente.setNext(novoNo);
                    cauda.setPrev(novoNo);
                    tamanho ++;
                    JOptionPane.showMessageDialog(null,"Vaga resevada com sucesso, aguarde atendimento :)");
                }else{
                    fila.NoPrioridade novoNo = new fila.NoPrioridade(cauda.getPrev(), cauda, op, checkPrioridade(op), System.currentTimeMillis(), 0);
                    cauda.getPrev().setNext(novoNo);
                    cauda.setPrev(novoNo);
                    tamanho ++;
                    organizarFila();
                     JOptionPane.showMessageDialog(null,"Vaga reservada com sucesso, aguarde atendimento :)");
                }
        
    } 

    private void organizarFila() {
    	NoPrioridade aux = cauda.getPrev();	
    	NoPrioridade aux2 = aux.getPrev();
    	while(aux.getPrioridade() < aux2.getPrioridade() ){
    		aux.setPrev(aux2.getPrev());
    		aux2.getPrev().setNext(aux);
    		aux2.setNext(aux.getNext());
    		aux.getNext().setPrev(aux2);
    		aux.setNext(aux2);
    		aux2.setPrev(aux);
    		aux2 = aux.getPrev();
    		
    	}	
		
	}

    public Operacao frente(){
        if(!isEmpty()){
            return frente.getNext().getOperacao();
           }else{
               JOptionPane.showMessageDialog(null, "Não há cliente na fila", "Atenção", 2);
           }
        
        return null;
    }

   
    public boolean isEmpty(){
        return tamanho == 0;
    
    }
    
    public int size() {
       return tamanho;
       
    }
    public void imprimirRemovidos() {
        if(removidos.isEmpty()){
            JOptionPane.showMessageDialog(null,"Não há dados","Relatório de atendimento",1);
        }else{
            String resultado = "";
            for (int i = 0; i < removidos.size(); i++) {
            resultado = resultado +"Cliente: "+ removidos.get(i).getA().getOperacao().getSenha()+"\ntempo de atendimento: " + removidos.get(i).getTempo()+" segundos\n_________________________________________________\n";
		}
            JOptionPane.showMessageDialog(null, resultado,"Relatório de atendimento",1);
        }
    }
    
    public void imprimir() {
        if(isEmpty()){
            JOptionPane.showMessageDialog(null,"Não há dados","Relatórios de clientes",1);
        }else{
            NoPrioridade aux = frente.getNext();
        String resultado = "";
        while(aux.getNext()!=null){
        	resultado = resultado + "Cliente: "+aux.getOperacao().getNome()+"\nPrioridade: " + aux.getPrioridade()+"\n____________________________\n";
        	aux = aux.getNext();
        }
        JOptionPane.showMessageDialog(null, resultado,"Relatórios de clientes",1);
        }
        
    }
    
    public int checkPrioridade(Operacao op){
        
        if(op.getClass().equals(Gestante.class)){
            return 1;
        }
        else if(op.getClass().equals(Idoso.class)){
            return 2;
        }
        else if(op.getClass().equals(Crianca.class)){
            return 3;
        }
        else if(op.getClass().equals(Deficiente.class)){
            
            return 4;
        }
        else if (op.getClass().equals(Normal.class)){
            return 5;
        
        }
        
        return 0;
        
    }
    
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return this.tamanho;
        
    }
}

    

