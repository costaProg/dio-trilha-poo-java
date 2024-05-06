package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> numeroList;
	
	public SomaNumeros() {
		this.numeroList = new ArrayList<Integer>();
	}
	
	//Adiciona um número à lista de números.
	public void adicionarNumero(int numero) {
		this.numeroList.add(new Integer(numero));
	}
	
	//Calcula a soma de todos os números na lista e retorna o resultado.
	public int calcularSoma() {
		int somaTotal = 0;
		if(!numeroList.isEmpty()) {
			for(Integer num : numeroList) {
				somaTotal += num;
			}
		}
		return somaTotal;
	}
	
	//Encontra o maior número na lista e retorna o valor.
	public int encontrarMaiorNumero() {
		int maior = Integer.MIN_VALUE;
		if(!numeroList.isEmpty()) {
			for(Integer num : numeroList) {
				if(num > maior) {
					maior = num;
				}
			}
		}
		return maior;
	}
	
	//Encontra o menor número na lista e retorna o valor.
	public int encontrarMenorNumero() {
		int menor = Integer.MAX_VALUE;
		if(!numeroList.isEmpty()) {
			for(Integer num : numeroList) {
				if(num < menor) {
					menor = num;
				}
			}
		}
		return menor;
	}
	
	//Retorna uma lista contendo todos os números presentes na lista.
	public void exibirNumeros(){
		System.out.println("\n"+numeroList+"\n");
	}
	
}
