import java.util.Scanner;

public class ExercicioTriangulos {
		public static void main(String args[]  ) { 
			
		Scanner pega = new Scanner(System.in);
		double ladoA = 0, ladoB = 0, ladoC = 0;
		
		System.out.println("Digite o valor do primeiro lado do triângulo");
		ladoA = pega.nextDouble();
		
		System.out.println("Digite o valor do segundo lado do triângulo");
		ladoA = pega.nextDouble();
		
		System.out.println("Digite o valor do terceiro lado do triângulo");
		ladoA = pega.nextDouble();
		
		if(ladoA == ladoB && ladoA == ladoC) { 
			System.out.println("O Triangulo é equilátero");
		}
		else if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
			System.out.println("O triangulo é escaleno");
		}
		else {
			System.out.println("O triagulo é isósceles");
			
		}
		pega.close();
		 
		
		
		
		
		}

}
