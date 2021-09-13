/*
#Exercicio 20

20.Crie uma variável inteira com um valor qualquer e verifique se o valor desta variável é menor que 15 ou maior que 100.
*/

//import java.util.Scanner;

public class TdeEx20 {
    public static void main(String[] args) throws IOException, InterruptedException {
       int i = 0;
       Scanner scnr = new Scanner(System.in);
      
       System.out.println("Entre com um numero: ");
       i = scnr.nextInt();
       
       if(i < 15 || i > 100){
          System.out.printf("O numero %i eh maior que 100 ou menor que 15");
       }
       else{
          System.out.printf("O numero %i esta entre 15 e 100");
       }
    }
}
