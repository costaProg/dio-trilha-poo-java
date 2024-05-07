package main.java.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	//Conjunto de palavras únicas como atributo.
	private Set<String> palavrasSet;
	
	//Construtor do conjunto de palavras únicas.
	public ConjuntoPalavrasUnicas() {
		this.palavrasSet = new HashSet<String>();
	}
	
	//Adiciona uma palavra ao conjunto.
	public void adicionarPalavra(String palavra) {
		palavrasSet.add(palavra);
	}
	
	//Remove uma palavra do conjunto.
	public void removerPalavra(String palavra) {
		if(!palavrasSet.isEmpty()) {
			for(String p : palavrasSet) {
				if(p.equalsIgnoreCase(palavra)) {
					palavrasSet.remove(p);
					System.out.println(p+" Removido com sucesso !!");
					break;
				}
			}
		}else {
			System.out.println("Conjunto está vazio!!");
		}
	}
	
	//Verifica se uma palavra está presente no conjunto.
	public void verificarPalavra(String palavra) {
		if(palavrasSet.contains(palavra))
			System.out.println("A palavra ' "+palavra+" ' está presente no conjunto.");
		else
			System.out.println("A palavra ' "+palavra+" ' não está presente no conjunto.");
	}
	
	//Exibe todas as palavras únicas do conjunto.
	public void exibirPalavrasUnicas() {
		if(!palavrasSet.isEmpty())
			System.out.println(palavrasSet);
		else
			System.out.println("O conjunto está vazio!");
	}
	
}
