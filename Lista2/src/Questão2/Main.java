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
        
        int n = 20;
        
        Scanner sc = new Scanner(System.in);

        boolean continua = true;
        while (continua == true) {

            System.out.println("\nDigite a alternativa desejada:\n"
                    + "1)Inserir pessoas\n"
                    + "2)Consultar todas as pessoas\n"
                    + "3)Consultar uma pessoa\n"
                    + "4)Consultar as pessoas com uma inicial digitada\n"
                    + "5)Excluir uma pessoa \n"
                    + "6)Sair");

            int alternativa = sc.nextInt();
            
            switch (alternativa) {
                case 1: {

                    int pos = 0;
                    System.out.println("Digite o nome da pessoa ");
                    String nome = sc.nextLine();


                }
                
                case 2: {
                    
                }
                
                case 3: {
                    
                }
                
            }

            if (alternativa == 6) {
                continua = false;
            }
        }

    }

}
