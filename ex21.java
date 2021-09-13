/*
#Exercicio 21

21.Crie uma variável com valor de ponto flutuante com um valor qualquer e verifique se o valor desta variável está entre 1.99 e 5.99.

*/

//import java.util.Scanner;

public class TdeEx21 {
    public static void main(String[] args) throws IOException, InterruptedException {
        float numero;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        numero = scnr.nextFloat();

        if(numero >= 1.99 && numero <= 5.99){
            System.out.println("O numero " +numero+ " esta entre 1.99 e 5.99");
        }
    }
}
