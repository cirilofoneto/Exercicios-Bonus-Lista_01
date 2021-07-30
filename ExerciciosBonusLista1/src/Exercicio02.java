import java.util.Scanner;

public class Exercicio02 {

	public static void main(String args[]) {

		/*
		 * Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos,
		 * 
		 * solicite ao usuário que digite o tempo de um filme em minutos e informe a
		 * 
		 * duração desse filme em horas e em segundos.
		 */

		Scanner pega = new Scanner(System.in);

		int tempoFilme = 0;
		int horaFilme = 0, minutoFilme = 0, segundoFilme = 0;

		System.out.println("Digite o tempo do filme em minutos");

		tempoFilme = pega.nextInt();

		horaFilme = tempoFilme / 60;
		minutoFilme = tempoFilme % 60; // Usando MOD para pega a sobra da Divisão.
		segundoFilme = tempoFilme * 60;

		System.out.println("Tempo de duração do filme vai ser: " + horaFilme + " Hora é: " + minutoFilme + " Minutos");
		System.out.println("Duração de filme em Segundos: " + segundoFilme);

		pega.close();

	}
}