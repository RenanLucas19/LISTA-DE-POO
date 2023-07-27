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
