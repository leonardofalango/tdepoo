/*
#Exercicio 18
18.Crie uma nova String, pegando o pedaço da primeira String que compreenda a frase “Exemplo String”.
*/

//import java.util.Scanner


public class TdeEx18 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String frase, conc = "–Exemplo String";
        Scanner scnr = new Scanner(System.in);

        System.out.println("Entre com os dados: ");
        frase = scnr.nextLine() + conc; 
        System.out.printf("A frase escolhida foi:\n %s",frase);
    }
}
