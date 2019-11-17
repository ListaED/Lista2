/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão2;

/**
 *
 * @author DELL
 */
public class Pessoa {

    private int chaveCodigo;
    private String nome;
    private String situacao;
    
        public int getChaveCodigo() {
        return chaveCodigo;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
    public void setChaveCodigo(int chaveCodigo) {
        this.chaveCodigo = chaveCodigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

//</editor-fold>


    
}
