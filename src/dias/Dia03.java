package dias;

import java.util.Scanner;

public class Dia03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe um número");
		
		try {
			int numero = Integer.parseInt(input.nextLine());
			System.out.println("O número " + numero + " é " + verificarParOuImpar(numero));
		} catch (NumberFormatException e ) {
			System.out.println("Por favor, informe um número válido.");
		}
		input.close();
	}
	
	private static String verificarParOuImpar(int numero) {
		return  numero % 2 == 0 ? "Par" : "Ímpar";
	}

}
