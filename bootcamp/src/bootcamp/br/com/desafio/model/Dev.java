package bootcamp.br.com.desafio.model;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Conteudo> conteudosIniciados;
	private Set<Conteudo> conteudosConcluidos;
	
	public Dev(String nome) {
		this.setNome(nome);
		this.setConteudosIniciados(new LinkedHashSet<>());
		this.setConteudosConcluidos(new LinkedHashSet<>());
	}	
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosIniciados.addAll(bootcamp.getConteudos());
		bootcamp.getDevs().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosIniciados.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosIniciados.remove(conteudo.get());
		}else {
			System.err.println("Você não está matriculado em nenhum curso!!");
		}
	}
	
	public double calcularTotalXp() {
		return this.conteudosConcluidos.stream()
									   .mapToDouble(conteudo -> conteudo.calcularXP())
									   .sum();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosIniciados() {
		return conteudosIniciados;
	}

	public void setConteudosIniciados(Set<Conteudo> conteudosIniciados) {
		this.conteudosIniciados = conteudosIniciados;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
}
