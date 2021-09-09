/* 
#Exercicio 13

13.Declare três variáveis com tipos diferentes, sem atribuir valor. Depois atribua um valor qualquer a elas com dados digitados pelo usuário.
*/



import java.io.IOException;
import java.util.Scanner;


public class TdeEx13 {
    public static void main(String[] args) throws IOException, InterruptedException {
        int x;
        String string = "";
        double y;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Insira uma String: ");
        string = scnr.nextLine();

        System.out.println("Insira um valor inteiro para x: ");
        x = scnr.nextInt();

        System.out.println("Insira um valor double para y: ");
        y = scnr.nextDouble();


        System.out.printf("O valor inteiro de x: %d \nO valor da String: %s \nO valor double de y: %f", x, string, y);

    }
    
}
