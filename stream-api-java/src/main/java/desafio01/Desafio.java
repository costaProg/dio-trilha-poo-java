package main.java.desafio01;

import java.util.Arrays;

import java.util.List;

//Programa que utiliza a Stream API para ordenar a lista de números em ordem crescente e exibe no console.
public class Desafio {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		List<Integer> numerosOrdenados = numeros.stream() // stream a partir da lista de números
												.sorted() // Ordena os valores de maneira crescente
												.toList(); // Coleta uma objeto para a lista
		
		numerosOrdenados.forEach(System.out::println);
		
	}
}
