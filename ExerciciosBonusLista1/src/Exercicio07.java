import java.util.Scanner;

public class Exercicio07 {

	public static void main(String args[]) {

		/*
		 * 7 � No parque Valter Dino World, os clientes podem ter a chance de passar uma
		 * noite no castelo da princesa Javarella. Para isso, devem acertar quantos
		 * feij�es est�o em um jarro (1238). Fa�a um programa que solicite a digita��o
		 * da quantidade de feij�es at� que um cliente acerte.
		 * 
		 */
		int feijao = 1238;
		int tentativaFeijao = 0;
		
		Scanner pega = new Scanner(System.in);
		System.out.println(
				"Para conquistar o passeio voc� tera a dificil miss�o de acertar quantos feij�es tem no jarro." + "\n Digite sua tentativa: ");
		
		tentativaFeijao = pega.nextInt();
		
		while(feijao != tentativaFeijao) {
			System.out.println("Voce Errou! \n Tenta novamente");
			
			System.out.println("Digite sua tentativa: ");
			tentativaFeijao = pega.nextInt();
			
			
		}
		System.out.println("------PARABENS VOC� ACERTOU!------ \n No Jarro tem 1238");

	}
}				