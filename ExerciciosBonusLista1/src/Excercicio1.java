import java.util.Scanner;

public class Excercicio1 {

	public static void main(String[] args) {
		
		/*
		1 � Para um ano de nascimento fornecido pelo usu�rio, informe a idade que 
		ele ter� no dia 31 de dezembro de 2021.
		*/
		Scanner pega = new Scanner(System.in);
		int anoAtual = 2021;
		int anoNascimento = 0;
		int idade = 0;
		
		System.out.println("Digite seu ano de nascimento");
		anoNascimento = pega.nextInt();
		idade = anoAtual - anoNascimento;
		
		System.out.println("Sua Idade: "+ idade);
		
		pega.close();
		
		
		
		
		

	}

}
