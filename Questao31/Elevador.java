/* 31. Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), o total de
andares no prédio (desconsiderando o térreo), a capacidade do elevador e quantas pessoas estão presentes nele. Outras classes não devem ter acesso direto aos atributos de
Elevador. A classe deve também disponibilizar os seguintes métodos:
• construtor : que deve receber como parâmetros a capacidade do elevador e o total
de andares no prédio (um elevador sempre começa no térreo e vazio);
• entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
houver espaço);
• sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
• sobe : para subir um andar (não deve subir se já estiver no último andar);
• desce : para descer um andar (não deve descer se já estiver no térreo).
Escreva um aplicativo de teste que demonstre as capacidades da classe criada, ou seja,
execute todos os métodos da classe */

package Questao31;


public class Elevador {
    int andarAtual;
    int totaldeAndar ;
    int pessoa;
    private int capacidade;


    public void setCapacidade(int capacidade){
        this.capacidade = capacidade ;

    }

    public int getCapacidade(){
        return capacidade;
    }

    void andarAtual( int andarAtual){

        this.andarAtual = andarAtual;
    }

    void totaldeAndar( int totaldeAndar){

        this.totaldeAndar = totaldeAndar;
    }

    void construtor(){

        this.capacidade = 10;
        this.totaldeAndar = 15;
        
        System.out.println("A capacidade de pessoas no elevador e : " + this.capacidade);
        System.out.println("O total de andares no predio: " + this.totaldeAndar);
        
        
    }

    void pessoa(int pessoa){

        this.pessoa = pessoa;

    }

    void entra(){

    
    if(this.pessoa < this.capacidade ){
        this.pessoa +=1;
      System.out.println("Pessoa entrou no elevador !");
    }else{
        System.out.println("Nao tem vaga no elevador !");
      }

    }

    public void sai(){

        if(this.pessoa > 0){
            this.pessoa -= 1;
            System.out.println("uma pessoa saiu do elevador !");
        }else{

            System.out.println(" Nao tem ninguem no elevador !");

        }

    }

    public void sobe(){
        if(this.andarAtual < this.totaldeAndar){

            this.andarAtual +=1;
            System.out.println("O elevador esta subindo ! ");
        }else{
            System.out.println("O elevador ja esta no ultimo andar do predio !");
        }


    }

    public void desce(){
        if(this.andarAtual > 0){
            this.andarAtual +=1;
            System.out.println("O elevador esta descendo !");
        }else{
            System.out.println("O elevador ja esta no terreo, nao pode descer mais !");
        }
    }


}

