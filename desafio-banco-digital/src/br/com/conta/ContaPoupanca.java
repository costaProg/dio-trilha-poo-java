package br.com.conta;

import br.com.cliente.Cliente;

public class ContaPoupanca extends Conta{

	protected ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("===== Conta Poupança =====");
		super.imprimirInfoComuns();
	}

}
