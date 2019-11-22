/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão3;

/**
 *
 * @author Pichau
 */
public class TabelaHash {
    private final int tam;
    private final Aluno[] tabelaHashing;
    
    public TabelaHash(int tam) {
        this.tam = tam;
        this.tabelaHashing = new Aluno[tam];
        inicializarTabela();
    }
    
    public void inserir(int num, String nome, float notaFinal) {
        int pos = funcao_hashing(num);
        Aluno novo = new Aluno();
        novo.setChave(num);
        novo.setNome(nome);
        novo.setNotaFinal(notaFinal);
        novo.setProx(tabelaHashing[pos]);
        tabelaHashing[pos] = novo;
    }
    
    public void remover(int num) {
        int pos = funcao_hashing(num);

        if (tabelaHashing[pos] != null) {
            if (tabelaHashing[pos].getChave() == num) {
                tabelaHashing[pos] = tabelaHashing[pos].getProx();
            }
            else {
                Aluno ant = tabelaHashing[pos];
                Aluno aux = tabelaHashing[pos].getProx();
                        
            
                while(aux != null && aux.getChave() != num) {
                    ant = aux;
                    aux = aux.getProx();
                }
                
                if (aux != null)
                    ant.setProx(aux.getProx());
                else
                    System.out.println("Número não encontrado.");
            }
        }
        else
            System.out.println("Número não encontrado.");
    }
    
    public void mostrarTabela() {
        Aluno aux;
        
        for (int i = 0; i < tam; i++) {
            aux = tabelaHashing[i];
                
            while (aux != null) {
                System.out.println("Entrada " + i + ": " + aux.getChave());
                System.out.println("Nome : " + aux.getNome());
                System.out.println("Nota Final : " + aux.getNotaFinal());
                System.out.println("\n");
                aux = aux.getProx();
            }
        }
    }
    
        public void mostrarAprovados() {
        Aluno aux;
        
        for (int i = 0; i < tam; i++) {
            aux = tabelaHashing[i];
                
            while (aux != null) {
                if(aux.getNotaFinal() >= 7){
                    System.out.println("Entrada " + i + ": " + aux.getChave());
                    System.out.println("Nome : " + aux.getNome());
                    System.out.println("Nota Final : " + aux.getNotaFinal());
                    System.out.println("\n");
                }
                aux = aux.getProx();        
            }
        }
    }
    
    private int funcao_hashing(int num) {
        return num % tam;
    }
    
    private void inicializarTabela() {
        for (int i = 0; i < this.tam; i++) {
            tabelaHashing[i] = null;
        }
    }
}
