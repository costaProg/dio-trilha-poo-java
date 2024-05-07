package main.java.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Alunos implements Comparable<Alunos>{
	//Atributos
	private String nome;
	private long matricula;
	private double nota;
	
	//Contrutor da classe Aluno
	public Alunos(String nome, long matricula, double nota ) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}
	
	//Getters
	public String getNome() {
		return nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public double getNota() {
		return nota;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Alunos aluno)) return false;
		return getMatricula() == aluno.getMatricula();
	}
	
	@Override
	public int hashCode() {
	  return Objects.hash(getMatricula());
	}
	
	@Override
	public String toString() {
		return "\n{"
				+"\nAluno: "+getNome()
				+"\nMatrícula: "+getMatricula()
				+"\nNota: "+getNota()
				+"\n}";
	}

	@Override
	public int compareTo(Alunos a) {
		return nome.compareTo(a.getNome());
	}
	
}

class ComparatorPorNota implements Comparator<Alunos>{

	@Override
	public int compare(Alunos a1, Alunos a2) {
		return Double.compare(a1.getNota(), a2.getNota());
	}
	
}
