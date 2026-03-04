/*9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima
na tela sua condição de acordo com a tabela abaixo:
Fórmula do IMC = peso / (altura) ²
Tabela Condições IMC
Abaixo de 18,5   | Abaixo do peso
Entre 18,6 e 24,9 | Peso ideal (parabéns)
Entre 25,0 e 29,9 | Levemente acima do peso
Entre 30,0 e 34,9 | Obesidade grau I
Entre 35,0 e 39,9 | Obesidade grau II (severa)
Maior ou igual a 40 | Obesidade grau III (mórbida) */

package exercicio09;

import java.util.Scanner;

public class Exercicio9 {
    public static double entrada1 (Scanner scanner){
        System.out.println("Insira seu peso: ");

        while(!scanner.hasNextDouble()){
            System.out.println("Insira um valor válido.");
            scanner.next();
            System.out.println("Insira seu peso:");
        }
        return scanner.nextDouble();
    }
    public static double entrada2 (Scanner scanner){
        System.out.println("Insira sua altura: ");

        while(!scanner.hasNextDouble()){
            System.out.println("Insira um valor válido.");
            scanner.next();
            System.out.println("Insira sua altura:");
        }
        return scanner.nextDouble();
    }
    public static void imc(double peso, double altura){
        double aux;

        aux = (peso / (altura * altura));

        if (aux < 18.5){
            System.out.println("Abaixo do peso");
        } else if (aux >= 18.5 && aux <25) {
            System.out.println("peso ideal");
        } else if (aux >= 25 && aux < 30){
            System.out.println("levemente acima do peso");
        } else if (aux >= 30 && aux < 35) {
            System.out.println("Obesidade grau 1");
        } else if (aux >= 35 && aux < 40) {
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3/ Mórbida");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double peso = entrada1(scanner);
        double altura = entrada2(scanner);

        imc(peso, altura);
    }
}
