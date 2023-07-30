/* 8. Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em
dois setores:
• No setor de Eletros, que possui código 222, todas as peças que custam mais de R$
500 vão ter 10% de desconto.
• No setor de Cama, mesa e banho, que possui código 111, peças com valor acima
de R$ 100 vão ter 40% de desconto, peças que custam entre R$ 50 e R$ 100 vão ter
20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto.
Escreva um programa que recebe do usuário o código do setor da loja e o valor original de
um produto e imprime na tela o nome do setor e o valor do produto com desconto. Caso
o usuário forneça um código diferente de 111 ou 222, exiba a mensagem Setor Invalido. */

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y;
        System.out.printf("Escreva qual setor voce deseja acessar.\n\n 111 Cama, mesa e banho.\n 222 Eletros.\n\n");
        x = entrada.nextInt();

        if(x == 111){

            System.out.printf("Qual o valor da sua compra?\n");
            y = entrada.nextInt();

            if(y > 100){
                System.out.printf("\nVoce esta no setor 111 e o valor final da sua compra e de R$" + (y * 0.6) + "\n");
            }else if((100 <= y) && (y >= 50)){
                System.out.printf("\nVoce esta no setor 111 e o valor final da sua compra e de R$" + (y * 0.8) + "\n");
            }else if(y < 50){
                System.out.printf("\nVoce esta no setor 111 e o valor final da sua compra e de R$" + (y * 0.9) + "\n");
            }


        }else if(x == 222){

            System.out.printf("\nQual o valor da sua compra?\n");
            y = entrada.nextInt();

            if(y > 500){
                System.out.printf("\nVoce esta no setor 222 e o valor final da sua compra e de R$" + (y * 0.9) + "\n");
            }else if(y < 500){
                System.out.printf("\nVoce esta no setor 222 e o valor final da sua compra e de R$" + y + "\n");
            }
            
        }else if((111 != x) && (x != 222)){
            System.out.printf("Setor invalido.\n");
        }

    entrada.close();

    }
}
