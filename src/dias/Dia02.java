package dias;

import java.util.Scanner;

public class Dia02 {

	public static void main(String[] args) {
		Double valorA, valorB;		
		
		Scanner input = new Scanner(System.in);
				
		try {
			System.out.println("Digite o primeiro número:");
			valorA = Double.parseDouble(input.nextLine());
			
			System.out.println("Digite o segundo número:");
			valorB = Double.parseDouble(input.nextLine());
			
					
			// Exibe os resultados
            exibirResultado("soma", valorA, valorB, somar(valorA, valorB));
            exibirResultado("subtração", valorA, valorB, subtrair(valorA, valorB));
            exibirResultado("multiplicação", valorA, valorB, multiplicar(valorA, valorB));
            exibirResultado("divisão", valorA, valorB, dividir(valorA, valorB));
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		input.close();

	}
	
	// Métodos para operações matemáticas
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
			throw new ArithmeticException("Divisão por zero não é permitida");
		}
		return valorA / valorB ;
	}
	
	// Método genérico para exibir os resultados
    private static void exibirResultado(String operacao, double valorA, double valorB, double resultado) {
        System.out.printf("O resultado da %s de %.2f e %.2f é: %.2f%n", operacao, valorA, valorB, resultado);
    }

}
