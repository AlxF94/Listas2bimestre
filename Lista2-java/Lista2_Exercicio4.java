
package Lista2;

import java.util.Scanner;

/**
 *
 * @author �lex Clayton
 */
public class Lista2_Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        float n1, n2, n3;
        String opcao;

        System.out.println("Informe o Primeiro Numero");
        n1 = leitura.nextFloat();
        System.out.println("Informe o Segundo Numero");
        n2 = leitura.nextFloat();
        System.out.println("Informe o Terceiro Numero");
        n3 = leitura.nextFloat();
        System.out.println("Informe C para Crescente ou D para Decrescente");
        opcao = leitura.next();
        if (opcao.equalsIgnoreCase("c")) {

            if (((n1 < n2) && (n1 < n3) && (n2 < n3))) {
                System.out.println("A ordem crescente é:" + n1 + "," + n2 + "," + n3);
            } else if (((n1 < n2) && (n1 < n3) && (n3 < n2))) {
                System.out.println("A ordem crescente é:" + n1 + "," + n3 + "," + n2);
            } else if ((n2 < n1) && (n2 < n3) && (n1 < n3)) {
                System.out.println("A ordem crescente é:" + n2 + "," + n1 + "," + n3);
            } else if ((n2 < n1) && (n2 < n3) && (n3 < n1)) {
                System.out.println("A ordem crescente é:" + n2 + "," + n3 + "," + n1);
            } else if ((n3 < n1) && (n3 < n2) && (n1 < n2)) {
                System.out.println("A ordem crescente é:" + n3 + "," + n1 + "," + n2);
            } else if ((n3 < n1) && (n3 < n2) && (n2 < n1)) {
                System.out.println("A ordem crescente é:" + n3 + "," + n2 + "," + n1);
            }

        } else if (opcao.equalsIgnoreCase("d")) {
            if (((n1 > n2) && (n1 > n3) && (n2 > n3))) {
                System.out.println("A ordem decrescente é:" + n1 + "," + n2 + "," + n3);
            } else if (((n1 > n2) && (n1 > n3) && (n3 > n2))) {
                System.out.println("A ordem decrescente é:" + n1 + "," + n3 + "," + n2);
            } else if ((n2 > n1) && (n2 > n3) && (n1 > n3)) {
                System.out.println("A ordem decrescente é:" + n2 + "," + n1 + "," + n3);
            } else if ((n2 > n1) && (n2 > n3) && (n3 > n1)) {
                System.out.println("A ordem decrescente é:" + n2 + "," + n3 + "," + n1);
            } else if ((n3 > n1) && (n3 > n2) && (n1 > n2)) {
                System.out.println("A ordem decrescente é:" + n3 + "," + n1 + "," + n2);
            } else if ((n3 > n1) && (n3 > n2) && (n2 > n1)) {
                System.out.println("A ordem decrescente é:" + n3 + "," + n2 + "," + n1);
            }
        }

// TODO code application logic here
    }

}
//Ler três valores e um código de condição. Se o código for “c�? os valores devem
//ser escritos em ordem crescente. Se o código for “d�?, deve-se escrevê-los em
//ordem decrescente.
