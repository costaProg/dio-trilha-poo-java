package main.java.list.pesquisa;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SomaNumeros numero = new SomaNumeros();
		boolean condicao = true;
		int op, num;
		
		do {
			imprimirMenu();
			op = scan.nextInt();
			switch(op) {
				case 1:
					System.out.println("Informe o número desejado: ");
					num = scan.nextInt();
					numero.adicionarNumero(num);
					break;
				case 2:
					num = numero.calcularSoma();
					System.out.println("Soma total dos números: "+num);
					break;
				case 3:
					num = numero.encontrarMaiorNumero();
					System.out.println("Maior número encontrado: "+num);
					break;
				case 4:
					num = numero.encontrarMenorNumero();
					System.out.println("Menor número encontrado: "+num);
					break;
				case 5:
					numero.exibirNumeros();
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
		System.out.println("[0] - Finalizar programa\n[1] - Adicionar número\n[2] - Calcular soma dos numeros adicionados\n"
				+ "[3] - Encontrar maior número\n[4] - Encontrar menor número\n[5] - Exibir números\n"
				+ "Escolha uma opção: ");
	}
	
}
