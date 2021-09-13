/*
#Exercicio 15
15.Implemente um programa que receba dados digitados pelo usuário e atribua a uma variável do tipo String e imprima a frase inserida no console.
*/

//import java.util.Scanner


public class TdeEx16 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String frase, conc = " Exemplo String";
        Scanner scnr = new Scanner(System.in);

        System.out.println("Entre com os dados: ");
        frase = scnr.nextLine() + conc; 
        System.out.printf("A frase escolhida foi:\n %s",frase);
    }
}
