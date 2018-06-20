package Lista3;

import java.util.Scanner;
/**
 *
 * @author �lex Clayton
 */
public class Lista3_Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leitura = new Scanner(System.in);
        System.out.println("Informe um número:");
        int n=leitura.nextInt();
        for (int i = 0;  n>=i; i++) {
            
            if (i % 2==0) {
                System.out.println("os números pares:"+i);
                    
                }
            
        }
        System.out.println("----------------------SEPERAÇÃO--------------------------");
         for (int i = 0;  n>=i; i++) {
            
            if (i % 2==1) {
                System.out.println("os números impares:"+i);
                    
                }
            
        }
    }
    
}
