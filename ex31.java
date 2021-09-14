/*
#Exercicio 31

31.Existem 454 gramas em uma libra, e 1000 gramas em um quilo. Faça um programa que converta quilos para libras e vice-versa. 
(Dica: use um caractere indicando a ordem da conversão, exemplo "java q 1000" seria o comando para converter 1000 quilos para libra, e "java l 1000" seria o comando para converter 1000 libras para quilo.

*/

public class TdeEx31{

    public static void conveterLibra() {
        int x=-1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n________________________Conversor de gramas -> Libras ____________________");

        while (x<0){
            System.out.println("Entre com o valor em gramas: ");
            x = scanner.nextInt();
        }

        float libra;
        libra =(float) x/454;

        System.out.printf("%d gramas sao iguais a %.2f Libras",x,libra);
    }

    public static void conveterQuilo() {
        int x=-1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n____________________Conversor de gramas -> Quilogramas__________________");

        while (x<0){
            System.out.println("Entre com o valor em gramas: ");
            x = scanner.nextInt();
        }

        float quilo;
        quilo =(float) x/1000;

        System.out.println(x+" gramas, sao iguais a: "+quilo+"kg");
    }

    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);

        System.out.print("____________Menu_____________\n\n");
        System.out.print("Escolha a opcao que voce deseja\nOpcao 1 -> Converter um valor em gramas para Libras.\n" +
                "Opcao 2 -> Converter um valor em gramas para Quilograma.\n" +
                "\nDigite o numero da opcao: ");
        opcao = scanner.nextInt();

        if(opcao == 1){
            conveterLibra();
        }

        else if(opcao == 2){
            conveterQuilo();
        }

        else {
            main(args);
        }
    }
}

