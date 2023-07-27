import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int C, D, U, numero;

        System.out.printf("Escreva um numero: \t");
        numero = entrada.nextInt();

        C = (numero / 100);
        D = ((numero % 100)/10);
        U = ((numero%100) - 10 *((numero % 100)/10));
        System.out.printf(+ U +"");
        System.out.printf(+ D +"");
        System.out.printf(+ C +"\n");
        
        entrada.close();

    }
}
