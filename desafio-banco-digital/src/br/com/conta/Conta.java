package br.com.conta;

import br.com.cliente.Cliente;
import br.com.negocio.IConta;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 5578;
	private static int SEQUENCIAL = 91;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	protected Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.saldo = 0;
		this.cliente = cliente;
	}
	
	public boolean sacar(double valor) {
		boolean cond = this.saldo > valor && valor >= 0 ? true : false;
		if(cond) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}

	public boolean depositar(double valor) {
		boolean cond = valor >= 0 ? true : false;
		if(cond) {
			this.saldo += valor;
			return true;
		}
		else {
			return false;
		}
	}

	public void transferir(double valor, IConta conta) {
		if(sacar(valor))
			depositar(valor);
		else
			System.out.println("Saldo insuficiente");
	}

	public void imprimirInfoComuns() {
		System.out.println("Agência: " + this.agencia
				+"\n Número: " + this.numero
				+"\n Saldo: " +this.saldo
				+"\n Cliente: "+ this.cliente.getNome());
	}
	
	protected String getNomeCliente() {
		return this.cliente.getNome();
	}
	
	protected int getNumeroConta() {
		return this.numero;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nCONTA: "
			   +"\nAgência: "+ this.agencia
				+"\n Número: " + this.numero
				+"\n Saldo: " +this.saldo
				+"\n Cliente: "+ this.cliente.getNome();
	}
	
}
