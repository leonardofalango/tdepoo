/*
#Exercicio 30

30.Modifique o programa anterior para que o sistema imprima uma mensagem de alerta quando o valor a ser pago ao funcionário seja inferior a R$ 50,00: 
"Atenção, dirija- se à direção do Hotel!".

*/

//import java.util.Scanner;

public class TdeEx26 {
    public static void main(String[] args) {
        int hora;
        float salario;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Entre com o total de horas trabalhadas: ");
        hora = scnr.nextInt();
        salario = hora * 10.25F;

        if(salario<50){
            System.out.println("Atenção, dirija- se à direção do Hotel!");
        }

        else{
            System.out.println("Salario rebecido por trabalhar " + hora + " horas, eh de: R$" + salario);
        }
    }
}
