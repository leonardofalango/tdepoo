/*
#Exercicio 24

24.Crie as classes ilustradas no diagrama abaixo. Para cada método você deve imprimir a mensagem correspondente: abastercer() deve imprimir “abastecendo” e assim por diante.

*/

public class TdeEx24 {
    public static class Veiculo {

        public static void abastecer(){
            System.out.println("Abastecendo.");
        }

        public static void acelerar() {
            System.out.println("Acelerando.");
        }

        public static void frear(){
            System.out.println("Freando.");
        }

    }
    public static class Moto extends Veiculo{
        /*
        *Colocar metodos que sao usados apenas por moto

        void empinar(){
            System.out.println("Empinando.")
        }

         Todos os metodos que possuem em Veiculo, possuem em moto por Heranca
         */

        public static void buzinar(){
            System.out.println("Buzinando.");
        }

    }

    public static class Automovel extends Veiculo{
        /*
        *Colocar metodos que sao usados apenas por veiculos

        void colocarCinto{
            System.out.println("Colocando cinto de seguranca.")
        }

        */

        public static void passarMarcha(){
            System.out.println("Passando marcha.");
        }
    }

    public static class Ferrari extends Automovel{
        /*
        Colocar metodos que sao usados apenas por ferraris

        void  portaBorboleta(){
            System.out.println("Abrindo portas borboletas.")
        }

         */
    }

    public static class Fusca extends Automovel{
        /*
        Colocar metodos que sao usados apenas por fuscas

        void  queimarRadiador(){
            System.out.println("Radiador foi queimado.")
        }

         */
    }

    /*
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        ferrari.abastecer();
        ferrari.passarMarcha();
        
        Fusca fusquinha = new Fusca();
        fusquinha.passarMarcha();
    }
     */
}
//
