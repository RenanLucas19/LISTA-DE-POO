import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;

        System.out.print("Escreva o valor do lado de um quadrado para ser calculado sua area: ");
        x = entrada.nextInt();

        System.out.print("A area desse quadrado e: " + x*x + "\n");

        entrada.close();
        
    }
}
