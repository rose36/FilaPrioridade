/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Roseli Rocha
 */
public abstract class Senha {
    
    private String senha;
    private String token;
    private int tipoAgencia;
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getTipoAgencia() {
        return tipoAgencia;
    }

    public void setTipoAgencia(int tipoAgencia) {
        this.tipoAgencia = tipoAgencia;
    }
    
}
