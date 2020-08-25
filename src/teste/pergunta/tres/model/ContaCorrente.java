package teste.pergunta.tres.model;

import teste.pergunta.tres.service.Imposto;

public class ContaCorrente extends Conta implements Imposto{

	@Override
	public Double rendimento(Double saldo) {
		
		return super.rendimento(this.saldo * 0.03);
	}

	@Override
	public Double calcularImposto(Double rendimento) {
		// TODO Auto-generated method stub
		return rendimento * 0.25;
	}
	
}