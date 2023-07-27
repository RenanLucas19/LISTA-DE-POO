import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float x;

        System.out.printf("Escreva uma temperatura em graus centigrados e converta para fahrenheit.\n");
        x = entrada.nextFloat();

        System.out.printf("Essa temperatura em Fahrenheit e: " + ((x*1.8)+32) + "\n");

        entrada.close();

    }
}
