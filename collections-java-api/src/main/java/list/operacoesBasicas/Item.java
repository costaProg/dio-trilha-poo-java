package main.java.list.operacoesBasicas;

public class Item {
	private String nome;
	private double preco;
	private int quantidade;
	
	
	public Item (String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nITEM: "
			   +"\nNome do produto: "+getNome()
			   +"\nPreço do produto: "+getPreco()+" R$"
			   +"\nQuantidade: "+getQuantidade()+"\n";
	}
	
}
