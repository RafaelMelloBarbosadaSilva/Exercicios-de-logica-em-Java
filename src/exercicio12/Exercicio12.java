/*12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de
condições de pagamento para efetuar o cálculo adequado.
Tabela de Código de Condições de Pagamento
1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
2 - À Vista no cartão de crédito, recebe 10% de desconto
3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10% */

package exercicio12;

import java.util.Scanner;

public class Exercicio12 {
    public static double valorProduto(Scanner scanner) {
        System.out.println("Insira o valor do produto: ");

        while (!scanner.hasNextDouble()) {
            System.out.println("Insira um valor válido");
            scanner.next();
            System.out.println("Insira o valor do produto: ");
        }
        return scanner.nextDouble();
    }

    public static String pagamento(Scanner scanner) {
        String formapag;

        while (true) {
            System.out.println("Insira a forma de pagamento");
            System.out.println("Dinheiro, Cartão ou pix");
            formapag = scanner.nextLine();

            if (formapag.isEmpty()) {
                System.out.println("forma de pagamento não pode estar vazio.");
                continue;
            }

            if (!formapag.equalsIgnoreCase("dinheiro") && !formapag.equalsIgnoreCase("cartao") && !formapag.equalsIgnoreCase("pix")) {
                System.out.println("Insira uma forma de pagamento válida");
                continue;
            }

            return formapag;
        }
    }

    public static String cartaovalid(Scanner scanner) {
        String cartao;

        while (true) {
            System.out.println("Crédito ou Débito");
            cartao = scanner.nextLine();
            if (cartao.isEmpty()) {
                System.out.println("Cartao nao pode estar vazio.");
                continue;
            }
            if (!cartao.equalsIgnoreCase("credito") && !cartao.equalsIgnoreCase("debito")) {
                System.out.println("Insira um cartão válido");
                continue;
            }
            return cartao;
        }
    }

    public static int parcelamento(Scanner scanner) {
        String parc; // variavel auxiliar para parcelamento
        int aux; // variavel auxiliar

        while (true) {
            System.out.println("A vista ou parcelado");
            parc = scanner.nextLine();
            if (parc.isEmpty()) {
                System.out.println("nao pode estar vazio.");
                continue;
            }
            if (!parc.equalsIgnoreCase("A vista") && !parc.equalsIgnoreCase("Parcelado")) {
                System.out.println("Insira corretamente");
                continue;
            }
            if (parc.equalsIgnoreCase("Parcelado")) {
                System.out.println("em quantas vezes?:");

                while (true) {
                    System.out.println("Insira em quantas vezes será parcelado: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Digite um número válido.");
                        scanner.next();
                        continue;
                    }

                    aux = scanner.nextInt();

                    if (aux >= 2) {
                        break;
                    }

                    System.out.println("O parcelamento deve ser no mínimo 2 vezes.");
                }
                if (aux == 2) {
                    return 2;
                } else return 3;
            }
            return 1; // a vista
        }
    }

    public static void resultado (int res, double valor){
        if (res == 0){
            valor = valor * 0.85;
            System.out.printf("À Vista em Dinheiro ou Pix, recebe 15%% de desconto, seu produto vai custar: R$ %.2f%n", valor);
        } else if (res == 1) {
            valor = valor * 0.9;
            System.out.printf("À Vista no cartão de crédito, recebe 10%% de desconto: R$ %.2f%n", valor);
        } else if (res == 2) {
            System.out.println("Parcelado no cartão em duas vezes, preço normal do produto sem juros: " + valor + "R$");
        } else if (res == 3) {
            valor = valor * 1.1;
            System.out.printf("Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%%: R$ %.2f%n", valor);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = valorProduto(scanner);
        scanner.nextLine();
        String tipocartao;

        String formapag = pagamento(scanner);
        int res = 0;

        if (formapag.equalsIgnoreCase("cartao")) {
            tipocartao = cartaovalid(scanner);
        }
        if (formapag.equalsIgnoreCase("cartao")) {
            res = parcelamento(scanner);
        }
        resultado(res, valor);
    }
}