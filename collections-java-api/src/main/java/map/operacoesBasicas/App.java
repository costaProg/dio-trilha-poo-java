package main.java.map.operacoesBasicas;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Dicionario dicionarioMap = new Dicionario();
		boolean condicao = true;
		int op;
		String palavra, definicao;
		
		do {
			imprimirMenu();
			op = scan.nextInt();
			switch(op) {
				case 1:
					System.out.println("Informe a palavra que deseja inserir: ");
					palavra = scan.next();
					System.out.println("Informe a definição da respectiva palavra: ");
					definicao = scan.next();
					scan.nextLine();
					dicionarioMap.adicionarPalavra(palavra, definicao);
					break;
				case 2:
					System.out.println("Dicionário: ");
					dicionarioMap.exibirPalavras();
					break;
				case 3:
					System.out.println("Informe a palavra que deseja encontrar: ");
					palavra = scan.next();
					System.out.println(dicionarioMap.pesquisarPorPalavra(palavra));
					break;
				case 4:
					System.out.println("Informe a palavra que deseja remover: ");
					palavra = scan.next();
					dicionarioMap.removerPalavra(palavra);
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
		System.out.println("[0] - Finalizar programa\n[1] - Adicionar palavra ao dicionário\n[2] - Exibir palavras\n"
				+ "[3] - Pesquisar palavra no dicionário\n[4] - Remover palavra do dicionário"
				+ "\nEscolha uma opção: ");
	}
	
}
