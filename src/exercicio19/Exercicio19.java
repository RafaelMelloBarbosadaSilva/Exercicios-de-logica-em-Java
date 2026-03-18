/* 19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10. */

package exercicio19;

public class Exercicio19 {
    public static void tabuada (int numero){
        for (int i =1; i<11;i++){
            int resultado = numero * i;
            System.out.println(resultado);
        }
    }
    public static void main (String[] args){
        for (int i = 1; i<11; i++){
            tabuada(i);
        }
    }
}
