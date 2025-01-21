package days;

import java.util.Scanner;

public class Day06 {
	
	public static void main(String[] args) {
		int numero;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite um n�mero inteiro positivo:");
			numero = Integer.parseInt(input.nextLine());
			
			if (numero <= 0) {
	            System.out.println("Por favor, informe um n�mero inteiro positivo");
	            return;
	        }
			
			System.out.println("Iniciando a contagem regressiva:");
			for(int i = numero; i >= 0; i--) {
				System.out.println(i);
			}
			
			System.out.println("Fim da contagem regressiva!");
			
			input.close();
		} catch (NumberFormatException e ) {
			System.out.println("Erro: Por favor, informe um n�mero inteiro v�lido.");
		}

	}

}
