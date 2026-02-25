//Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import java.util.Scanner;

public class Exercicio6 {
    public static double lervalor(Scanner scanner){
        System.out.println("Digite um valor qualquer: ");
        while (!scanner.hasNextDouble()){
            System.out.println("valor invalido");
            scanner.next();
            System.out.println("Digite um valor qualquer: ");
        }
        return scanner.nextDouble();
    }
    public static double reajuste(double valor){
        return (valor * 1.05);
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double entrada = lervalor(scanner);
        double resultado = reajuste(entrada);
        System.out.println("A entrada com reajuste de 5% fica " + resultado);
    }
}
