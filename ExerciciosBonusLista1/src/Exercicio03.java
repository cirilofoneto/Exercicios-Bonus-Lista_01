import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * 
		 * Solicite ao usu�rio a digita��o de 2 n�meros inteiros, nas vari�veis A e B.
		 * 
		 * Sem usar uma terceira vari�vel, troque os valores de A e B entre si.
		 */

		int numeroA = 0;
		int numeroB = 0;

		Scanner pega = new Scanner(System.in);

		System.out.println("Digite numero A:");
		numeroA = pega.nextInt();
		System.out.println("Digite numero B:");
		numeroB = pega.nextInt();

		System.out.println("Numero A: " + numeroA);
		System.out.println("Numero B: " + numeroB);

		System.out.println("----- Ap�s a troca -----");

		System.out.println("Numero A: " + numeroB);
		System.out.println("Numero B: " + numeroA);

		pega.close();

	}

}
