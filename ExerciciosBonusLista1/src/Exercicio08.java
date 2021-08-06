import java.util.Scanner;

public class Exercicio08 {

	public static void main(String args[]) {

		/*
		 * 8 – Um professor quer saber quantos alunos de uma sala de 50 tiveram nota
		 * maior do que a média. Faça um programa onde o professor informe a média e as
		 * notas de cada um dos 50 alunos e, ao final, seja exibido quantos alunos
		 * tiveram nota superior à média e quantos tiveram nota inferior à média.
		 *
		 */
		
		// variaveis
		int acimaMedia = 0, abaixoMedia = 0;
		int alunos = 6; // Alunos Total na clase.
		int notaMedia = 0, somaMedia = 0;

		// vetores
		int vMediaSuper[] = new int[alunos];
		int vMediaInfer[] = new int[alunos];
		int vAluno[] = new int[alunos];

		Scanner pega = new Scanner(System.in);

		// Pegas as notas dos aluno é soma a media nota classe.
		for (int cont = 1; cont < alunos; cont++) {

			System.out.println("Digite nota do aluno  " + cont);
			vAluno[cont] = pega.nextInt();
			somaMedia = somaMedia + vAluno[cont];
		}

		// faz a soma da media é mostra a media.
		notaMedia = somaMedia / (alunos - 1);

		// faz a divisão de alunos aprovado.
		for (int cont = 1; cont < alunos; cont++) {

			if (vAluno[cont] >= notaMedia) {

				acimaMedia++;
				vMediaSuper[cont] = vAluno[cont];

			} else {

				abaixoMedia++;
				vMediaInfer[cont] = vAluno[cont];

			}

		}

		System.out.println("Nota Media dos Aluno: " + notaMedia);
		System.out.println("Quantos Alunos ficou Acima Media: " + acimaMedia);
		System.out.println("Quantos Alunos ficou abaixo Media: " + abaixoMedia);

		for (int cont = 1; cont < alunos; cont++) {

			if (vMediaSuper[cont] == 0) {

			} else {
				System.out.println(
						"Alunos Nota Superiores - Numero da Chamado: " + cont + " Nota:  " + vMediaSuper[cont]);
			}

			if (vMediaInfer[cont] == 0) {

			} else {
				System.out
						.println("Alunos Nota Inferiores - Numero da Chamada: " + cont + " Nota: " + vMediaInfer[cont]);
			}

		}

	}

}
