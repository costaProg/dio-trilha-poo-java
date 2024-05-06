package main.java.list.operacoesBasicas;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		boolean condicao = true;
		int op, qtd;
		double valor;
		String nome;
		
		do {
			imprimirMenu();
			op = scan.nextInt();
			switch(op) {
				case 1:
					System.out.println("Informe o nome do produto: ");
					nome = scan.next();
					System.out.println("Informe o preço do produto: ");
					valor = scan.nextDouble();
					System.out.println("Informe a quantidade: ");
					qtd = scan.nextInt();
					carrinho.adicionarItem(nome, valor, qtd);;
					break;
				case 2:
					System.out.println("Carrinho: ");
					carrinho.exibirItens();
					break;
				case 3:
					System.out.println("Informe o nome do produto que deseja excluir: ");
					nome = scan.next();
					carrinho.removerItem(nome);
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
		System.out.println("[0] - Finalizar programa\n[1] - Adicionar itens ao carrinho\n[2] - Exibir itens\n"
				+ "[3] - Remover item do carrinho\n Escolha uma opção: ");
	}
	
}
