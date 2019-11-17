/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão3;

/**
 *
 * @author DELL
 */
public class Aluno {

    private int cod;
    private String nome;
    private float nota;



    public Aluno(int cod, String nome, float nota) {
        this.cod = cod;
        this.nome = nome;
        this.nota = nota;
    }
    
    

    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public Aluno getProx() {
        return prox;
    }

    public void setProx(Aluno prox) {
        this.prox = prox;
    }
    
//</editor-fold>


}
