
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

public class Ufersa {
    public static void main (String[]args){
        UfersaDemo ufersa = new UfersaDemo();

        ufersa.notaP1 = 2.0f;
        ufersa.notaP2 = 3.0f;
        ufersa.notaT = 2.0f;
        
        System.out.println("A nota da primeira prova : " + ufersa.notaP1);
        System.out.println("A nota da segunda prova : " + ufersa.notaP2);
        System.out.println("A nota do trabalho : " + ufersa.notaT);
        System.out.println("A media do aluno : " + ufersa.Media());
        System.out.println("A media final do aluno : " + ufersa.ProvaFinal());

        

    }
}
