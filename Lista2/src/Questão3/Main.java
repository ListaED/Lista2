//GUSTAVO MARTINS PACHECO   HT3000231
//JUAN FELIPE CAVALARI BAILKE   HT3000796

package Questão3;

import java.util.Scanner;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, op, opt, pos, tam = 8;
        String nome = null;
        float notaFinal = 0;
        Scanner entrada = new Scanner(System.in);
        
        TabelaHash tabela = new TabelaHash(tam);

        do {
            System.out.println("\nMENU DE OPÇÕES\n");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Exibir todos os alunos");
            System.out.println("3 - Exibir alunos aprovados");
            System.out.println("4 - Excluir cadastro");
            System.out.println("5 - Sair");
            System.out.println("Digite sua opção: ");

            op = entrada.nextInt();

            if (op < 1 || op > 4) {
                System.out.println("Opção inválida!");
            } else {
                switch (op) {
                    case 1:
                        System.out.println("Digite o código do aluno:");
                        num = entrada.nextInt();
                        System.out.println("Digite um nome:");
                        nome = entrada.next();
                        System.out.println("Digite a nota final:");
                        notaFinal = entrada.nextFloat();
                        tabela.inserir(num, nome, notaFinal);
                        break;
                    case 2:
                        tabela.mostrarTabela();
                        break;
                    case 3:
                        tabela.mostrarAprovados();
                        break;
                    case 4:
                        System.out.println("Informe o código:");
                        num = entrada.nextInt();
                        System.out.println("Confirma a exclusão do cadastro? (1-sim/0-não)\n");
                        opt = entrada.nextInt();
                        if(opt == 1)
                            tabela.remover(num);
                        break;
                }

            }

        } while (op != 5);
    }
    
}
