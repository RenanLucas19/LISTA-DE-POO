import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        int cidadeA = 7000, cidadeB = 20000;
        int contagem=0;
        while(cidadeA != cidadeB){
            cidadeA += (cidadeA * 0.965);
            cidadeB += (cidadeB * 0.990);

            contagem++;
        }

        System.out.printf("Em " + contagem + " anos essas cidades terao o mesmo numero de habitantes.");

        entrada.close();
    }

}
