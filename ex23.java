/*
#Exercicio 23

23.Calcule o valor da multiplicação de um int por um double, atribuindo o valor a um int.

*/

//import java.util.Scanner;

public class TdeEx23 {
    public static void main(String[] args) throws IOException, InterruptedException {
        double numero;
        int i,resultado;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Entre com um numero inteiro: ");
        i = scnr.nextInt();
        System.out.println("Entre com um numero Double: ");
        numero = scnr.nextDouble();

        resultado = (int) (i * numero);

        System.out.println("A multiplicacao desses dois numeros: \n"+resultado);
    }
}
