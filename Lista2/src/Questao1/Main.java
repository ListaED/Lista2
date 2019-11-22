/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao1;

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
        int dia, mes = 0, ano;
        
        TabelaHash hash = new TabelaHash();
        Amigo tabela[] = new Amigo[hash.getTam()];
        
        
        hash.inicializar();
        
        do{
            System.out.println("\nMENU DE OPÇÕES\n");
            System.out.println("1) Cadastrar amigo");
            System.out.println("2) Consultar aniversariantes de um mês");
            System.out.println("3) Consultar amigos com mais de 18 anos");
            System.out.println("4) Excluir amigo por nome");
            System.out.println("5) Excluir pessoas de um mês");
            System.out.println("6) Sair");
            System.out.println("Digite a opção desejada: ");
            
            Scanner sc = new Scanner(System.in);
            opt = sc.nextInt();
            sc.nextLine();
            
            if(opt < 1 || opt > 6){
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
                        pos = hash.funcaoHashing(mes);
                        hash.inserir(pos, nome, dia, mes, ano);
                        break;
                    case 2:
                        if(mes == 0)
                            System.out.println("Nenhum amigo inserido para mostrar...");
                        else{ 
                            System.out.println("Digite o mês a ser buscado: ");
                            mes = sc.nextInt();
                            hash.aniversariantesDoMes(mes);
                        }
                        break;
                    case 3:
                        if(mes == 0)
                            System.out.println("Nenhum amigo inserido para mostrar...");
                        else hash.maioresDe18();
                        break;
                    case 4:
                        System.out.println("Digite o nome a ser removido: ");
                        nome = sc.nextLine();
                        hash.removerPorNome(nome);
                        break;
                    case 5:
                        System.out.println("Digite o mês: ");
                        mes = sc.nextInt();
                        hash.removerPorMes(mes);
                        break;
                }
            }
        }while(opt != 6);
    }
    
}
