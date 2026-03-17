/*17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius.
Imprima na tela as duas temperaturas.Fórmula: C = (5 * ( F-32) / 9) */

package exercicio17;

import java.util.Scanner;

public class Exercicio17 {
    public static double entrada (Scanner scanner){
        System.out.println("Insira uma temperatura em fahrenheit: ");
        while (!scanner.hasNextDouble()){
            System.out.println("Digite um valor válido.");
            scanner.next();
            System.out.println("Insira uma temperatura em fahrenheit: ");
        }
        return scanner.nextDouble();
    }
    public static double formulaparacelsius (double temperatura){
        double celsius;
        celsius = (5*(temperatura - 32)/9);
        return celsius;
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double fahrenheit = entrada(scanner);
        double celsius = formulaparacelsius(fahrenheit);

        System.out.printf("Temperatura em fahrenheit é: %.2f\n", fahrenheit);
        System.out.printf("Temperatura em celsius é: %.2f\n", celsius);
    }
}
