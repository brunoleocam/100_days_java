package dias;

import java.util.Iterator;
import java.util.Scanner;

public class Dia10 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
		    double tabuada;

		    while (true) {
		        System.out.println("Digite um número positivo para calcular a tabuada (ou digite 'sair' para encerrar):");
		        String entrada = input.nextLine();

		        if (entrada.equalsIgnoreCase("sair")) {
		            System.out.println("Programa encerrado. Até logo!");
		            break;
		        }

		        try {
		            tabuada = Double.parseDouble(entrada);

		            if (tabuada < 0) {
		                System.out.println("Erro: Por favor, insira um número positivo.");
		                continue;
		            }

		            System.out.printf("Tabuada de %.2f:%n", tabuada);
		            for (int i = 0; i <= 10; i++) {
		                System.out.printf("%.2f x %d = %.2f%n", tabuada, i, tabuada * i);
		            }
		        } catch (NumberFormatException e) {
		            System.out.println("Erro: Entrada inválida. Insira um número ou 'sair'.");
		        }
		    }
		}


	}

}
