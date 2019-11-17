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
public class TabelaHash2 {

    private int tam = 20;
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

    public void inicializar() {
        for (int i = 0; i < getTam(); i++) {
            tabela[i] = new Pessoa();
            tabela[i].setSituacao("L");
        }
    }

    public void inserir(int pos, String nome) {
        int i = 0;
        while (i < tam && tabela[(pos + i) % tam].getSituacao() != "L" && tabela[(pos + i) % tam].getSituacao() != "R") {
            pos = (pos + i) / tam;
            i++;
        }

        if (i < tam) {
            tabela[(pos + i) % tam].setNome(nome);
            tabela[(pos + i) % tam].setSituacao("O");
        } else {
            System.out.println("Tabela cheia");
        }
    }

//    public void remover(int n) {
//        int posicao = buscar(n);
//        
//        if(posicao < tam) {
//            tabela[posicao].setSituacao("R");
//        }
//        else System.out.println("Elemento não está presente");
//        
//    }
//    
    public int buscar(int n, String nome) {
        int i = 0;
        int pos = funcaoHashing(n);
        while (i < tam && tabela[(pos + i) % tam].getSituacao() != "L" && tabela[(pos + i) % tam].getNome() != nome) {
            pos = (pos + i) / tam;
            i++;
        }
        if (tabela[(pos + i) % tam].getNome() == nome && tabela[(pos + i) % tam].getSituacao() != "R") {
            return (pos + i) % tam;
        } else {
            return tam;
        }
    }

    public int funcaoHashing(int num) {
        return num % tam;
    }

    public void mostrarHash() {
        System.out.println("| Nome | \n");
        for (int i = 0; i < tam; i++) {
            if (tabela[i].getSituacao() == "O") {
                System.out.println("| " + tabela[i].getNome() + "  |  ");
            }
        }
    }

    public void mostrarPessoa(int n) {
        System.out.println("| Nome | \n");
        System.out.println("| " + tabela[n].getNome() + "  |  ");
    }

    public int funcaoASCII(String nome) {

        nome = nome.toLowerCase();
        int num = nome.charAt(0);
        return num;
    }

}

//    private int tam = 26;
//    private char livre;
//    Pessoa tabela[] = new Pessoa[tam];
//
//    public int getTam() {
//        return tam;
//    }
//
//    public void setTam(int tam) {
//        this.tam = tam;
//    }
//
//    public Pessoa[] getTabela() {
//        return tabela;
//    }
//
//    public void setTabela(Pessoa[] tabela) {
//        this.tabela = tabela;
//    }
//
//    public void inicializar(){
//        for(int i = 0; i < getTam(); i++) {
//            tabela[i] = new Pessoa();
//            tabela[i].setSituacao("L");
//        }
//    }
//    
//    public void inserir(int pos, String nome) {
//        int i = 1;
//        while (i < tam && tabela[(pos + i) % tam].getSituacao() != "L" && tabela[(pos + i) % tam].getSituacao() != "R") {
//            pos = (pos + i) % tam;
//            i++;
//        }
//
//        if (i < tam) {
//            tabela[(pos + i) % tam].setNome(nome);
//            tabela[(pos + i) % tam].setSituacao("O");
//        }
//        else System.out.println("Tabela cheia");
//    }
//    
////    public void remover(int n) {
////        int posicao = buscar(n);
////        
////        if(posicao < tam) {
////            tabela[posicao].setSituacao("R");
////        }
////        else System.out.println("Elemento não está presente");
////        
////    }
//    
////    public int buscar(int n) {
////        int i = 0;
////        int pos = funcaoHash(n);
////        while(i < tam && tabela[(pos+i)%tam].getSituacao() != "L" && tabela[(pos+i)%tam].getMes() != n){
////            pos = (pos + i) % tam;
////            i++;
////        }
////        if(tabela[(pos+i)%tam].getMes() == n && tabela[(pos+i)%tam].getSituacao() != "R")
////            return (pos + i) % tam;
////        else
////            return tam;
////    }
////    
////    public int funcaoHash(int num) {
////        return num % tam;
////    }
//
//    // FUNÇÃO ABAIXO OK
//    public int funcaoASCII(String nome){
//        
//        nome = nome.toLowerCase();
//        int num = nome.charAt(0);
//        return num;
//    }
//    
////    public void mostrarHash() {
////        for(int i = 0; i < tam; i++) {
////            if(tabela[i].getSituacao() == "O"){
////                System.out.println("Entrada " + i + ": " +
////                        tabela[i].getMes() +
////                        " " + tabela[i].getSituacao());
////            }
////        }
////    }

