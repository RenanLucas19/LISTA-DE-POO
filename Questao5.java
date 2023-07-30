/*5. Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena,
Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma
variável de tipo inteiro. Por fim, reescreva o número no formato UCD. Exemplo: 123 deve
ser reescrito como 312. */

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int C, D, U, numero;

        System.out.printf("Escreva um numero: \t");
        numero = entrada.nextInt();

        C = (numero / 100);
        D = ((numero % 100)/10);
        U = ((numero%100) - 10 *((numero % 100)/10));
        System.out.printf(+ U +"");
        System.out.printf(+ D +"");
        System.out.printf(+ C +"\n");
        
        entrada.close();

    }
}
