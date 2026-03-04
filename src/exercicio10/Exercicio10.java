/* 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas. */

package exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static double entrada (Scanner scanner){
        System.out.println("Digite o valor:");

        while(!scanner.hasNextDouble()){
            System.out.println("Digite um valor válido");
            scanner.next();
            System.out.println("Digite o valor: ");
        }
        return scanner.nextDouble();
    }
    public static void media(double nota1, double nota2, double nota3){
        double aux = (nota1 + nota2 + nota3)/3;
        System.out.printf("Média das notas: %.2f%n", aux);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double nota1 = entrada(scanner);
        double nota2 = entrada(scanner);
        double nota3 = entrada(scanner);

        media(nota1, nota2, nota3);
    }
}
