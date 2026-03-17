/* 18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Sara seja maior que Francisco. */

package exercicio18;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args){
        double alturaFrancisco = 1.5;
        double alturaSara = 1.1;
        int anos = 0;

        while (alturaFrancisco > alturaSara){
            alturaFrancisco += 0.02;
            alturaSara += 0.03;
            anos += 1;
        }

        System.out.println("Serão necessário: "+ anos + " anos para que Sara seja maior que Francisco");
    }
}
