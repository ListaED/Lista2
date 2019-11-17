/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão3;

/**
 *
 * @author adriano
 */
public class Aluno3 {
    private int chaveCodigo;
    private String nome;
    private float notaFinal;
    private Aluno3 prox;

    
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
    public Aluno3 getProx() {
        return prox;
    }

    /**
     * @param prox the prox to set
     */
    public void setProx(Aluno3 prox) {
        this.prox = prox;
    }
}
