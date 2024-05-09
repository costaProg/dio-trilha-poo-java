package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	//Map para armazenar as palavras e a quantidade de vezes que cada palavra aparece em um texto
	private Map<String, Integer> contagemPalavrasMap;
	
	//Construtor do map
	public ContagemPalavras() {
		this.contagemPalavrasMap = new HashMap<String, Integer>();
	}
	
	//Adiciona uma palavra à contagem.
	public void adicionarPalavra(String palavra, Integer contagem) {
		contagemPalavrasMap.put(palavra, contagem);
	}
	
	//Remove uma palavra da contagem, se estiver presente.
	public void removerPalavra(String palavra) {
		if(!contagemPalavrasMap.isEmpty()) {
			if(contagemPalavrasMap.containsKey(palavra)) {
				contagemPalavrasMap.remove(palavra);
				System.out.println("Palavra removida com sucesso!!");
			}else {
				System.out.println("Palavra não encontrada!!");
			}
		}else {
			System.out.println("O dicionário está vazio!!");
		}
	}
	
	//Exibe todas as palavras e suas respectivas contagens.
	public void exibirContagemPalavras() {
		if(!contagemPalavrasMap.isEmpty()) {
			System.out.println(contagemPalavrasMap);
		}else {
			System.out.println("O dicionário está vazio!!");
		}
	}
	
	//Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
	public String encontrarPalavraMaisFrequente() {
		Integer maior = Integer.MIN_VALUE;
		String palavra = null;
		if(!contagemPalavrasMap.isEmpty()) {
			for(Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
				if(entry.getValue() > maior) {
					maior = entry.getValue();
					palavra = entry.getKey();
				}
			}
			if(palavra == null)
				return "Palavra não encontrada";
			else
				return palavra;
		}else {
			return "O dicionário está vazio!!";
		}
	}
	
}
