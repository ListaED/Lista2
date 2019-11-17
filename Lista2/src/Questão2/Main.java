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
        TabelaHashQuad tab = new TabelaHashQuad();
        
        
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
                case 1:  {
                    tab.inicializar();
                
                    System.out.println("Digite o nome da pessoa ");
                    for(int i = 0 ; i < n ; i++){
                    
                    
                    String nome = sc.next();
                    int pos = tab.funcaoASCII(nome);
                    tab.inserir(pos, nome);
                    System.out.println("Posição: " + pos + "Nome: " + nome );
                    System.out.println("Digite o nome da próxima pessoa ");
                    }
                    
                    
                    //int pos = TabelaHashQuad.funcaoASCII(nome);
                //tab.inserir(tab.funcaoASCII(nome), nome);
                    
                    


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
