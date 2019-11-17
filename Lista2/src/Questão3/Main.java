/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {

        int opt, cod, pos;
        float nota;
        String nome;

        TabelaHash3 hash = new TabelaHash3();
        Aluno tabela[] = new Aluno[hash.getTam()];

        hash.inicializar();

        do {

            System.out.println("\nDigite a alternativa desejada:\n"
                    + "1)Cadastrar Aluno\n"
                    + "2)Consultar aprovados\n"
                    + "3)Consultar todos os alunos\n"
                    + "4)Sair");

            Scanner sc = new Scanner(System.in);
            opt = sc.nextInt();
            sc.nextLine();

            if (opt < 1 || opt > 4) {
                System.out.println("Opção inválida, tente novamente...");
            } else {
                switch (opt) {
                    case 1: {

                        System.out.println("Digite o código do aluno: ");
                        cod = sc.nextInt();
                        System.out.println("Digite o nome do aluno: ");
                        nome = sc.nextLine();
                        System.out.println("Digite o dia de nascimento: ");
                        nota = sc.nextFloat();
         
                        pos = hash.funcaoHashing(cod);
                        Aluno a = new Aluno(cod, nome, nota);
                        hash.inserir(pos, a);
                        break;
                    }

                    case 2: {
                        
                        break;
                    }

                    case 3: {
                        hash.mostrarHash();
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
