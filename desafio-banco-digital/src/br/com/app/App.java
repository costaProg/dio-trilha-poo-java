package br.com.app;

import java.util.Scanner;

import br.com.cliente.Cliente;
import br.com.conta.Banco;
import br.com.conta.Conta;


public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Banco bancoDigital = new Banco();
		Conta conta = null;
		
		boolean condicao = true;
		int op, numC, numD;
		double valor;
		String nome;
		
		do {
			imprimirMenu();
			op = scan.nextInt();
			switch(op) {
				case 1:
					System.out.print("Informe o nome do cliente: ");
					nome = scan.next();
					bancoDigital.adicionarContaPoupanca(new Cliente(nome));
					break;
				case 2:
					System.out.print("Informe o nome do cliente: ");
					nome = scan.next();
					bancoDigital.adicionarContaCorrente(new Cliente(nome));
					break;
				case 3:
					System.out.print("Informe o número da conta: ");
					numC = scan.nextInt();
					System.out.print("Informe o valor a ser depositado: ");
					valor = scan.nextDouble();
					bancoDigital.depositar(numC, valor);
					break;
				case 4:
					System.out.print("Informe o número da conta: ");
					numC = scan.nextInt();
					System.out.print("Informe o valor a ser sacado: ");
					valor = scan.nextDouble();
					bancoDigital.sacar(numC, valor);
					break;
				case 5:
					System.out.print("Informe o número da conta: ");
					numC = scan.nextInt();
					System.out.print("Informe o número da conta destino: ");
					numD = scan.nextInt();
					System.out.print("Informe o valor a ser trânsferido: ");
					valor = scan.nextDouble();
					bancoDigital.transferir(numC, numD, valor);
					break;
				case 6:
					System.out.print("Informe o número da conta: ");
					numC = scan.nextInt();
					conta = bancoDigital.pesquisarPorNumero(numC);
					conta.imprimirExtrato();
					break;
				case 7:
					System.out.print("Informe o nome do cliente: ");
					nome = scan.next();
					System.out.println(bancoDigital.pesquisarPorCliente(nome));
					break;
				case 0:
					System.out.println("Finalizando o programa...");
					condicao = false;
					break;
				default:
					System.out.println("Opção inválida !!");
					break;
			}
		}while(condicao);
		scan.close();
	}
	
	public static void imprimirMenu() {
		System.out.println("-------------------------");
		System.out.println("[0] - Finalizar Programa\n[1] - Criar Conta Poupança\n[2] - Criar Conta Corrente\n"
				+ "[3] - Realizar Depósito\n[4] - Realizar Saque\n[5] - Realizar Trânsferência\n[6] - Exibir Conta"
				+ "\n[7] - Pesquisar Contas do Titular\nEscolha uma opção: ");
	}
	
}