/* 21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100. */

package exercicio21;

import java.util.Random;

public class Exercicio21 {
    public static void main (String[] args){
        Random random = new Random();
        int numero = random.nextInt(101);
        System.out.println(numero);
    }
}
