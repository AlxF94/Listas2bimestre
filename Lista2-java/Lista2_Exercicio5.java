/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author �lex Clayton
 */
public class Lista2_Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leitura = new Scanner(System.in);
        float n1, n2, n3;

        System.out.println("Informe o Primeiro Numero");
        n1 = leitura.nextFloat();
        System.out.println("Informe o Segundo Numero");
        n2 = leitura.nextFloat();
        System.out.println("Informe o Terceiro Numero");
        n3 = leitura.nextFloat();
        System.out.println("MENU DE OPÇÕES");
        System.out.println("1 - Calcular média ");
        System.out.println("2 - Calcular soma ");
        System.out.println("3 - Calcular multiplicação ");
         System.out.println("Escolha uma das opções :");

        int opcao = leitura.nextInt();
        
        

        if (opcao==1) {
            System.out.println("A média dos números é: "+((n1+n2+n3)/3));
        }else if (opcao==2) {
            System.out.println("A soma dos números é:"+(n1+n2+n3));
        }else if (opcao==3) {
            System.out.println("A multiplicação dos números é:"+(n1*n2*n3));
        }else{
            System.out.println("A opção escolhida é inválida!");
        }
    }

}
//Faça um algoritmo que permita ao usuário fornecer três números e escolher
//entre as opções: calcular a média, calcular a soma ou calcular a multiplicação
//dos números.
