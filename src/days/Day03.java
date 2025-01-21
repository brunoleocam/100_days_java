package days;

import java.util.Scanner;

public class Day03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe um n�mero");
		
		try {
			int numero = Integer.parseInt(input.nextLine());
			System.out.println("O n�mero " + numero + " � " + verificarParOuImpar(numero));
		} catch (NumberFormatException e ) {
			System.out.println("Por favor, informe um n�mero v�lido.");
		}
		input.close();
	}
	
	private static String verificarParOuImpar(int numero) {
		return  numero % 2 == 0 ? "Par" : "�mpar";
	}

}
