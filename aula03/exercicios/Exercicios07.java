package exercicios;

import java.util.Scanner;

public class Exercicios07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double mediaAluno, mediaTurma, mediaGeral;
        final int QTD_ALUNOS = 3; 
        final int QTD_TURMAS = 2; 
        mediaGeral =0;

        for (int turma = 1; turma <= QTD_TURMAS; turma++) {
            System.out.println("Turma " + turma);

            mediaTurma = 0;

            for (int aluno = 1; aluno <= QTD_ALUNOS; aluno++) {
            System.out.printf( "Digite a média do aluno %d: ", aluno);
            mediaAluno = teclado.nextDouble();
            mediaTurma = mediaTurma + mediaAluno;         
            }
            mediaTurma = mediaTurma / QTD_ALUNOS;
            System.out.printf("Média da turma %d = %5.2f\n", turma, mediaTurma);
            mediaGeral = mediaGeral + mediaTurma;
            }
    mediaGeral = mediaGeral / QTD_TURMAS;
    System.out.printf("Média geral = %.2f\n" , mediaGeral);
    teclado.close();
        }
        
    }

