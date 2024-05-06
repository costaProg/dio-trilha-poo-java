package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	private List<Integer> numeroList;

	public OrdenacaoNumeros() {
		this.numeroList = new ArrayList<Integer>();
	}
	
	public List<Integer> getNumeros() {
		return numeroList;
	}
	
	//Adiciona um número à lista.
	public void adicionarNumero(int numero) {
		numeroList.add(new Integer(numero));
	}
	
	//Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
	public List<Integer> ordenarAscendente() {
		List<Integer> numAsc = new ArrayList<Integer>(this.numeroList);
		if(!numAsc.isEmpty()) {
			Collections.sort(numAsc);
		}
		return numAsc;
	}	
	
	//Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
	public List<Integer> ordenarDescendente() {
		List<Integer> numDesc = new ArrayList<Integer>(this.numeroList);
		if(!numDesc.isEmpty()) {
			numDesc.sort(Collections.reverseOrder());
		}
		return numDesc;
	}
	
}
