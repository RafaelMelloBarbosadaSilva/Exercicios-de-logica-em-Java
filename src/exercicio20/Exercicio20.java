/* 20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada. */

package exercicio20;

import java.util.Scanner;

public class Exercicio20 {
    public static int entrada (Scanner scanner){
        System.out.println("Digite um valor inteiro: ");

        while (!scanner.hasNextInt()){
            System.out.println("Digite um valor válido");
            scanner.next();
            System.out.println("Digite um valor inteiro: ");
        }
        return scanner.nextInt();
    }
    public static void tabuada (int numero){
        for (int i =1; i<=10;i++){
            int resultado = numero * i;
            System.out.println(resultado);
        }
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int valor = entrada(scanner);

        tabuada(valor);
    }
}
