/*
#Exercicio 26

26.Faça um programa para imprimir os números primos de 1 a 123. 

*/


public class TdeEx26 {
    public static void main(String[] args) {

        int contador, numero = 0, i;

        for (i=1;i<=123;i++) {
            contador = 0;

            for (int u = 1; u <= i; u++) {
                if (i % u == 0) {
                    contador++;
                    numero = u;
                }
            }

            if (contador == 2) {
                System.out.println(numero);
            }
        }

    }
}
