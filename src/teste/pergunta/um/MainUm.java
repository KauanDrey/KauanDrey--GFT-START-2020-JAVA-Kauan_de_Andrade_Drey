package teste.pergunta.um;

import java.util.Scanner;

public class MainUm {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Bem Vindo ao Sistema de numeros Impares!");
			System.out.println("Digite o primeiro n�mero: ");
			String primeiroNumero = scanner.next();

			while (!primeiroNumero.matches("[0-9]*") || Integer.valueOf(primeiroNumero) < 0) {
				System.out.println("O n�mero inv�lido ou menor que 0");
				System.out.println("Digite o primeiro n�mero novamente: ");
				primeiroNumero = scanner.next();
			}

			System.out.println("Digite o segundo n�mero: ");
			String segundoNumero = scanner.next();

			while (!segundoNumero.matches("[0-9]*")
					|| Integer.valueOf(segundoNumero) < Integer.valueOf(primeiroNumero)) {
				
				System.out.println("O n�mero inv�lido ou menor que o primeiro n�mero");
				System.out.println("Digite o segundo n�mero novamente: ");
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
