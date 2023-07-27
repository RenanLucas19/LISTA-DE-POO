import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        double x;
        System.out.printf("Escreva um angulo: \n");
        x = entrada.nextDouble();

      double x1 = Math.toRadians(x);
      
      System.out.printf("O Seno desse angulo e: " + Math.sin(x1) + "\n");
      System.out.printf("O Cosseno desse angulo e: " + Math.cos(x1) + "\n");
      System.out.printf("O Tangente desse angulo e: " + Math.tan(x1) + "\n");
      System.out.printf("O Cossecante desse angulo e: " + (1.0 / Math.sin(x1)) + "\n");
      System.out.printf("O Secante desse angulo e: " + (1.0 / Math.cos(x1)) + "\n");
      System.out.printf("O Cotangente desse angulo e: " + (1.0 / Math.tan(x1)) + "\n");

      entrada.close();

    }
}
