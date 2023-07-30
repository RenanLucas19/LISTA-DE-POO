package Questao29;
/*Crie uma classe chamada Fatura para que uma loja de suprimentos de informática a
utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as seguintes informações sobre o item vendido: o número de identificação, a descrição, a
quantidade comprada e o preço unitário. Se a quantidade não for positiva, ela deve ser
configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como
0.0. Forneça também um método chamado calculaT otal que calcula e retorna o valor de
fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste
que demonstre as capacidades da classe criada */


public class FaturaDemo {

String identificacao;
String descricao;
int qtd_comprada;
double preco;


void Identificacao(String identificacao){

this.identificacao = identificacao;

    }

void Descricao(String descricao){

    this.descricao = descricao;

    }

void QtdComprada(int qtd_comprada){

    if( this.qtd_comprada < 0){
        this.qtd_comprada = 0;
    }else{
        this.qtd_comprada = qtd_comprada;
    }

   }

void Preco(double preco){

    if( this.preco < 0){
        this.preco = 0;
    }else{
        this.preco = preco;
    }

  }

double CalculaTotal(){

return Math.max(0, this.preco * this.qtd_comprada);

    }
}

