package main.java.set.operacoesBasicas;

import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();
		boolean condicao = true;
		int op;
		String palavra;
		
		do {
			imprimirMenu();
			op = scan.nextInt();
			switch(op) {
				case 1:
					System.out.println("Informe a palavra desejada: ");
					palavra = scan.next();
					palavrasUnicas.adicionarPalavra(palavra);
					break;
				case 2:
					System.out.println("Conjunto de palavras: ");
					palavrasUnicas.exibirPalavrasUnicas();
					break;
				case 3:
					System.out.println("Informe a palavra que deseja verificar: ");
					palavra = scan.next();
					palavrasUnicas.verificarPalavra(palavra);
					break;
				case 4:
					System.out.println("Informe a palavra que deseja remover: ");
					palavra = scan.next();
					palavrasUnicas.removerPalavra(palavra);
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
		System.out.println("[0] - Finalizar programa\n[1] - Adicionar palavra ao conjunto\n[2] - Exibir palavras\n"
				+ "[3] - Verificar se a palavra existe no conjunto\n[4] - Remover palavra do conjunto"
				+ "\nEscolha uma opção: ");
	}
	
}