/* Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
imprimir seu valor na tela. */

import java.util.Scanner;

public class Exercicio3 {
    public static int lervalor(Scanner scanner) {
        int valor;

        while (true) {
            System.out.print("Digite um valor inteiro diferente de zero: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Valor inválido.");
                scanner.next();
                continue;
            }

            valor = scanner.nextInt();

            if (valor == 0) {
                System.out.println("O valor não pode ser zero.");
                continue;
            }
            return valor;
        }
    }
    public static int soma(int a, int b) {
        return a + b;
    }
    public static int multiplicacao(int a, int b) {
        return a * b;
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = lervalor(scanner);
        int b = lervalor(scanner);
        int c; // resultado

        if (a == b){
            c = soma(a, b);
        }else {
            c = multiplicacao(a, b);
        }
        System.out.println(c);
    }
}