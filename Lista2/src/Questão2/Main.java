/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
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
                        System.out.println("Digite a chave(entrada): ");
                        pos = sc.nextInt();
                        nome = hash.consultaEntrada(pos);
                        System.out.println("Nome: " + nome);
                        //System.out.println("Chave: " + chave + " - Nome: " + nome);
                        
//                        int j = hash.buscar(chave, nome); 
//                        hash.mostrarPessoa(j);

                        break;
                    }

                    case 4: {

                        break;
                    }

                    case 5: {
                        System.out.println("Digite o nome da pessoa a ser excluído:");
                        nome = sc.nextLine();
                        letra = hash.funcaoASCII(nome);
                        
//                        hash.remover(letra);
                        break;
                    }

                }
            }
        } while (opt != 6);

    }

}
