import java.util.Scanner;

public class Exercicio07 {

	public static void main(String args[]) {

		/*
		 * 7 – No parque Valter Dino World, os clientes podem ter a chance de passar uma
		 * noite no castelo da princesa Javarella. Para isso, devem acertar quantos
		 * feijões estão em um jarro (1238). Faça um programa que solicite a digitação
		 * da quantidade de feijões até que um cliente acerte.
		 * 
		 */
		int feijao = 1238;
		int tentativaFeijao = 0;
		
		Scanner pega = new Scanner(System.in);
		System.out.println(
				"Para conquistar o passeio você tera a dificil missão de acertar quantos feijões tem no jarro." + "\n Digite sua tentativa: ");
		
		tentativaFeijao = pega.nextInt();
		
		while(feijao != tentativaFeijao) {
			System.out.println("Voce Errou! \n Tenta novamente");
			
			System.out.println("Digite sua tentativa: ");
			tentativaFeijao = pega.nextInt();
			
			
		}
		System.out.println("------PARABENS VOCÊ ACERTOU!------ \n No Jarro tem 1238");

	}
}				