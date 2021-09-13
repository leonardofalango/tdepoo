/*
#Exercicio 18

18.Crie uma nova String, pegando o pedaço da primeira String que compreenda a frase “Exemplo String”.

*/

//import java.util.Scanner


public class TdeEx19 {
    public static void main(String[] args) throws IOException, InterruptedException {
        int numero;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        numero = scnr.nextInt();

        if(numero < 15 || numero > 100){
            System.out.println("O numero " +numero+" eh maior que 100 ou menor que 15");
        }
        else{
            System.out.println("O numero "+numero+ " esta entre 15 e 100");
        }
    }
}
