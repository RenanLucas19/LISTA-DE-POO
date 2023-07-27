import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x1, x2, y1, y2;

        System.out.printf("Escreva as coordenadas de dois pontos no plano cartesiano.\nPrimeiro X e Y do primeiro ponto: ");
        x1 = entrada.nextInt();
        y1 = entrada.nextInt();

        System.out.printf("\nAgora X e Y do segundo ponto: ");
        x2 = entrada.nextInt();
        y2 = entrada.nextInt();
       
        if((y2 > y1) && (x2 > x1)){
            System.out.printf("O segundo ponto esta acima e a direta do primeiro ponto.\n");
        }else if((y2 > y1) && (x2 < x1)){
            System.out.printf("O segundo ponto esta acima e a esquerda do primeiro ponto.\n");
        }else if((y2 < y1) && (x2 > x1)){
            System.out.printf("O segundo ponto esta abaixo e a direita do primeiro ponto.\n");
        }else if((y2 < y1) && (x2 < x1)){
            System.out.printf("O segundo ponto esta abaixo e a esquerda do primeiro ponto.\n");
        }

        entrada.close();

    }
   
}
