package dias;

import java.util.Scanner;

public class Dia01 {

	public static void main(String[] args) {
		System.out.println("Hello, Java!");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite seu nome");
		
		String nomeUsuario = input.nextLine();
		
		System.out.println("Bem vindo, " + nomeUsuario + "!");
		
		input.close();

	}

}
