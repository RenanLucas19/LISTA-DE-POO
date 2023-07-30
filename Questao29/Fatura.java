package Questao29;
/*Crie uma classe chamada Fatura para que uma loja de suprimentos de informática a
utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as seguintes informações sobre o item vendido: o número de identificação, a descrição, a
quantidade comprada e o preço unitário. Se a quantidade não for positiva, ela deve ser
configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como
0.0. Forneça também um método chamado calculaT otal que calcula e retorna o valor de
fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste
que demonstre as capacidades da classe criada */


public class Fatura {

public static void main(String args[]){

    FaturaDemo fatura = new FaturaDemo();

    fatura.identificacao = "135";
    fatura.descricao = "Arroz";
    fatura.qtd_comprada = 6;
    fatura.preco = 5;

    System.out.println("O numero de identificaco : " + fatura.identificacao);

    System.out.println("A descricao do produto : " + fatura.descricao);

    System.out.println("A quantidade comprada : " + fatura.qtd_comprada);

    System.out.println("O preco do produto : R$ " + fatura.preco);

    System.out.println("A fatura total : R$ " + fatura.CalculaTotal());
    }
}
