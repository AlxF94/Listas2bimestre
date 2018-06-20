package atividade4;

/**
 *
 * @author Alex Clayton
 */
import java.util.Scanner;

public class Ex04 {
       public static void main(String[] args) {
        // TODO code application logic here
         Scanner l = new Scanner(System.in);   
         Empregado e1 = new Empregado();
         System.out.print("Primeiro nome: ");
         e1.setPnome(l.next());
         System.out.print("Ultimo nome: ");
         e1.setUnome(l.next());
         System.out.print("Salario: ");
         e1.setSalario(l.nextDouble());
        
        
         e1.statusempregado();

        
        
      
    }
    
}