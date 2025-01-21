package days;

import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
		    double tabuada;

		    while (true) {
		        System.out.println("Digite um n�mero positivo para calcular a tabuada (ou digite 'sair' para encerrar):");
		        String entrada = input.nextLine();

		        if (entrada.equalsIgnoreCase("sair")) {
		            System.out.println("Programa encerrado. At� logo!");
		            break;
		        }

		        try {
		            tabuada = Double.parseDouble(entrada);

		            if (tabuada < 0) {
		                System.out.println("Erro: Por favor, insira um n�mero positivo.");
		                continue;
		            }

		            System.out.printf("Tabuada de %.2f:%n", tabuada);
		            for (int i = 0; i <= 10; i++) {
		                System.out.printf("%.2f x %d = %.2f%n", tabuada, i, tabuada * i);
		            }
		        } catch (NumberFormatException e) {
		            System.out.println("Erro: Entrada inv�lida. Insira um n�mero ou 'sair'.");
		        }
		    }
		}


	}

}
