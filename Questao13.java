/* 13. Escreva um programa para imprimir uma versão aproximada de um cartão da Mega-Sena
(somente com os números, respeitando o número de linhas e a distribuição dos números
nas linhas). */

public class Questao13 {
    public static void main(String[] args) {
        
        int m[][] = new int[6][10];
        int x = 1;

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 10; j++){
                 m[i][j] = x++;
            }
            System.out.printf("\n");
         }


        for(int i = 0; i < 6; i++){
           for(int j = 0; j < 10; j++){
                System.out.printf("|" + m[i][j] + "|" + "\t ");
           }
           System.out.printf("\n");
        }
        
    }
}
