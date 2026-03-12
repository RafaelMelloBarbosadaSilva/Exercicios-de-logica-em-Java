/* 15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa
ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
(Ex: 5 anos, 2 meses e 15 dias de vida) */

package exercicio15;

import java.util.Scanner;
import java.time.LocalDate;

public class Exercicio15 {

    public static int entrada(String mensagem, Scanner scanner){
        System.out.println(mensagem);

        while(!scanner.hasNextInt()){
            System.out.println("Digite um valor válido");
            scanner.next();
            System.out.println(mensagem);
        }

        return scanner.nextInt();
    }

    public static void viveu(int diaN, int mesN, int anoN){

        LocalDate hoje = LocalDate.now();

        int diaAtual = hoje.getDayOfMonth();
        int mesAtual = hoje.getMonthValue();
        int anoAtual = hoje.getYear();

        int nascimento = anoN * 365 + mesN * 30 + diaN;
        int atual = anoAtual * 365 + mesAtual * 30 + diaAtual;

        int totalDias = atual - nascimento;

        int anos = totalDias / 365;
        int meses = (totalDias % 365) / 30;
        int dias = (totalDias % 365) % 30;

        System.out.println("Você viveu: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int dia = entrada("Digite o dia que você nasceu:", scanner);
        int mes = entrada("Digite o mês que você nasceu:", scanner);
        int ano = entrada("Digite o ano que você nasceu:", scanner);

        viveu(dia, mes, ano);
    }
}