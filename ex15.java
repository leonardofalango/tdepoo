/*
#Exercicio 15

15.Implemente um programa que receba dados digitados pelo usuário e atribua a uma variável do tipo String e imprima a frase inserida no console.

*/

//import java.util.Scanner

public class TdeEx15 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String frase= "";
        Scanner scnr = new Scanner(System.in);

        System.out.println("Entre com os dados: ");
        frase = scnr.nextLine();
        System.out.printf("A frase escolhida foi: %s",frase);
    }
}


