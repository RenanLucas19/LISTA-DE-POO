import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x1, x2, x3;

        System.out.printf("Escreva 3 numeros inteiros: ");
        x1 = entrada.nextInt();
        x2 = entrada.nextInt();
        x3 = entrada.nextInt();
        
        if((x1 < x2) && (x1 < x3)){
            System.out.printf("\nO menor numero e: "+ x1 +"\n");
        } else if((x2 < x1) && (x2 < x3)){
            System.out.printf("\nO menor numero e: "+ x2 +"\n");
        } else if((x3 < x2) && (x3 < x1)){
            System.out.printf("\nO menor numero e: "+ x3 +"\n");
        }

        entrada.close();

    }
}
