package days;

import java.util.Scanner;

public class Day05 {

	public static void main(String[] args) {
		int numero, soma = 0;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite um n�mero inteiro positivo:");
			numero = Integer.parseInt(input.nextLine());
			
			if (numero <= 0) {
	            System.out.println("Por favor, informe um n�mero maior que zero.");
	            return;
	        }
			
			for(int i = 1; i <= numero; i++) {
				soma += i;
				System.out.println(i);
			}
			
			System.out.println("Soma total: " + soma);
			
			input.close();
		} catch (NumberFormatException e ) {
			System.out.println("Erro: Por favor, informe um n�mero inteiro v�lido.");
		}

	}

}
