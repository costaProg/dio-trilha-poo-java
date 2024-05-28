package br.com.conta;

import java.util.ArrayList;

import java.util.List;

import br.com.cliente.Cliente;

public class Banco{
	public List<Conta> contas;
	
	public Banco () {
		this.contas = new ArrayList<Conta>();
	}
	
	public void adicionarContaCorrente(Cliente cliente) {
		ContaCorrente conta = new ContaCorrente(cliente);
		this.contas.add(conta);
		conta.imprimirExtrato();
		System.out.println("Conta Adicionada com sucesso!!");
	}
	
	public void adicionarContaPoupanca(Cliente cliente) {
		ContaPoupanca conta = new ContaPoupanca(cliente);
		this.contas.add(conta);
		conta.imprimirExtrato();
		System.out.println("Conta Adicionada com sucesso!!");
	}
	
	public List<Conta> pesquisarPorCliente(String nome) {
		List<Conta> contaCliente = new ArrayList<>();
		if(!contas.isEmpty()) {
			for(Conta c : contas) {
				if(c.getNomeCliente().equalsIgnoreCase(nome))
					contaCliente.add(c);
			}
		}else {
			throw new RuntimeException("A lista está vazia!!");
		}
		return contaCliente;
	}
	
	public Conta pesquisarPorNumero(int numero) {
		Conta contaCliente = null;
		if(!contas.isEmpty()) {
			for(Conta c : contas) {
				if(c.getNumeroConta() == numero)
					contaCliente = c;
			}
		}else {
			throw new RuntimeException("A lista está vazia!!");
		}
		return contaCliente;
	}
	
	public void depositar(int numero, double valor) {
		Conta contaCliente = pesquisarPorNumero(numero);
		if(contaCliente != null) {
			if(contaCliente.depositar(valor))
				System.out.println("Depósito realizado com sucesso!!");
			else
				System.out.println("O valor a ser depositado tem que ser positivo!!");	
		}else {
			System.out.println("Conta com o número "+numero+" não encontrada!!");
		}
			
	}
	
	public void sacar(int numero, double valor) {
		Conta contaCliente = pesquisarPorNumero(numero);
		if(contaCliente != null) {
			if(contaCliente.sacar(valor))
				System.out.println("Saque realizado comsucesso!!");
			else
				System.out.println("Saldo insuficiente ou valor de saque informado está negativo!!");	
		}else {
			System.out.println("Conta com o número "+numero+" não encontrada!!");
		}
			
	}
	
	public void transferir(int numeroC, int numeroD, double valor) {
		sacar(numeroC, valor);
		depositar(numeroD, valor);
	}
	
}
