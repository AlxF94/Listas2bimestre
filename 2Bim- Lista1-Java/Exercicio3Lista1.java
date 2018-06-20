package Lista1Cap2;

import java.util.Scanner;
/**
 *
 * @author �lex Ferreira
 */
public class Exercicio3Lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leitura=new Scanner(System.in);
        Integer numero;
        System.out.println("Informe um número inteiro que deseja mostrar o inverso, esse número deve conter no máximo 9 dígitos:");
        numero=leitura.nextInt();
        if(numero>999999999){
            System.out.println("Vc estourou a capacidade do int não i");
        }else{
        Integer a = new Integer(numero);
		String b = a.toString();
		String c = "";
		for (int i=b.length(); i > 0; i--) {
			c += b.substring(i - 1, i);
		}
		System.out.println("numero invertido:" + c);
        }
    }
    
}
