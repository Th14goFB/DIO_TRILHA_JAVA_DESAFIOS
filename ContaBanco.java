package thigas.DESAFIOS_JAVA;

import java.util.Scanner;

public class ContaBanco {
    public static void main (String[] args) {
    int numero;
    String agencia;
    String nomeCliente;
    float saldo;

    Scanner scan = new Scanner (System.in);

    System.out.print("Digite seu número:");
    numero = scan.nextInt();
    
    System.out.print("\nDe qual agência você faz parte?\n");
    agencia = scan.next();
    
    nomeCliente = scan.nextLine();
    System.out.print("\nQual o seu nome:" + nomeCliente);
    
    System.out.print("\nDigite seu saldo:");
    saldo = scan.nextFloat();

   try {
   } catch (Exception e) {
    mensagem(numero, agencia, nomeCliente, saldo);
    }
}

    public static void mensagem (int numero, String agencia, String nomeCliente, float saldo){
        System.out.print("Olá " .concat(nomeCliente) .concat(" ,obrigado por criar uma conta em nosso banco, sua agência é ") .concat(agencia) .concat(", conta ") + numero + " e seu saldo " + saldo + " está disponível para saque.");
    }
}
