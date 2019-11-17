/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão1;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opt, pos, i;
        String nome;
        int dia, mes, ano;
        
        TabelaHash hash = new TabelaHash();
        Amigo tabela[] = new Amigo[hash.getTam()];
        
        hash.inicializar();
        
        do{
            System.out.println("\nMENU DE OPÇÕES\n");
            System.out.println("1) Cadastrar amigo");
            System.out.println("2) Mostrar amigos");
            System.out.println("3) Excluir amigo");
            System.out.println("4) Sair");
            System.out.println("Digite a opção desejada: ");
            
            Scanner sc = new Scanner(System.in);
            opt = sc.nextInt();
            sc.nextLine();
            
            if(opt < 1 || opt > 4){
                System.out.println("Opção inválida, tente novamente...");
            }else{
                switch(opt){
                    case 1:
                        System.out.println("Digite o nome do amigo: ");
                        nome = sc.nextLine();
                        System.out.println("Digite o dia de nascimento: ");
                        dia = sc.nextInt();
                        System.out.println("Digite o mês de nascimento: ");
                        mes = sc.nextInt();
                        System.out.println("Digite o ano de nascimento: ");
                        ano = sc.nextInt();
                        pos = hash.funcaoHashing(dia);
                        hash.inserir(pos, nome, dia, mes, ano);
                        break;
                    case 2:
                        hash.mostrarHash();
                        break;
                    case 3:
                        System.out.println("Digite um número: ");
                        dia = sc.nextInt();
                        hash.remover(dia);
                        break;
                }
            }
        }while(opt != 4);
    }
    
}
