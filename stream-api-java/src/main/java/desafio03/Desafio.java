package main.java.desafio03;

import java.util.Arrays;
import java.util.List;

//Programa que utiliza Stream API para verificar se todos os números da lista são positivos e exibe o resultado no console.
public class Desafio {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		boolean neg = numeros.stream() // stream a partir da lista de números
							 .allMatch(n -> n > 0); // verifica se todos os números são maiores que zero (positivos).
		
		String resultado = neg ? "Todos os números da lista são positivos" : "A lista contém valores negativos";
		System.out.println(resultado);
	}
}
