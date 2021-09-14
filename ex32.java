/*
#Exercicio 32

32.Implemente um programa para calcular a área de um trapézio, onde:
h = altura
b = base menor
B = base maior
Área = (h . (b + B)) / 2

*/

//import java.util.Scanner;

public class TdeEx26 {                                                                      
    public static void main(String[] args) {                                                
        Scanner scnr = new Scanner(System.in);                                              
        int h,b,B;                                                                          
        float areaTrap;                                                                     
                                                                                            
        System.out.println("Entre com o valor da altura do trapezio: ");                    
        h = scnr.nextInt();                                                                 
        System.out.println("Entre com o valor da base menor do trapezio: ");                
        b = scnr.nextInt();                                                                 
        System.out.println("Entre com o valor da base maior do trapezio: ");                
        B = scnr.nextInt();                                                                 
                                                                                            
        areaTrap = (float)(h*(b+B))/2;                                                      
        System.out.println("Area do trapezio: "+areaTrap);                                  
    }                                                                                       
}                                                                                           
                                                                                            

