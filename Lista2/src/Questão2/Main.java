//GUSTAVO MARTINS PACHECO   HT3000231
//JUAN FELIPE CAVALARI BAILKE   HT3000796

package Questão2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opt, letra, i, pos;
        String nome;

        TabelaHash2 hash = new TabelaHash2();
        Pessoa tabela[] = new Pessoa[hash.getTam()];

        hash.inicializar();

        do {

            System.out.println("\nDigite a alternativa desejada:\n"
                    + "1)Inserir pessoas\n"
                    + "2)Consultar todas as pessoas\n"
                    + "3)Consultar uma pessoa pela entrada\n"
                    + "4)Consultar as pessoas com uma inicial digitada\n"
                    + "5)Excluir uma pessoa \n"
                    + "6)Sair");

            Scanner sc = new Scanner(System.in);
            opt = sc.nextInt();
            sc.nextLine();

            if (opt < 1 || opt > 6) {
                System.out.println("Opção inválida, tente novamente...");
            } else {
                switch (opt) {
                    case 1: {

                        System.out.println("Digite o nome da pessoa ");
                        nome = sc.next();
                        letra = hash.funcaoASCII(nome);
                        pos = hash.funcaoHashing(letra);
                        hash.inserir(pos, nome);              
                        break;
                    }

                    case 2: {
                        hash.mostrarHash();
                        break;
                    }

                    case 3: {
                        System.out.println("Digite a entrada: ");
                        pos = sc.nextInt();
                        nome = hash.consultaEntrada(pos);
                        System.out.println("Nome: " + nome);
                        break;
                    }

                    case 4: {
                        //CONSULTAR PESSOAS PELA INICIAL DO NOME
                        System.out.println("Digite a letra inicial: ");
                        char inicial = sc.next().charAt(0);
                        hash.consultaInicialNome(inicial);
                        break;
                    }

                    case 5: {
                        System.out.println("Digite o nome a ser removido: ");
                        nome = sc.nextLine();
                        hash.removerNome(nome);
                        break;
                    }

                }
            }
        } while (opt != 6);

    }

}