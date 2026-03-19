/*23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão:
valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
Salário de Contribuição (R$)
Até R$1.621,00 = 7,5%
De R$1.621,01 até R$ 2.902,84 = 9%
De R$2.902,85 até R$4.354,27 = 12%
De R$4.354,28 até R$8.475,55 = 14%*/

package exercicio23;

import java.util.Scanner;

public class Exercicio23 {
    public static double horas (Scanner scanner){
        double valor;

        System.out.println("Digite o valor da hora de sua aula: ");

        while (true) {
            while(!scanner.hasNextDouble()){
                System.out.println("Digite um valor válido.");
                scanner.next();
                System.out.println("Digite o valor da hora de sua aula: ");
            }

            valor = scanner.nextDouble();

            if (valor > 0) {
                break;
            } else {
                System.out.println("O valor deve ser maior que 0.");
            }
        }

        return valor;
    }
    public static int num (Scanner scanner){
        int valor;

        System.out.println("Digite o numero de aulas: ");

        while (true) {
            while (!scanner.hasNextDouble()) {
                System.out.println("Digite um valor válido.");
                scanner.next();
                System.out.println("Digite o numero de aulas: ");
            }

            valor = scanner.nextInt();

            if (valor >0){
                break;
            } else {
                System.out.println("O valor deve ser maior que 0.");
            }
        }
        return valor;
    }
    public static double salario (double valoraulas, int numaulas){
        double total = valoraulas * numaulas;

        if (total <= 1621){
            total = total * 0.925;
        } else if (total > 1621 && total <= 2902.84) {
            total = total * 0.91;
        } else if (total > 2902.84 && total <= 4354.27) {
            total = total * 0.88;
        } else {
            total = total * 0.86;
        }

        return total;
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double valoraulas = horas(scanner);
        int numaulas = num(scanner);
        double total = salario(valoraulas, numaulas);

        System.out.printf("O valor líquido total sera de: %.2f\n", total);

    }
}
