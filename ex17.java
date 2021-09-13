/*
#Exercicio 17

17.Imprima na tela (console) o número de caracteres da String.
*/

//import java.util.Scanner;

public class TdeEx17 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String frase, conc = "–Exemplo String";
        int i;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Entre com os dados: ");
        
        frase = scnr.nextLine();
        i = frase.length();
        frase = frase + conc;
        
        System.out.println("A frase escolhida foi:\n" + frase + "\nA quantidade de caracteres dessa String:\n" + i);

    }
}

