package Lista1Cap2;

import java.util.Scanner;
/**
 *
 * @author �lex Clayton
 */
public class Exercicio2Lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
//        Para chegar no tempo foi necessário fazer uma regra de 3, após obtido o valor
// ele foi armazenado em uma variável cujo recebe o nome de tempo
        double distancia = 1, tempo = 3, dist,temp;
        System.out.println("Você quer calcular pelo tempo ou pela distância ?");
        System.out.println("Digite T para tempo e D para distância");
       String opcao=leitura.next();
       if(opcao.equalsIgnoreCase("T")){
           System.out.println("Informe a distância que deseja saber o tempo que a onda leva para percorrer");
        dist = leitura.nextDouble();
        System.out.println("A onda levará " + (dist * tempo) + " minutos para percorrer a distância informada");
       }else if(opcao.equalsIgnoreCase("D")){
            System.out.println("Informe o tempo para saber a distância percorrida pela onda");
        temp = leitura.nextDouble();
        System.out.println("De acordo com a distância (KM) informada a onda levará:" + (temp * tempo) + " minutos para percorrer toda essa distância");
       }
        
        // TODO code application logic here
    }

}
