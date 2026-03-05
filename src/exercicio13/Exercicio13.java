/* 13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.  */

package exercicio13;

import java.util.Scanner;

public class Exercicio13 {
    public static String name (Scanner scanner){
        String nome;

        while (true){
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();

            if (nome.isEmpty()){
                System.out.println("O nome não pode estar vazio");
                continue;
            }

            return nome;
        }
    }
    public static int age (Scanner scanner){
        System.out.println("Digite sua idade: ");

        while (!scanner.hasNextInt()){
            System.out.println("Digite um valor válido");
            scanner.next();
            System.out.println("Digite sua idade: ");
        }
        return scanner.nextInt();
    }
    public static void resultado (String nome, int idade){
        if (idade >= 18){
            System.out.println("Seu nome é " + nome + " e sua idade é " + idade + ", você é maior de idade");
        }
        else {
            System.out.println("Seu nome é " + nome + " e sua idade é " + idade + ", você é menor de idade");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String nome = name(scanner);
        int idade = age(scanner);

        resultado(nome, idade);
    }
}
