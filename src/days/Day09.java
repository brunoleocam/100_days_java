package days;

import java.util.Scanner;

public class Day09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double numero;
        
        System.out.println("Bem-vindo ao programa de valida��o de entrada!");
        System.out.println("Digite 'sair' a qualquer momento para encerrar.");
        
        while (true) {
        	numero = validarEntrada(input);     
        	
        	if (Double.isNaN(numero)) { // Verifica se o usu�rio escolheu sair
                System.out.println("Programa encerrado. At� logo!");
                break;
            }

            System.out.printf("Voc� digitou o n�mero: %.2f%n", numero);
            System.out.println(); // Espa�o para organizar a sa�da
        }
                input.close();

	}
	
	private static double validarEntrada(Scanner input) {
		double numero = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Digite um n�mero decimal positivo ou 'sair' para encerrar: ");
            String entrada = input.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                return Double.NaN; // Retorna um valor especial indicando a sa�da
            }

            try {
                numero = Double.parseDouble(entrada);

                if (numero > 0) {
                    entradaValida = true; // Entrada v�lida, sai do loop
                } else {
                    System.out.println("Erro: O n�mero deve ser maior que zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, digite um n�mero decimal v�lido.");
            }
        }

        return numero;
	}

}
