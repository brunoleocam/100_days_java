package dias;

import java.util.Scanner;

public class Dia09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double numero;
        
        System.out.println("Bem-vindo ao programa de validação de entrada!");
        System.out.println("Digite 'sair' a qualquer momento para encerrar.");
        
        while (true) {
        	numero = validarEntrada(input);     
        	
        	if (Double.isNaN(numero)) { // Verifica se o usuário escolheu sair
                System.out.println("Programa encerrado. Até logo!");
                break;
            }

            System.out.printf("Você digitou o número: %.2f%n", numero);
            System.out.println(); // Espaço para organizar a saída
        }
                input.close();

	}
	
	private static double validarEntrada(Scanner input) {
		double numero = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Digite um número decimal positivo ou 'sair' para encerrar: ");
            String entrada = input.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                return Double.NaN; // Retorna um valor especial indicando a saída
            }

            try {
                numero = Double.parseDouble(entrada);

                if (numero > 0) {
                    entradaValida = true; // Entrada válida, sai do loop
                } else {
                    System.out.println("Erro: O número deve ser maior que zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, digite um número decimal válido.");
            }
        }

        return numero;
	}

}
