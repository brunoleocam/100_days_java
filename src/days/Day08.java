package days;

import java.util.Scanner;

public class Day08 {

	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int opcao = 0;
	        int numero1, numero2;

	        while (opcao != 9) {
	            // Exibir o menu
	        	System.out.println("\n========= Menu Interativo =========");
	        	System.out.println("1 - Mostrar mensagem de boas-vindas");
	        	System.out.println("2 - Realizar uma soma");
	        	System.out.println("3 - Realizar uma subtra��o");
	        	System.out.println("4 - Realizar uma multiplica��o");
	        	System.out.println("5 - Realizar uma divis�o");
	        	System.out.println("9 - Sair");
	        	System.out.println("===================================\n");

	            
	            try {
	                // Ler a op��o do usu�rio
	                opcao = Integer.parseInt(input.nextLine());

	                switch (opcao) {
	                    case 1:
	                        System.out.println("Bem-vindo ao programa!");
	                        break;
	                    case 2:
	                        // Aqui voc� pode implementar a funcionalidade de soma
	                        System.out.print("Digite o primeiro n�mero: ");
	                        numero1 = Integer.parseInt(input.nextLine());

	                        System.out.print("Digite o segundo n�mero: ");
	                        numero2 = Integer.parseInt(input.nextLine());

	                        exibirResultado("+", numero1, numero2, somar(numero1, numero2));
	                        break;
	                    case 3:
	                        // Aqui voc� pode implementar a funcionalidade de soma
	                        System.out.print("Digite o primeiro n�mero: ");
	                        numero1 = Integer.parseInt(input.nextLine());

	                        System.out.print("Digite o segundo n�mero: ");
	                        numero2 = Integer.parseInt(input.nextLine());

	                        exibirResultado("-", numero1, numero2, subtrair(numero1, numero2));
	                        break;
	                    case 4:
	                        // Aqui voc� pode implementar a funcionalidade de soma
	                        System.out.print("Digite o primeiro n�mero: ");
	                        numero1 = Integer.parseInt(input.nextLine());

	                        System.out.print("Digite o segundo n�mero: ");
	                        numero2 = Integer.parseInt(input.nextLine());

	                        exibirResultado("*", numero1, numero2, multiplicar(numero1, numero2));
	                        break;
	                    case 5:
	                        System.out.print("Digite o primeiro n�mero: ");
	                        numero1 = Integer.parseInt(input.nextLine());

	                        System.out.print("Digite o segundo n�mero: ");
	                        numero2 = Integer.parseInt(input.nextLine());

	                        if (numero2 == 0) {
	                            System.out.println("Erro: N�o � poss�vel dividir por zero.");
	                        } else {
	                            exibirResultado("/", numero1, numero2, dividir(numero1, numero2));
	                        }
	                        break;   
	                    case 9:
	                        System.out.print("Tem certeza que deseja sair? (S/N): ");
	                        String confirmacao = input.nextLine().trim().toUpperCase();
	                        if (confirmacao.equals("S")) {
	                            System.out.println("Programa encerrado. At� logo!");
	                        } else {
	                            opcao = 0; // Reinicia o menu
	                        }
	                        break;

	                    default:
	                        System.out.println("Op��o inv�lida. Por favor, escolha uma op��o v�lida.");
	                        break;
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Erro: Por favor, insira um n�mero v�lido.");
	            }
	            
	            System.out.println(); // Espa�o para organizar a sa�da
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
			throw new ArithmeticException("Erro: Divis�o por zero n�o � permitida.");
		}
		return valorA / valorB ;
	}
	
	// M�todo gen�rico para exibir os resultados
    private static void exibirResultado(String operacao, double valorA, double valorB, double resultado) {
    	System.out.printf("O resultado de %.2f %s %.2f = %.2f%n", valorA, operacao, valorB, resultado);
    }

}
