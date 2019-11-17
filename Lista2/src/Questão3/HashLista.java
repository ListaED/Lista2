/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão3;

/**
 *
 * @author DELL
 */
public class HashLista {
    
    public static class Hash{
        int chave;
        Hash prox;
    }
    
    static int tam=10;
    static Hash tabela[] = new Hash [tam];
    static Scanner entrada = new Scanner (System.in);
    
    public static void inserir(int pos, int n){
        Hash novo;
        novo = new Hash();
        novo.chave = n;
        novo.prox = tabela[pos];
        tabela[pos] = novo;
    }
    
    static int funcaoHashing(int num){
        return num % tam;
    }
    
    static void mostrarHash(){
        Hash aux;
        for(int i=0; i < tam; i++){
            aux = tabela[i];
            while(aux != null){
                System.out.println("Entrada " + i + ": " +aux.chave);
                aux = aux.prox;
            }
        }
    }
    
    static void excluirHash(int num){
        int pos = funcaoHashing(num);
        Hash aux;
        if(tabela[pos] != null){
            if(tabela[pos].chave == num){
                tabela[pos] = tabela[pos].prox;
            }else{
                aux = tabela[pos].prox;
                Hash ant = tabela[pos];
                while(aux != null && aux.chave != num){
                    ant = aux;
                    aux = aux.prox;
                }
                if (aux != null){
                    ant.prox = aux.prox;
                }else{
                    System.out.println("Número não encontrado");
                }
                
                
            }
            
        }else{
            System.out.println("Número não encontrado");
        }  
    }
    
    public static void main(String[] args) {
        
        int op, pos;
        int num;
        
        do{
            System.out.println("\nMenu de Opções\n");
            System.out.println("1 - Inserir elemento\n");
            System.out.println("2- Mostrar tabela hashing\n");
            System.out.println("3 - Excluir elemento\n");
            System.out.println("4 - Sair\n");
            System.out.println("Digite sua opção\n");
            op = entrada.nextInt();
            
            
            
        }while (op!= 4);
        
    }
    
}
