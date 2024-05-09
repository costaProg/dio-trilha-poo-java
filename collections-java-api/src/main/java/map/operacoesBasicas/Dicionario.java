package main.java.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

import javax.management.RuntimeErrorException;

public class Dicionario {
	//Map para armazenar palavras e suas respectivas definições
	private Map<String, String> dicionarioMap;
	
	//Construtor do Map
	public Dicionario() {
		this.dicionarioMap = new HashMap<String, String>();
	}
	
	//Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
	public void adicionarPalavra(String palavra, String definicao) {
		dicionarioMap.put(palavra, definicao);
		System.out.println("Palavra adicionada com sucesso!!");
	}
	
	//Remove uma palavra do dicionário, dado o termo a ser removido.
	public void removerPalavra(String palavra) {
		if(!dicionarioMap.isEmpty()) {
			dicionarioMap.remove(palavra);
			System.out.println("Palavra removida!!");
		}else {
			System.out.println("Dicionário está vazio");
		}
	}
	
//Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
	public void exibirPalavras() {
		if(!dicionarioMap.isEmpty()) {
			System.out.println(dicionarioMap);
		}else {
			System.out.println("Dicionário está vazio!!");
		}
	}
	
	//Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
	public String pesquisarPorPalavra(String palavra ){
		String definicao = null;
		if(!dicionarioMap.isEmpty()) {
			definicao = dicionarioMap.get(palavra);
			if(definicao != null) {
				return definicao;
			}else {
				throw new RuntimeException("Palavra não encontrada no dicionário");
			}
		}else {
			throw new RuntimeException("Dicionário está vazio");
		}
	}
	
}
