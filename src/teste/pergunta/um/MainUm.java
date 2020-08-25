package teste.pergunta.um;

import java.util.Scanner;

public class MainUm {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Bem Vindo ao Sistema de numeros Impares!");
			System.out.println("Digite o primeiro número: ");
			String primeiroNumero = scanner.next();

			while (!primeiroNumero.matches("[0-9]*") || Integer.valueOf(primeiroNumero) < 0) {
				System.out.println("O número inválido ou menor que 0");
				System.out.println("Digite o primeiro número novamente: ");
				primeiroNumero = scanner.next();
			}

			System.out.println("Digite o segundo número: ");
			String segundoNumero = scanner.next();

			while (!segundoNumero.matches("[0-9]*")
					|| Integer.valueOf(segundoNumero) < Integer.valueOf(primeiroNumero)) {
				
				System.out.println("O número inválido ou menor que o primeiro número");
				System.out.println("Digite o segundo número novamente: ");
				segundoNumero = scanner.next();
			}

			for (int i = Integer.valueOf(primeiroNumero); i < Integer.valueOf(segundoNumero); i++) {

				if (i % 2 == 1) {
					System.out.print(i + " ");
				}

			}
		}
	}

}
