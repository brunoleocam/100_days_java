package dias;

import java.util.Scanner;

public class Dia08 {

	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int opcao = 0;
	        int numero1, numero2;

	        while (opcao != 9) {
	            // Exibir o menu
	        	System.out.println("\n========= Menu Interativo =========");
	        	System.out.println("1 - Mostrar mensagem de boas-vindas");
	        	System.out.println("2 - Realizar uma soma");
	        	System.out.println("3 - Realizar uma subtração");
	        	System.out.println("4 - Realizar uma multiplicação");
	        	System.out.println("5 - Realizar uma divisão");
	        	System.out.println("9 - Sair");
	        	System.out.println("===================================\n");

	            
	            try {
	                // Ler a opção do usuário
	                opcao = Integer.parseInt(input.nextLine());

	                switch (opcao) {
	                    case 1:
	                        System.out.println("Bem-vindo ao programa!");
	                        break;
	                    case 2:
	                        // Aqui você pode implementar a funcionalidade de soma
	                        System.out.print("Digite o primeiro número: ");
	                        numero1 = Integer.parseInt(input.nextLine());

	                        System.out.print("Digite o segundo número: ");
	                        numero2 = Integer.parseInt(input.nextLine());

	                        exibirResultado("+", numero1, numero2, somar(numero1, numero2));
	                        break;
	                    case 3:
	                        // Aqui você pode implementar a funcionalidade de soma
	                        System.out.print("Digite o primeiro número: ");
	                        numero1 = Integer.parseInt(input.nextLine());

	                        System.out.print("Digite o segundo número: ");
	                        numero2 = Integer.parseInt(input.nextLine());

	                        exibirResultado("-", numero1, numero2, subtrair(numero1, numero2));
	                        break;
	                    case 4:
	                        // Aqui você pode implementar a funcionalidade de soma
	                        System.out.print("Digite o primeiro número: ");
	                        numero1 = Integer.parseInt(input.nextLine());

	                        System.out.print("Digite o segundo número: ");
	                        numero2 = Integer.parseInt(input.nextLine());

	                        exibirResultado("*", numero1, numero2, multiplicar(numero1, numero2));
	                        break;
	                    case 5:
	                        System.out.print("Digite o primeiro número: ");
	                        numero1 = Integer.parseInt(input.nextLine());

	                        System.out.print("Digite o segundo número: ");
	                        numero2 = Integer.parseInt(input.nextLine());

	                        if (numero2 == 0) {
	                            System.out.println("Erro: Não é possível dividir por zero.");
	                        } else {
	                            exibirResultado("/", numero1, numero2, dividir(numero1, numero2));
	                        }
	                        break;   
	                    case 9:
	                        System.out.print("Tem certeza que deseja sair? (S/N): ");
	                        String confirmacao = input.nextLine().trim().toUpperCase();
	                        if (confirmacao.equals("S")) {
	                            System.out.println("Programa encerrado. Até logo!");
	                        } else {
	                            opcao = 0; // Reinicia o menu
	                        }
	                        break;

	                    default:
	                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
	                        break;
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Erro: Por favor, insira um número válido.");
	            }
	            
	            System.out.println(); // Espaço para organizar a saída
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
			throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
		}
		return valorA / valorB ;
	}
	
	// Método genérico para exibir os resultados
    private static void exibirResultado(String operacao, double valorA, double valorB, double resultado) {
    	System.out.printf("O resultado de %.2f %s %.2f = %.2f%n", valorA, operacao, valorB, resultado);
    }

}
