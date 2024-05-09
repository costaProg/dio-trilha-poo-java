package main.java.map.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
	//Map para armazenar os livros disponíveis na livraria
	private Map<String, Livro> livrosMap;
	
	//Construtor do map
	public LivrariaOnline() {
		this.livrosMap = new HashMap<String, Livro>();
	}
	
	//Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
	public void adicionarLivro(String link, Livro livro) {
		livrosMap.put(link, livro);
	}
	
	//Remove um livro da livraria, dado o titulo do livro.
	public void removerLivro(String titulo) {
		if(!livrosMap.isEmpty()) {
			for(Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
				if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
					livrosMap.remove(entry.getKey());
					System.out.println("Livro removido com sucesso!!");
				}
			}
		}else {
			System.out.println("A livraria não contém nenhum livro!");
		}
	}
	
	//Exibe os livros da livraria em ordem crescente de preço.
	public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
		if(!livrosMap.isEmpty()) {
		    List<Map.Entry<String, Livro>> livrosOrdenarPreco = new ArrayList<>(livrosMap.entrySet());
			
		    Collections.sort(livrosOrdenarPreco, new ComparatorPorPreco());
	
		    Map<String, Livro> livrosOrdenadosPreco = new LinkedHashMap<>();
	
		    for (Map.Entry<String, Livro> entry : livrosOrdenarPreco) {
		      livrosOrdenadosPreco.put(entry.getKey(), entry.getValue());
		    }
	
		    return livrosOrdenadosPreco;	
		}else {
			throw new RuntimeException("Livraria está vazia");
		}
	}
	
	//Retorna uma lista de todos os livros escritos por um determinado autor.
	public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
		if(!livrosMap.isEmpty()) {	
		    Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
	
		    for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
		      if(entry.getValue().getAutor().equalsIgnoreCase(autor)) {
		    	  livrosPorAutor.put(entry.getKey(), entry.getValue());
		      }
		    }
		    return livrosPorAutor;	
		}else {
			throw new RuntimeException("Livraria está vazia!!");
		}
	}
	
	//Retorna o livro mais caro disponível na livraria.
	public Livro obterLivroMaisCaro() {
		Double maiorPreco = Double.MIN_VALUE;
		Livro livroMaisCaro = null;
		
		if(!livrosMap.isEmpty()) {
			for(Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
				if(entry.getValue().getPreco() > maiorPreco) {
					maiorPreco = entry.getValue().getPreco();
					livroMaisCaro = entry.getValue();
				}
			}
		}else {
			throw new RuntimeException("Livraria está vazia!!");
		}
		return livroMaisCaro;
	}
	
	//Retorna o livro mais barato disponível na livraria.
	public Livro exibirLivroMaisBarato() {
		Double menorPreco = Double.MAX_VALUE;
		Livro livroMaisBarato = null;
		
		if(!livrosMap.isEmpty()) {
			for(Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
				if(entry.getValue().getPreco() < menorPreco) {
					menorPreco = entry.getValue().getPreco();
					livroMaisBarato = entry.getValue();
				}
			}
		}else {
			throw new RuntimeException("Livraria está vazia!!");
		}
		return livroMaisBarato;
	}
	
	  public static void main(String[] args) {
		  	//copiado da prof
		    LivrariaOnline livrariaOnline = new LivrariaOnline();
		    // Adiciona os livros à livraria online
		    livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
		    livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
		    livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
		    livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
		    livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
		    livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

		    // Exibe todos os livros ordenados por preço
		    System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

		    // Pesquisa livros por autor
		    String autorPesquisa = "Josh Malerman";
		    livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

		    // Obtém e exibe o livro mais caro
		    System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

		    // Obtém e exibe o livro mais barato
		    System.out.println("Livro mais barato: " + livrariaOnline.exibirLivroMaisBarato());

		    // Remover um livro pelo título
		    livrariaOnline.removerLivro("1984");
		    System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());

		  }
}


