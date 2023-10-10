package thigas.DESAFIOS_JAVA;
import java.util.Scanner;

public class Contador {
    public static void main (String[] args) throws Exception{

    Scanner terminal = new Scanner(System.in);

    System.out.println("Digite o primeiro algarismo:");
    int numeroUm = terminal.nextInt();

    System.out.println("Digite outro algarimo:");
    int numeroDois = terminal.nextInt();

      try{    
        contagem(numeroUm, numeroDois);
      }catch(ParametrosInvalidosException e){
          System.err.println("O segundo parâmetro não pode ser maior que o primeiro.");
      }
}
    static void contagem (int numeroUm, int numeroDois)throws ParametrosInvalidosException  {
        if(numeroUm > numeroDois) {
            throws new ParametrosInvalidosException()
        }
        
        int contagem = numeroDois - numeroUm;
        System.out.println(contagem);

        for(int i=1; i<=contagem;i++) {
        System.out.println("Imprimindo o algarismo " + i);
        }

        System.out.println("Fim da operação.");

    } 
}
