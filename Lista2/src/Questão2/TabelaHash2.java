//GUSTAVO MARTINS PACHECO   HT3000231
//JUAN FELIPE CAVALARI BAILKE   HT3000796

package Questão2;

public class TabelaHash2 {

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
            tabela[(pos + i) % tam].setChaveCodigo(pos);
            tabela[(pos + i) % tam].setNome(nome);
            tabela[(pos + i) % tam].setSituacao("O");
        } else {
            System.out.println("Tabela cheia");
        }
    }
    
    public void consultaInicialNome(char inicial1) {
        
        char inicial2 = 0;
        for (int i = 0; i < tam; i++) {
            String nome = tabela[i].getNome();
            if (nome != null) {
                inicial2 = nome.charAt(0);
            }
            int num12 = 1;
            if (inicial1 == inicial2 && tabela[i].getSituacao() == "O") {
                System.out.println("Nome: " + tabela[i].getNome());
            }
        }
    }
    
    public String consultaEntrada(int pos) {
        return tabela[pos].getNome();
    }

    public int funcaoHashing(int num) {
        return num % tam;
    }

    public void mostrarHash() {
        for (int i = 0; i < tam; i++) {
            if (tabela[i].getSituacao() == "O") {
                System.out.println("");
                System.out.println("Entrada: " + i);
                System.out.println("Chave: " + tabela[i].getChaveCodigo());
                System.out.println("Nome : " + tabela[i].getNome());
                System.out.println("");
            }
        }
    }

    public int funcaoASCII(String nome) {

        nome = nome.toLowerCase();
        int num = nome.charAt(0);
        return num;
    }

    public void removerNome(String nome) {
        for (int i = 0; i < tam; i++) {
            String nome2 = tabela[i].getNome();
            if (nome2 != null) {
                int cmp = tabela[i].getNome().compareTo(nome);
                if (cmp == 0) {
                    tabela[i].setSituacao("R");
                    System.out.println("Pessoa removida");
                } else {
                    System.out.println("Nenhuma pessoa encontrada...");
                }
            }
        }
    }
    

}
