import java.util.Scanner;

public class Exercício1 {
    public static double lervalor(Scanner scanner, String nome){
        System.out.println("Digite o valor de " + nome);

        while (!scanner.hasNextDouble()) {
            System.out.println("Insira um valor válido");
            scanner.next();
            System.out.println("Digite o valor de " + nome);
        }
        return scanner.nextDouble();
    }
    public static double calcularsoma(double valor1, double valor2){

        return valor1 + valor2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = lervalor(scanner, "A");
        double B = lervalor(scanner, "B");
        double C = lervalor(scanner, "C");

        double soma = calcularsoma(A, B);

        System.out.println("a soma de A + B e de " + soma);

        if (soma < C){
            System.out.println("a soma e menor que C");
        }
        else
            System.out.println("a soma nao e menor que C");
    }
}
// 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.