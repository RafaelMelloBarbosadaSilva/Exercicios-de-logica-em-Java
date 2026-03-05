/* 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome
do aluno e se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7. */

package exercicio11;

import java.util.Scanner;

public class Exercicio11 {
    public static String entradanome(Scanner scanner) {
        String nome;

        while (true) {
            System.out.print("Digite nome do aluno: ");
            nome = scanner.nextLine();

            if (nome.isEmpty()) {
                System.out.println("Nome não pode estar vazio.");
                continue;
            }

            if (!nome.matches("[a-zA-ZÀ-ÿ ]+")) {
                System.out.println("Nome não pode conter números.");
                continue;
            }

            return nome;
        }
    }
    public static double entradanotas(Scanner scanner, String nome){
        System.out.println("Digite a " + nome + ":");

        while(!scanner.hasNextDouble()){
            System.out.println("Digite um valor válido");
            scanner.next();
            System.out.println("Digite a " + nome + ":");
        }
        return scanner.nextDouble();
    }

    public static void validacao(String aluno, double nota1, double nota2, double nota3, double nota4){
        if ((nota1 + nota2 + nota3 + nota4)/4 >= 7){
            System.out.println("O aluno " + aluno + " foi aprovado");
        }
        else {
            System.out.println("O aluno " + aluno + " não foi aprovado");
        }
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String aluno = entradanome(scanner);

        double nota1 = entradanotas(scanner, "nota1");
        double nota2 = entradanotas(scanner, "nota2");
        double nota3 = entradanotas(scanner, "nota3");
        double nota4 = entradanotas(scanner, "nota4");

        validacao(aluno, nota1, nota2, nota3, nota4);
    }
}
