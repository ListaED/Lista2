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
public class TabelaHash3 {

    private int tam = 20;
    private Aluno tabela[] = new Aluno[tam];

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public Aluno[] getTabela() {
        return tabela;
    }

    public void setTabela(Aluno[] tabela) {
        this.tabela = tabela;
    }

    public void inicializar() {
        for (int i = 0; i < getTam(); i++) {
            tabela[i] = new Aluno();
            tabela[i].setSituacao("L");
        }
    }

    public void inserir(int cod, String nome, float nota) {
        int i = 0;
        while (i < tam && tabela[(cod + i) % tam].getSituacao() != "L" && tabela[(cod + i) % tam].getSituacao() != "R") {
            i++;
        }

        if (i < tam) {
            tabela[(cod + i) % tam].setCod(cod);
            tabela[(cod + i) % tam].setNome(nome);
            tabela[(cod + i) % tam].setNotaFinal(nota);
            tabela[(cod + i) % tam].setSituacao("O");
        }
        else System.out.println("Tabela cheia");
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


}
