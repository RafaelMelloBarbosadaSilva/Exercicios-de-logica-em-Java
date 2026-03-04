/* 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo. */

package exercicio02;

public static void main(String[] args) {
        Scanner Valor_entrada = new Scanner(System.in);

        float float1 = Valor_entrada.nextFloat();
        float float2 = Valor_entrada.nextFloat();
        float float3 = Valor_entrada.nextFloat();
        Valor_entrada.close();

        float media, total;

        total = (float1 + float2 + float3);
        media = (float1 + float2 + float3) / 3;

        System.out.println("A media foi de: " + media);
        System.out.println("O total foi de: " + total);
}
