import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		/*
		 * Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom
		 * “DIADEFESTA”. Faça um programa onde o funcionário digite o valor da compra e
		 * um cupom, informando o valor final a ser pago.
		 */

		String cupom = "DIADEFESTA";
		String desconto;
		double valorVenda = 0;
		double valorFinal = 0;
		double valorDesconto = 0;

		Scanner pega = new Scanner(System.in);
		System.out.println("Digite valor da venda: ");
		valorVenda = pega.nextInt();

		System.out.println("Digite nome do Cupom de Desconto ");
		desconto = pega.next();
		
		/*
		 cupom.equalsIgnoreCase("diadefesta") IgonereCase compara somente as letras,
		 não compara mauculo é minuscula
		*/
		
		if (desconto.equals(cupom)) {
			System.out.println("Cliente tem desconto de 3%");
			valorDesconto = valorVenda * 0.03;
			valorFinal = valorVenda - valorDesconto;
			System.out.println("Valor a pagar: " + valorFinal);

		} else {
			System.out.println("Cliente sem desconto! ");
			System.out.println("Valor a Pagar: " + valorVenda);

		}
	}

}
