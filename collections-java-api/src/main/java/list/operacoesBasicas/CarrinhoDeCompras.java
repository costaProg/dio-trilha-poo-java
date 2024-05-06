package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> carrinhoDeCompras;
	
	public CarrinhoDeCompras() {
		carrinhoDeCompras = new ArrayList<Item>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinhoDeCompras.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensRemovidos = new ArrayList<Item>();
		if(!carrinhoDeCompras.isEmpty()) {
			for(Item i : carrinhoDeCompras) {
				if(i.getNome().equalsIgnoreCase(nome))
					itensRemovidos.add(i);
			}
			carrinhoDeCompras.removeAll(itensRemovidos);
		} else {
			System.out.println("A lista está vazia!!");
		}
	}
	
	protected double calcularValorTotal() {
		double valorTotal = 0;
		
		for(Item i : carrinhoDeCompras) {
			if(!carrinhoDeCompras.isEmpty())
				valorTotal += (i.getQuantidade() * i.getPreco());
		}
		
		return valorTotal;
	}
	
	public void exibirItens() {
		if(!carrinhoDeCompras.isEmpty()) {
			double valor = calcularValorTotal();
			System.out.println(carrinhoDeCompras);
			System.out.println("Valor total: "+valor);
		}else {
			System.out.println("A lista está vazia");	
		}
	}
	
}
