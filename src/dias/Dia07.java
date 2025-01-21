package dias;

import java.util.Scanner;

public class Dia07 {
	public static void main(String[] args) {
		int numero = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
		
		try (Scanner input = new Scanner(System.in)) {
						
			while(true) {
				System.out.println("Digite um número inteiro positivo:");
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
	            System.out.println("Nenhum número válido foi digitado.");
	        } else {
	            System.out.println("O menor número é: " + menor);
	            System.out.println("O maior número é: " + maior);
	        }
			input.close();
		} catch (NumberFormatException e ) {
			System.out.println("Erro: Por favor, informe um número inteiro válido.");
		}

	}

}
