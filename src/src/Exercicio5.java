/*Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).*/

import java.util.Scanner;

public class Exercicio5 {
    static double salariomin = 1293.20;

    public static double salario(Scanner scanner){
        System.out.println("Digite seu salário");
        while (!scanner.hasNextDouble()) {
            System.out.println("Insira um valor válido.");
            scanner.next();
            System.out.println("Digite seu sálario");
        }
        return scanner.nextDouble();
    }

    public static double calculo(double entrada){
        return entrada/salariomin;
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double entrada = salario(scanner);
        entrada = calculo(entrada);
        System.out.printf("Vc recebe: %.3f Salarios mínimos%n", entrada);
    }
}
