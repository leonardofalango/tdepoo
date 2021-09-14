/*
#Exercicio 28

28.Determine a quantidade de homens e mulheres (separadamente) que são maiores de idade, baseado na leitura de dados de 10 pessoas.

*/

public class TdeEx28 {
    public static void main(String[] args) {
        int i,contadorPessoas=0;
        int[] idadeHomens= {18,24,12,52,34,12,14,15,25,26};
        int[] idadeMulheres= {5,92,68,86,24,39,10,12,11,14};

        for (i=0;i<10;i++){
            if (idadeHomens[i]>=18){
                contadorPessoas++;
            }
        }
        System.out.println("O numero de homens com 18 anos ou mais: "+contadorPessoas);
        contadorPessoas = 0;

        for (i=0;i<10;i++){
            if (idadeMulheres[i]>=18){
                contadorPessoas++;
            }
        }
        System.out.println("O numero de mulheres com 18 anos ou mais: "+contadorPessoas);
    }
}
