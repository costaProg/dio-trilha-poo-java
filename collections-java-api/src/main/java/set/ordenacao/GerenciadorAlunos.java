package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	//Conjunto de alunos como parâmetro
	private Set<Alunos> gerenciadorAlunosSet;
	
	//Construtor do conjunto de alunos
	public GerenciadorAlunos() {
		this.gerenciadorAlunosSet = new HashSet<Alunos>();
	}
	
	//Adiciona um aluno ao conjunto.
	public void adicionarAluno(String nome, Long matricula, double nota) {
		gerenciadorAlunosSet.add(new Alunos(nome, matricula, nota));
		System.out.println("Aluno "+nome+" com matrícula "+matricula+" adicionado com sucesso!!");
	}
	
	//Remove um aluno ao conjunto a partir da matricula, se estiver presente.
	public void removerAluno(long matricula) {
		Alunos alunoRemovido = null;
		if(!gerenciadorAlunosSet.isEmpty()) {
			for(Alunos a : gerenciadorAlunosSet) {
				if(a.getMatricula() == matricula) {
					gerenciadorAlunosSet.remove(a);
					alunoRemovido = a;
					System.out.println("Aluno "+a.getNome()+" com matrícula "+a.getMatricula()+" removido com sucesso!!");
					break;
				}
			}
			if(alunoRemovido == null) {
				System.out.println("Aluno com matrícula "+matricula+" não encontrado!!");
			}
		}else {
			System.out.println("Conjunto de alunos está vazio!!");
		}
	}
	
	//Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
	public Set<Alunos> exibirAlunosPorNome(){
		Set<Alunos> alunosPorNome = new TreeSet<Alunos>(gerenciadorAlunosSet);
		if(!gerenciadorAlunosSet.isEmpty()) {
			return alunosPorNome;
		}else {
			throw new RuntimeException("Conjunto de alunos está vazio!!");
		}
	}
	
	//Exibe todos os alunos do conjunto em ordem crescente de nota.
	public Set<Alunos> exibirAlunosPorNota(){
		Set<Alunos> alunosPorNota = new TreeSet<Alunos>(new ComparatorPorNota());
		if(!gerenciadorAlunosSet.isEmpty()) {
			alunosPorNota.addAll(gerenciadorAlunosSet);
			return alunosPorNota;
		}else {
			throw new RuntimeException("Conjunto de alunos está vazio!!");
		}
	}
	
	public void exibirAlunos() {
		if(!gerenciadorAlunosSet.isEmpty()) {
			System.out.println(gerenciadorAlunosSet);
		}else {
			System.out.println("Conjunto de alunos está vazio!!");
		}
	}
	
}
