package days;

import java.util.Scanner;

public class Day04 {

	public static void main(String[] args) {
		Double valorA, valorB;	
		String operacao;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite o primeiro valor:");
			valorA = Double.parseDouble(input.nextLine());
			
			System.out.println("Digite o segundo valor:");
			valorB = Double.parseDouble(input.nextLine());
			
			System.out.println("Escolha uma opera��o (+, -, *, /):");
			operacao = input.nextLine();
			
			switch(operacao){
			case "+":
				exibirResultado(operacao, valorA, valorB, somar(valorA, valorB));
				break;
			case "-":
				exibirResultado(operacao, valorA, valorB, subtrair(valorA, valorB));
				break;
			case "*":
				exibirResultado(operacao, valorA, valorB, multiplicar(valorA, valorB));
				break;
			case "/":
				exibirResultado(operacao, valorA, valorB, dividir(valorA, valorB));
				break;	
			default:
				System.out.println("Opera��o inv�lida. Escolha apenas entre +, -, * ou /.");
			}
			input.close();
		} catch (NumberFormatException e ) {
			System.out.println("Por favor, informe um n�mero v�lido.");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
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
			throw new ArithmeticException("Erro: Divis�o por zero n�o � permitida.");
		}
		return valorA / valorB ;
	}
	
	// M�todo gen�rico para exibir os resultados
    private static void exibirResultado(String operacao, double valorA, double valorB, double resultado) {
    	System.out.printf("O resultado de %.2f %s %.2f � %.2f%n", valorA, operacao, valorB, resultado);
    }

}
