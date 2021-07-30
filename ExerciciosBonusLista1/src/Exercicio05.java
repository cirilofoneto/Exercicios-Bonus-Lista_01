import java.util.Scanner;

public class Exercicio05 {
		public static void main(String args[]) {

	/*
	Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor peso.
	Entre os pesos de 3 lixos informados pelo usuário, um programa deve indicar qual deles
	deve ser carregado pelo drone.
	*/
	
	Scanner pega = new Scanner(System.in); 
	
	int pocicaoVetor = 0;
	int lixo[] = new int[3]; 
	int contLixo = 1;
	int menorPeso = Integer.MAX_VALUE;

	 	for(int cont = 0; cont <3 ; cont ++) {
	 		
	 		System.out.println("Digite o Peso Lixo: " + contLixo);
	 		lixo[cont] = pega.nextInt();
	 		contLixo++;
	 	}
	 	
	 	for(int cont = 0; cont<3; cont++) {

	 		if(lixo[cont] <= menorPeso) {
	 		System.out.println("Menor Peso: " + menorPeso);
	 			menorPeso = lixo[cont];
	 			pocicaoVetor = cont;
	 		}
	 	}
	 	System.out.println("MenorPeso: " + menorPeso + " - Posição no Vetor: " +pocicaoVetor);
	 		
	}
}