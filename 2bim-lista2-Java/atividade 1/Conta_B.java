
package lista2.java;

/**
 *
 * @author Alex
 */
public class Conta_B {

    String nome;
    String tipo_c;
    float saldo;
    String agencia;
    String n_conta;
    
    public void abertura_conta(String nome, String tipo, String nc, String agenci){
        this.nome = nome;
        this.tipo_c = tipo;
        this.n_conta= nc;
        this.agencia=agenci;
}

    public void deposito(float saldo) {
        this.saldo = saldo;
    }
    public void saque(float saque) {
        this.saldo = this.saldo-saque;
        System.out.printf("Você sacou da sua conta o valor de R$%.2f\n",saque);
    }
    
    public void  Status() {
        System.out.printf("Agencia: %s   ",agencia);
        System.out.printf("Nº conta: %s\n",n_conta);
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Conta %s\n",tipo_c);
        System.out.printf("O saldo da conta é R$%.2f\n\n",saldo);
        
    }
}
