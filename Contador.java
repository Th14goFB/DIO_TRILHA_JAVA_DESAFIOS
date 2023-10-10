package thigas.DESAFIOS_JAVA;
import java.util.Scanner;

public class Contador {
    public static void main (String[] args){

    Scanner terminal = new Scanner(System.in);

    System.out.println("Digite o primeiro algarismo:");
    int numeroUm = terminal.nextInt();

    System.out.println("Digite outro algarimo:");
    int numeroDois = terminal.nextInt();
        contagem(numeroUm, numeroDois);

}
    static void contagem (int numeroUm, int numeroDois)throws ParametrosInvalidosException  {
    try{
        int contagem = numeroDois - numeroUm;
        System.out.println(contagem);

        for(int i=1; i<=contagem;i++) {
        System.out.println("Imprimindo o algarismo " + i);
        }
    }catch(ParametrosInvalidosException e){
        System.out.println("Operação invalida.");
    }
        System.out.println("Fim da operação.");

    } 
}
