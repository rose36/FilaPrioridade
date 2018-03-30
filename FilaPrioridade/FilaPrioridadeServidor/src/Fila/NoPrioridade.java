package fila;

import Entidades.Operacao;

public class NoPrioridade {
    private NoPrioridade prev;
    private NoPrioridade next;
    private Operacao operacao;
    private int tipoPrioridade;
    private long tempoInicial;
    private long tempoFinal;
    private int tipoAtendimento;
   
    
    public NoPrioridade(NoPrioridade prev, NoPrioridade next, Operacao operacao, int tipoPrioridade, int tipoAtendimento, long tempoInicial, long tempoFinal) {
        this.prev = prev;
        this.next = next;
        this.operacao = operacao;
        this.tipoPrioridade = tipoPrioridade;
        this.tipoAtendimento = tipoAtendimento;
        this.tempoInicial = tempoInicial;
        this.tempoFinal = tempoFinal;
    }
    
    
    public NoPrioridade getNext() {
        return next;
    }

    public void setNext(NoPrioridade next) {
        this.next = next;
    }

    public Operacao getOperacao() {
        return operacao;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public NoPrioridade getPrev() {
        return prev;
    }

    public void setPrev(NoPrioridade prev) {
        this.prev = prev;
    }

    public int getPrioridade() {
        return tipoPrioridade;
    }

    public void setPrioridade(int prioridade) {
        this.tipoPrioridade = prioridade;
    }

    public long getTempoInicial() {
        return tempoInicial;
    }

    public void setTempoInicial(long tempoInicial) {
        this.tempoInicial = tempoInicial;
    }

    public long getTempoFinal() {
        return tempoFinal;
    }

    public void setTempoFinal(long tempoFinal) {
        this.tempoFinal = tempoFinal;
    }

    public int getTipoPrioridade() {
        return tipoPrioridade;
    }

    public void setTipoPrioridade(int tipoPrioridade) {
        this.tipoPrioridade = tipoPrioridade;
    }

    public int getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(int tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }
     
}


