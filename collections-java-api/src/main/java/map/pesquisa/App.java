package main.java.map.pesquisa;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ContagemPalavras contagemPalavrasMap = new ContagemPalavras();
		boolean condicao = true;
		int op;
		String palavra;
		Integer contagem;
		
		do {
			imprimirMenu();
			op = scan.nextInt();
			switch(op) {
				case 1:
					System.out.println("Informe a palavra que deseja inserir: ");
					palavra = scan.next();
					System.out.println("Informe o total de vezes que a palavra surge no texto: ");
					contagem = scan.nextInt();
					contagemPalavrasMap.adicionarPalavra(palavra, contagem);
					break;
				case 2:
					System.out.println("Contagem: ");
					contagemPalavrasMap.exibirContagemPalavras();
					break;
				case 3:
					System.out.println(contagemPalavrasMap.encontrarPalavraMaisFrequente());
					break;
				case 4:
					System.out.println("Informe a palavra que deseja remover: ");
					palavra = scan.next();
					contagemPalavrasMap.removerPalavra(palavra);
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
		System.out.println("[0] - Finalizar programa\n[1] - Adicionar palavra\n[2] - Exibir contagem\n"
				+ "[3] - Encontrar palavra mais frequente\n[4] - Remover palavra da contagem"
				+ "\nEscolha uma opção: ");
	}
	
}
