import java.util.Scanner;

public class ExercicioTriangulos {
		public static void main(String args[]  ) { 
			
		Scanner pega = new Scanner(System.in);
		double ladoA = 0, ladoB = 0, ladoC = 0;
		
		System.out.println("Digite o valor do primeiro lado do tri�ngulo");
		ladoA = pega.nextDouble();
		
		System.out.println("Digite o valor do segundo lado do tri�ngulo");
		ladoA = pega.nextDouble();
		
		System.out.println("Digite o valor do terceiro lado do tri�ngulo");
		ladoA = pega.nextDouble();
		
		if(ladoA == ladoB && ladoA == ladoC) { 
			System.out.println("O Triangulo � equil�tero");
		}
		else if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
			System.out.println("O triangulo � escaleno");
		}
		else {
			System.out.println("O triagulo � is�sceles");
			
		}
		pega.close();
		 
		
		
		
		
		}

}
