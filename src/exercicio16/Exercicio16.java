/* 16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos,
determine se o triângulo é equilátero, isósceles ou escaleno. */

package exercicio16;

import java.util.Scanner;

public class Exercicio16 {
    public static double entrada (Scanner scanner, String lado){
        System.out.println("Digite o valor do lado " + lado + ":");

        while (!scanner.hasNextDouble()){
            System.out.println("Digite um valor válido");
            scanner.next();
            System.out.println("Digite o valor do lado " + lado + ":");
        }
        return scanner.nextDouble();
    }
    public static boolean validacao (double a, double b, double c){
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }
    public static void resultado (double a, double b, double c){
        if (a == b && b == c){
            System.out.println("O triangulo é equilátero.");
        }
        else if (a == b || a == c || b == c){
            System.out.println("O triangulo é isósceles.");
        }
        else{
            System.out.println("O triangulo é escaleno.");
        }
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        while (true){
            a = entrada(scanner, "a");
            b = entrada(scanner, "b");
            c = entrada(scanner, "c");
            if (validacao(a, b, c)){
                resultado(a, b, c);
                break;
            }
            else{
                System.out.println("Os valores informados nao formam um triangulo. Tente novamente.");
            }
        }
    }
}