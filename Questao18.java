/*Crie uma função recursiva potencia(base,expoente) que, quando chamado, retorna baseexpoente
.
Por exemplo, potencia(3,4) deve ser implementado como 3 ∗ 3 ∗ 3 ∗ 3. (A saída é apenas
81 nesse exemplo) */


import java.util.Scanner;

public class Questao18 {

    public static void main (String[] args){
    int base, expoente, pot;
    
    Scanner ent = new Scanner(System.in);
    System.out.print("Escreva o numero da base: ");
    base = ent.nextInt();
    System.out.print("Escreva o numero do expoente: ");
    expoente = ent.nextInt();

    pot = potencia(base, expoente);

    System.out.print("A base e : " + base + " o expoente e : " + expoente + " o resultado da potencia e :" + pot );

    }

    public static int potencia(int base, int expoente){

    int resultado;
    resultado = (int) Math.pow(base, expoente);
    
    return resultado;


    }


    
}
