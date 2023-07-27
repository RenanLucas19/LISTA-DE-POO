import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.printf("Escreva um dia de 1 a 28 do mes de fevereiro de 2015.\n");
        x = entrada.nextInt();

        switch(x % 7) {
            case 1:
                System.out.printf("O dia " + x + " sera uma Domingo.\n"); 
            break;
            case 2:
                System.out.printf("O dia " + x + " sera uma Segunda.\n"); 
            break;
            case 3:
                System.out.printf("O dia " + x + " sera uma Terca.\n"); 
            break;
            case 4:
                System.out.printf("O dia " + x + " sera uma Quarta.\n"); 
            break;
            case 5:
                System.out.printf("O dia " + x + " sera uma Quinta.\n"); 
            break;
            case 6:
                System.out.printf("O dia " + x + " sera uma Sexta.\n"); 
            break;
            case 0:
                System.out.printf("O dia " + x + " sera uma Sabado.\n"); 
            break;

        }

        entrada.close();
    }
}
