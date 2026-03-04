/* 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente. */

package exercicio08;

import java.util.Scanner;

public class Exercicio8 {
    public static int lerNumero(Scanner scanner) {
        System.out.println("Digite um valor Inteiro: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Insira um valor válido");
            scanner.next();
            System.out.println("Digite um valor Inteiro: ");
        }
        return scanner.nextInt();
    }
    public static void imprimirvalor(int valor1, int valor2, int valor3){
        int temp;

        if (valor1 < valor2) {
            temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }
        if (valor1 < valor3) {
            temp = valor1;
            valor1 = valor3;
            valor3 = temp;
        }
        if (valor2 < valor3) {
            temp = valor2;
            valor2 = valor3;
            valor3 = temp;
        }
        System.out.println("Ordem decrescente:");
        System.out.println(valor1 + " " + valor2 + " " + valor3);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int valor1 = lerNumero(scanner);
        int valor2 = lerNumero(scanner);
        int valor3 = lerNumero(scanner);

        imprimirvalor(valor1, valor2, valor3);
    }
}
