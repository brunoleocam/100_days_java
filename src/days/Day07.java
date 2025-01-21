package days;

import java.util.Scanner;

public class Day07 {
	public static void main(String[] args) {
		int numero = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
		
		try (Scanner input = new Scanner(System.in)) {
						
			while(true) {
				System.out.println("Digite um n�mero inteiro positivo:");
				numero = Integer.parseInt(input.nextLine());
				
				if(numero <= 0) {
					break;
				}
		
				if(numero > maior) {
					maior = numero;
				} 
				
				if (numero < menor) {
					menor = numero;
				}
			}
			
			if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
	            System.out.println("Nenhum n�mero v�lido foi digitado.");
	        } else {
	            System.out.println("O menor n�mero �: " + menor);
	            System.out.println("O maior n�mero �: " + maior);
	        }
			input.close();
		} catch (NumberFormatException e ) {
			System.out.println("Erro: Por favor, informe um n�mero inteiro v�lido.");
		}

	}

}
