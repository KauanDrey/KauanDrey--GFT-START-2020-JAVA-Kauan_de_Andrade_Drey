package teste.pergunta.tres;

import teste.pergunta.tres.model.ContaCorrente;
import teste.pergunta.tres.model.ContaPoupanca;

public class MainTres {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setNumero(12345);
		contaCorrente.setTitular("Kauan Santander");
		contaCorrente.setSaldo(500.0);

		// Aplica Rendimento
		contaCorrente.setSaldo(contaCorrente.getSaldo() + contaCorrente.rendimento(contaCorrente.getSaldo()));
		Double rendimentoContaCorrente = contaCorrente.rendimento(contaCorrente.getSaldo());
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNumero(54321);
		contaPoupanca.setTitular("Kauan Itua");
		contaPoupanca.setSaldo(1000.0);

		// Aplica Rendimento
		Double rendimentoPoupanca = contaPoupanca.rendimento(contaPoupanca.getSaldo());
		System.out.println(contaCorrente);
		System.out.println("Rendimento Conta Corrente: " + rendimentoContaCorrente);
		
		System.out.println(contaPoupanca);
		System.out.println("Rendimento Poupança: " + rendimentoPoupanca);
		
		
		System.out.println(contaCorrente.calcularImposto(rendimentoContaCorrente));
		System.out.println(contaPoupanca.calcularImposto(rendimentoPoupanca));
	}

}
