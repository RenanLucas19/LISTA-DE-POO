/* Duas cidades, A e B, têm populações de 7000 e 20000 habitantes, respectivamente. A
cidade A tem um crescimento populacional de 3, 5% ao ano, enquanto a população da
cidade B cresce 1% ao ano. Faça um programa que utilize laço(s) para calcular a quantidade
de anos necessária para que a população da cidade A seja maior ou igual a população
da cidade B. */

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        int cidadeA = 7000, cidadeB = 20000;
        int contagem=0;
        while(cidadeA != cidadeB){
            cidadeA += (cidadeA * 0.965);
            cidadeB += (cidadeB * 0.990);

            contagem++;
        }

        System.out.printf("Em " + contagem + " anos essas cidades terao o mesmo numero de habitantes.");

        entrada.close();
    }

}
