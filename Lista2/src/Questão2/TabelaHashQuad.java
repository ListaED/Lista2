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
public class TabelaHashQuad {
    
    private int tam = 26;
    private Pessoa tabela[] = new Pessoa[tam];

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public Pessoa[] getTabela() {
        return tabela;
    }

    public void setTabela(Pessoa[] tabela) {
        this.tabela = tabela;
    }

    public void inicializar(){
        for(int i = 0; i < getTam(); i++) {
            tabela[i] = new Pessoa();
            tabela[i].setSituacao("L");
        }
    }
    
    public void inserir(int pos, String nome) {
        int i = 0;
        while (i < tam && tabela[(pos + i) % tam].getSituacao() != "L" && tabela[(pos + i) % tam].getSituacao() != "R") {
            i++;
        }

        if (i < tam) {
            tabela[(pos + i) % tam].setNome(nome);
            tabela[(pos + i) % tam].setSituacao("O");
        }
        else System.out.println("Tabela cheia");
    }
    
    public void remover(int n) {
        int posicao = buscar(n);
        
        if(posicao < tam) {
            tabela[posicao].setSituacao("R");
        }
        else System.out.println("Elemento não está presente");
        
    }
    
//    public int buscar(int n) {
//        int i = 0;
//        int pos = funcaoPessoa(n);
//        while(i < tam && tabela[(pos+i)%tam].getSituacao() != "L" && tabela[(pos+i)%tam].getMes() != n){
//            i++;
//        }
//        if(tabela[(pos+i)%tam].getMes() == n && tabela[(pos+i)%tam].getSituacao() != "R")
//            return (pos + i) % tam;
//        else
//            return tam;
//    }
    
//    public int funcaoPessoa(int num) {
//        return num % tam;
//    }

//    public void mostrarHash() {
//        for(int i = 0; i < tam; i++) {
//            if(tabela[i].getSituacao() == "O"){
//                System.out.println("Entrada " + i + ": " +
//                        tabela[i].getMes() +
//                        " " + tabela[i].getSituacao());
//            }
//        }
//    }
}
