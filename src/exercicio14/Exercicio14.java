//14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

package exercicio14;

import java.util.Scanner;

public class Exercicio14 {
    public static double entrada (Scanner scanner, String name){
        System.out.println("Digite um valor " + name + ":");

        while (!scanner.hasNextDouble()){
            System.out.println("Digite um valor válido. ");
            scanner.next();
            System.out.println("Digite um valor " + name + ":");
        }

        return scanner.nextDouble();
    }
    public static void troca(double a, double b){
        double aux = b;
        System.out.println("Os valores de A e B antes da troca são respectivamente: " + a + " " + b);
        b = a;
        a = aux;
        System.out.println("Os valores de A e B após a troca são: " + a + " "+ b);
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = entrada(scanner, "A");
        double b = entrada(scanner, "B");

        troca(a, b);
    }
}
