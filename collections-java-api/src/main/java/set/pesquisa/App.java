package main.java.set.pesquisa;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ListaTarefas listaTarefas = new ListaTarefas();
		boolean condicao = true;
		int op;
		String descricao;
		
		do {
			imprimirMenu();
			op = scan.nextInt();
			switch(op) {
				case 1:
					System.out.println("Informe a descrição da tarefa: ");
					descricao = scan.next();
					scan.nextLine();
					listaTarefas.adicionarTarefa(descricao);
					break;
				case 2:
					System.out.println("Lista de tarefas: ");
					listaTarefas.exibirTarefas();
					break;
				case 3:
					System.out.println("Informe a descrição da atividade que deseja marcar como concluída: ");
					descricao = scan.next();
					listaTarefas.marcarTarefaConcluida(descricao);
					break;
				case 4:
					System.out.println("Informe a descrição da atividade que deseja marcar como pendente: ");
					descricao = scan.next();
					listaTarefas.marcarTarefaPendente(descricao);
					break;
				case 5:
					System.out.println("Tarefas concluídas: ");
					System.out.println(listaTarefas.obterTarefasConcluidas());
					break;
				case 6:
					System.out.println("Tarefas pendentes: ");
					System.out.println(listaTarefas.obterTarefasPendentes());
					break;
				case 7:
					listaTarefas.contarTarefas();
					break;
				case 8:
					System.out.println("Informe a descrição da tarefa que deseja remover: ");
					descricao = scan.next();
					listaTarefas.removerTarefa(descricao);
					break;
				case 9:
					listaTarefas.limparListaTarefas();
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
		System.out.println("[0] - Finalizar programa\n[1] - Adiciona uma nova tarefa\n[2] - Exibir todas as tarefas"
				+ "\n[3] - Marcar uma tarefa como concluída\n[4] - Marcar uma tarefa como pendente"
				+ "\n[5] - Obter tarefas concluidas\n[6] - Obter tarefas pendentes\n[7] - Contar total de tarefas"
				+ "\n[8] - Remover tarefa\n[9] - Limpar lista de tarefas"
				+ "\nEscolha uma opção: ");
	}
	
}
