import java.util.Scanner;

public class ExercicioFibonacci {
	public static void main(String args[]) { 
		
		Scanner pega = new Scanner(System.in);
		int n = 0; 
		int numero1 = 1; 
		int numero2 = 1;
		int res = 0;
		
		System.out.println("Digite que deseja para sequencia Fibonacci");
		n = pega.nextInt();
		
		for(int i = 1; i <=n; i++) {
				
			res = numero1 + n;
		
			System.out.println(res);
			res = numero1;
			
			

		}
		
		
		
		
		
	}
}
