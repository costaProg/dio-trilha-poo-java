package main.java.set.ordenacao;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GerenciadorAlunos alunos = new GerenciadorAlunos();
		boolean condicao = true;
		int op;
		long matricula;
		double nota;
		String nome;
		
		do {
			imprimirMenu();
			op = scan.nextInt();
			switch(op) {
				case 1:
					System.out.println("Informe o nome do aluno: ");
					nome = scan.next();
					System.out.println("Informa a matrícula do aluno: ");
					matricula = scan.nextLong();
					System.out.println("Informe a nota do aluno: ");
					nota = scan.nextDouble();
					alunos.adicionarAluno(nome, matricula, nota);
					break;
				case 2:
					alunos.exibirAlunos();
					break;
				case 3:
					System.out.println(alunos.exibirAlunosPorNome());
					break;
				case 4:
					System.out.println(alunos.exibirAlunosPorNota());
					break;
				case 5:
					System.out.println("Informe a matrícula do aluno que deseja remover: ");
					matricula = scan.nextLong();
					alunos.removerAluno(matricula);
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
		System.out.println("[0] - Finalizar programa\n[1] - Adicionar aluno\n[2] - Exibir alunos\n"
				+ "[3] - Exibir alunos por nome\n[4] - Exibir alunos por nota"
				+ "\n[5] - Remover aluno\nEscolha uma opção: ");
	}
	
}