/*
#Exercicio 22

22.Agora compare se o valor das duas variáveis acima é igual.

*/

//import java.util.Scanner;

public class TdeEx22 {
    public static void main(String[] args) throws IOException, InterruptedException {
        float numero;
        int i;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Entre com um numero inteiro: ");
        i = scnr.nextInt();
        System.out.println("Entre com um numero float: ");
        numero = scnr.nextFloat();

        if(numero == i){
            System.out.println("Os numeros sao iguais");
        }
        else{
            System.out.println("Os numeros sao diferentes");
        }
    }
}
