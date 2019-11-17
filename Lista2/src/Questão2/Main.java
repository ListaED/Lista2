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

        int opt, pos, i;
        String nome;

        TabelaHash2 hash = new TabelaHash2();
        Pessoa tabela[] = new Pessoa[hash.getTam()];

        hash.inicializar();

        do {

            System.out.println("\nDigite a alternativa desejada:\n"
                    + "1)Inserir pessoas\n"
                    + "2)Consultar todas as pessoas\n"
                    + "3)Consultar uma pessoa\n"
                    + "4)Consultar as pessoas com uma inicial digitada\n"
                    + "5)Excluir uma pessoa \n"
                    + "6)Sair");

            Scanner sc = new Scanner(System.in);
            opt = sc.nextInt();
            sc.nextLine();

            if (opt < 1 || opt > 4) {
                System.out.println("Opção inválida, tente novamente...");
            } else {
                switch (opt) {
                    case 1: {

                        System.out.println("Digite o nome da pessoa ");
                        nome = sc.next();
                        pos = hash.funcaoASCII(nome);
                        hash.inserir(pos, nome);              
                        break;
                    }

                    case 2: {
                        hash.mostrarHash();
                        break;
                    }

                    case 3: {
                        System.out.println("Digite um nome: ");
                        nome = sc.next();
                        pos = hash.funcaoASCII(nome);
                        
                        //System.out.println("Chave: " + pos + " - Nome: " + nome);
                        
                        int j = hash.buscar(pos, nome); 
                        hash.mostrarPessoa(j);

                        break;
                    }

                    case 4: {

                        break;
                    }

                    case 5: {

                        break;
                    }

                }
            }
        } while (opt != 6);

    }

}
