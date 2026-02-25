// Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class Exercicio4 {
    public static int lernumero(Scanner scanner){
        System.out.println("Insira um numero inteiro");
        while (!scanner.hasNextInt()){
            System.out.println("Valor inválido");
            scanner.next();
            System.out.println("Insira um numero inteiro");
        }
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada = lernumero(scanner);
        System.out.println("Antecessor: " + (entrada - 1));
        System.out.println("Sucessor: " + (entrada + 1));
    }
}
