/* 22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles. */

package exercicio22;

import java.util.Scanner;

public class Exercicio22 {
    public static int entrada (Scanner scanner){
        System.out.println("Digite um valor inteiro");

        while (!scanner.hasNextInt()){
            System.out.println("Digite um valor válido");
            scanner.next();
            System.out.println("Digite um valor inteiro");
        }
        return scanner.nextInt();
    }
    public static void conta (int a, int b){
        int quociente = a / b;
        int resto = a % b;

        System.out.println("quociente: " + quociente);
        System.out.print("resto: " + resto);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = entrada(scanner);
        int b = entrada(scanner);

        conta(a, b);
    }
}
