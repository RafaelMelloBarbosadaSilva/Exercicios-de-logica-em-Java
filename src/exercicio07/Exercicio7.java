/* 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO. */

package exercicio07;

import java.util.Scanner;

public class Exercicio7 {
    public static boolean lervalor(Scanner scanner){
        System.out.println("Digite o valor lógico: ");

        while (!scanner.hasNextBoolean()) {
            System.out.println("Insira um valor válido");
            scanner.next();
            System.out.println("Digite o valor lógico: ");
        }
        return scanner.nextBoolean();
    }
    public static void teste(boolean valor1, boolean valor2){
        if (valor1 && valor2){
            System.out.println("Ambos sao verdadeiros");
        } else if (!valor1 && !valor2) {
            System.out.println("Ambos sao falsos");
        } else if (valor1) {
            System.out.println("o primeiro valor é verdadeiro e o segundo é falso");
        } else {
            System.out.println("o primeiro valor é falso e o segundo é verdadeiro");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean valor1 = lervalor(scanner);
        boolean valor2 = lervalor(scanner);

        teste(valor1, valor2);
    }
}
