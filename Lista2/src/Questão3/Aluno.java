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
    private String situacao;

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

    public float getNotaFinal() {
        return nota;
    }

    public void setNotaFinal(float notaFinal) {
        this.nota = notaFinal;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
//</editor-fold>


}
