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
public class Lista2_Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float num;
        System.out.println("Informe um munero");
        num = leitura.nextFloat();

        //Estrutura de condição
        if (num % 2 == 0) {
            System.out.println("O numero é par");

        } else {
            System.out.println("O numero é impar");
        }
        if (num > 0) {
            System.out.println("O numero é Positivo");

        } else {
            System.out.println("O numero é Negativo");
        }

    }

}
