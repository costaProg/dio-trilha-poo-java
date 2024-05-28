package br.com.negocio;

public interface IConta {
	
	boolean sacar(double valor);
	boolean depositar(double valor);
	void transferir(double valor, IConta conta);
	void imprimirExtrato();
	
}
