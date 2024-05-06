package main.java.list.ordenacao;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		OrdenacaoNumeros numero = new OrdenacaoNumeros();
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
					System.out.println("Números ordenados de maneira crescente: ");
					System.out.println(numero.ordenarAscendente());
					break;
				case 3:
					System.out.println("Números ordenados de maneira decrescente: ");
					System.out.println(numero.ordenarDescendente());
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
		System.out.println("[0] - Finalizar programa\n[1] - Adicionar número\n[2] - Ordenar de maneira crescente\n"
				+ "[3] - Ordenar de maneira Decrescente\nEscolha uma opção: ");
	}
	
}