/* Crie uma classe denominada Elevador para armazenar as informações de um elevador
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

public class ElevadorDemo {
     public static void main(String[] args){
        Elevador elevador = new Elevador();

        elevador.andarAtual = 5;
        elevador.pessoa =  5;
        elevador.totaldeAndar = 7;
        elevador.setCapacidade(6);

        System.out.println("O andar do elevador : " + elevador.andarAtual);
        System.out.println("A quantidade de pessoas no elevador " + elevador.pessoa );
        System.out.println("O total de andares no predio: " + elevador.totaldeAndar);

        elevador.entra();
        elevador.sobe();
        elevador.desce();
        elevador.sai();





        

    
    
        
        

    


     }

}
