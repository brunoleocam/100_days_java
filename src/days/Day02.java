package days;

import java.util.Scanner;

public class Day02 {

	public static void main(String[] args) {
		Double valorA, valorB;		
		
		Scanner input = new Scanner(System.in);
				
		try {
			System.out.println("Digite o primeiro n�mero:");
			valorA = Double.parseDouble(input.nextLine());
			
			System.out.println("Digite o segundo n�mero:");
			valorB = Double.parseDouble(input.nextLine());
			
					
			// Exibe os resultados
            exibirResultado("soma", valorA, valorB, somar(valorA, valorB));
            exibirResultado("subtra��o", valorA, valorB, subtrair(valorA, valorB));
            exibirResultado("multiplica��o", valorA, valorB, multiplicar(valorA, valorB));
            exibirResultado("divis�o", valorA, valorB, dividir(valorA, valorB));
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		input.close();

	}
	
	// M�todos para opera��es matem�ticas
	private static double somar(double valorA, double valorB) {
		return valorA + valorB;
	}
	
	private static double subtrair(double valorA, double valorB) {
		return valorA - valorB;
	}
	
	private static double multiplicar(double valorA, double valorB) {
		return valorA * valorB;
	}
	
	private static double dividir(double valorA, double valorB) {
		if(valorB == 0) {
			throw new ArithmeticException("Divis�o por zero n�o � permitida");
		}
		return valorA / valorB ;
	}
	
	// M�todo gen�rico para exibir os resultados
    private static void exibirResultado(String operacao, double valorA, double valorB, double resultado) {
        System.out.printf("O resultado da %s de %.2f e %.2f �: %.2f%n", operacao, valorA, valorB, resultado);
    }

}
