/*
#Exercicio 27

27.Faça um programa para ler um número do teclado e imprimir na tela se ele é par ou ímpar. Imprima também se ele é primo.

/*

public class TdeEx27 {
    public static void main(String[] args) {
        int contador=0, numero = 0, i;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Entre com um valor: ");
        i = scnr.nextInt();

        for (int u = 1; u <= i; u++) {
            if (i % u == 0) {
                contador++;
                numero = u;
            }
        }

        if (contador == 2) {
            System.out.println("O numero "+numero+" eh primo");
        }

        if (i%2==0){
            System.out.println("O numero eh par");
        }
    }
}
