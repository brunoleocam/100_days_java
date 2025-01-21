package dias;

import java.util.Scanner;

public class Dia06 {
	
	public static void main(String[] args) {
		int numero;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite um número inteiro positivo:");
			numero = Integer.parseInt(input.nextLine());
			
			if (numero <= 0) {
	            System.out.println("Por favor, informe um número inteiro positivo");
	            return;
	        }
			
			System.out.println("Iniciando a contagem regressiva:");
			for(int i = numero; i >= 0; i--) {
				System.out.println(i);
			}
			
			System.out.println("Fim da contagem regressiva!");
			
			input.close();
		} catch (NumberFormatException e ) {
			System.out.println("Erro: Por favor, informe um número inteiro válido.");
		}

	}

}
