/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão1;

/**
 *
 * @author Pichau
 */
public class TabelaHash {
    
    private int tam = 20;
    private Amigo tabela[] = new Amigo[tam];

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public Amigo[] getTabela() {
        return tabela;
    }

    public void setTabela(Amigo[] tabela) {
        this.tabela = tabela;
    }

    public void inicializar(){
        for(int i = 0; i < getTam(); i++) {
            tabela[i] = new Amigo();
            tabela[i].setSituacao("L");
        }
    }
    
    public void inserir(int pos, String nome, int dia, int mes, int ano) {
        int i = 0;
        while (i < tam && tabela[(pos + i) % tam].getSituacao() != "L" && tabela[(pos + i) % tam].getSituacao() != "R") {
            i++;
        }

        if (i < tam) {
            tabela[(pos + i) % tam].setNome(nome);
            tabela[(pos + i) % tam].setDia(dia);
            tabela[(pos + i) % tam].setMes(mes);
            tabela[(pos + i) % tam].setAno(ano);
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
    
    public int buscar(int n) {
        int i = 0;
        int pos = funcaoHashing(n);
        while(i < tam && tabela[(pos+i)%tam].getSituacao() != "L" && tabela[(pos+i)%tam].getMes() != n){
            i++;
        }
        if(tabela[(pos+i)%tam].getMes() == n && tabela[(pos+i)%tam].getSituacao() != "R")
            return (pos + i) % tam;
        else
            return tam;
    }
    
    public int funcaoHashing(int num) {
        return num % tam;
    }

    public void mostrarHash() {
        System.out.println("Nome  |  Dia  |  Mês  |  Ano\n");
        for(int i = 0; i < tam; i++) {
            if(tabela[i].getSituacao() == "O"){
                System.out.println(tabela[i].getNome() + "  |  " +
                        tabela[i].getDia() + "  |  " +
                        tabela[i].getMes() + "  |  " +
                        tabela[i].getAno());
            }
        }
    }
}
