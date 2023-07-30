/*2. Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3
valores reais serão informados pelo usuário.
/* */

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Float x1, x2, x3;

        System.out.print("Escreva 3 notas para que seja calculado sua media.\n");
        x1 = entrada.nextFloat();
        x2 = entrada.nextFloat();
        x3 = entrada.nextFloat();

         System.out.print("Sua media e: " + (x1+x2+x3)/3 + "\n");   

        entrada.close();

    }
}