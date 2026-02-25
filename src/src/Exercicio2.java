// Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class Exercicio2 {

    public static int lerNumero(Scanner scanner) {
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

    public static void testeParOuImpar(int valor) {
        if (valor % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }

    public static void testePositivoOuNegativo(int valor) {
        if (valor > 0) {
            System.out.println("O valor é positivo");
        } else {
            System.out.println("O valor é negativo");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entrada = lerNumero(scanner);

        testeParOuImpar(entrada);
        testePositivoOuNegativo(entrada);

        scanner.close();
    }
}