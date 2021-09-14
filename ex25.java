/*
#Exercicio 25

25.Escreva um programa que imprima na tela a soma dos números ímpares entre 0 e 30 e a multiplicação dos números pares entre 0 e 30

*/

public class TdeEx25 {
    public static void main(String[] args) {
        double i, x=0,y=1;
        for(i=0;i<=30;i++){
            
            if (i%2 == 0) {
                y *= i;
            }
            else{
                x += i;
            }
        }
        System.out.println("A multiplicacao dos numeros pares:\n" + y);
        System.out.println("A Soma dos numeros impares:\n" + x);
        //Numeros pares entre 0 e 30, inclui o numero 0, que por convencao eh par, entao o resultado da multiplicacao fica 0
        //Para que o resultado seja outro numero diferente de 0, basta mudar o for, para for(i=1;i<=30;i++)
        //Porem, isso faria com que o resultado seja um numero absurdamente grande
        
    }
}
