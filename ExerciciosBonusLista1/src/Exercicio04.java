import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		/*
		 * Um rob� de combate s� deve ativar sua arma principal quando o inimigo est� a
		 * menos de 70cm de dist�ncia. Fa�a um programa onde o usu�rio informe a
		 * dist�ncia do inimigo e sejam exibidas as mensagens �ATIVADO� ou �DESATIVADO�
		 * dependendo do * status da arma.
		 */

		Scanner pega = new Scanner(System.in);

		int distancia = 0;

		System.out.println("Qual a distancia do inimigo? ");
		distancia = pega.nextInt();

		if (distancia < 70) {
			System.out.println("Arma Principal DESATIVADA!");
		}

		else {
			System.out.println("Inimigo Proximo Arma ATIVADA!");

		}

	}

}