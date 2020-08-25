package teste.pergunta.tres.model;

import teste.pergunta.tres.service.Imposto;

public class ContaPoupanca extends Conta implements Imposto{

	@Override
	public Double rendimento(Double saldo) {
		
		return super.rendimento(saldo * 0.05);
	}

	@Override
	public Double calcularImposto(Double rendimento) {
		return rendimento * 0.1;
	}
}