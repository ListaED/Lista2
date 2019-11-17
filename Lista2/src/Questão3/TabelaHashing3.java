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
public class TabelaHashing3 {
    private final int tam;
    private final Aluno3[] tabelaHashing;
    
    public TabelaHashing3(int tam) {
        this.tam = tam;
        this.tabelaHashing = new Aluno3[tam];
        inicializarTabela();
    }
    
    public void inserir(int num, String nome, float notaFinal) {
        int pos = funcao_hashing(num);
        Aluno3 novo = new Aluno3();
        novo.setChave(num);
        novo.setNome(nome);
        novo.setNotaFinal(notaFinal);
        novo.setProx(tabelaHashing[pos]);
        tabelaHashing[pos] = novo;
    }
    
    public void remover(int num) {
        int pos = funcao_hashing(num);

        // verifica se existe uma lista na posição 'pos'
        if (tabelaHashing[pos] != null) {
            // caso exista, verifica se o 1º elemento contem a chave buscada
            if (tabelaHashing[pos].getChave() == num) {
                tabelaHashing[pos] = tabelaHashing[pos].getProx();
            }
            else {
                // percorre a lista em busca da chave a ser removida
                Aluno3 ant = tabelaHashing[pos];
                Aluno3 aux = tabelaHashing[pos].getProx();
                        
            
                while(aux != null && aux.getChave() != num) {
                    ant = aux;
                    aux = aux.getProx();
                }
                
                // remove o hash aux que contem a chave
                // o anterior aponta para quem o aux aponta
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
        Aluno3 aux;
        
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
        Aluno3 aux;
        
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
