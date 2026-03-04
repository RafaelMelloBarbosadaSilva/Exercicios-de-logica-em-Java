/* 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,  */

package exercicio03;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float notaparcial = entrada.nextFloat();
        if (notaparcial >= 60) {
            System.out.println("Vc passou!");
            entrada.close();
        } else {
            float NFA = entrada.nextFloat();
            NFA = (NFA + notaparcial)/2;
            if (NFA >= 50) {
                System.out.println("Voce passou!!!");
                entrada.close();
            } else
                System.out.println("Voce nao passou ;-;");
            entrada.close();
        }
    }
}
