/*
#Exercicio 29

29.O valor pago por um Hotel da Praia de Iracema para seus porteiros é de R$10,25 por hora de trabalho.
Faça um programa que pergunte ao usuário quantas horas ele trabalhou e imprima na tela o valor do salário a ser recebido por ele.

*/

//import java.util.Scanner;

public class TdeEx29 {
    public static void main(String[] args) {
        int hora;
        float salario;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Entre com o total de horas trabalhadas: ");
        hora = scnr.nextInt();

        salario = hora * 10.25F;
        System.out.println("Salario rebecido por trabalhar "+hora+" horas, eh de: R$"+salario);
    }
}
