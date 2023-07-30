/*30. Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina da
Ufersa. Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula,
nome, 2 notas de prova e 1 nota de trabalho. Escreva os seguintes métodos para esta
classe:
• media: calcula a média final do aluno (cada prova tem peso 2, 5 e o trabalho tem
peso 2)
• provaF inal: calcula quanto o aluno precisa para a prova final (retorna zero se ele
não for para a final)
Escreva um aplicativo de teste que demonstre as capacidades da classe criada. */

package Questao30;

public class UfersaDemo {
    int matricula;
    String nome;
    double notaP1, notaP2, notaT;
    double media, ProvaF;

    void Matricula(int matricula){

        this.matricula = matricula;

    }

    void Nome(String nome){

    this.nome = nome;

    }

    void NotaP(double notaP1, double notaP2 , double notaT){


        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaT = notaT ;

    }

    double Media(){

    this.media = ((this.notaP1 + this.notaP2) * 2.5 + this.notaT * 2) / 7;

    return this.media;

    }

    double ProvaFinal(){

    this.ProvaF = this.Media();
    if(this.ProvaF < 5 || this.ProvaF >=7){
        System.out.println("O aluno nao pode fazer a quarta prova !!!");

        return 0;
    }
        System.out.println("O aluno pode ir para quarta prova!!!");
        return this.ProvaF;
    }
}
