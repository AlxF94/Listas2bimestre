package lista2.java;

import java.util.Scanner;
/**
 *
 * @author Álex Clayton
 */
public class Ex01 {
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner(System.in);
        Conta_B c1 = new Conta_B();
        c1.abertura_conta("Joao da silva", "poupança", "000-1", "4346-x");
        c1.deposito((float) 250.00);
        c1.saque((float) 150.00);
        c1.Status();
      
    }
    
}