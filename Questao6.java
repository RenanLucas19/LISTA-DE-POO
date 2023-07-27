import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;

        System.out.println("Escreva um valor inteiro que representa um intervalo em minutos. ");
        x = entrada.nextInt();

        System.out.printf("\n" + (x / 1440) + " Dias\n");
        System.out.printf(+ ((x%1440)/60) + " Horas\n");
        System.out.printf(+ x%60 + " Minutos\n");

        entrada.close();

    }
}
