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
    private int chaveCodigo;
    private String nome;
    private float notaFinal;
    private Aluno prox;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    /**
     * @return the chaveCodigo
     */
    public int getChave() {
        return chaveCodigo;
    }

    /**
     * @param chave the chaveCodigo to set
     */
    public void setChave(int chave) {
        this.chaveCodigo = chave;
    }

    /**
     * @return the prox
     */
    public Aluno getProx() {
        return prox;
    }

    /**
     * @param prox the prox to set
     */
    public void setProx(Aluno prox) {
        this.prox = prox;
    }
}
