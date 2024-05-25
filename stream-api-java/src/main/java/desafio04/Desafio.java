package main.java.desafio04;

import java.util.Arrays;
import java.util.List;

//Programa que utiliza Stream API para remover os valores ímpares da lista e imprimir a lista resultante no console.
public class Desafio {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		// Adiciona somente os numeros pares na lista, removendo assim os ímpares
		numeros = numeros.stream() // stream a partir da lista de números
						 .filter(n -> n % 2 == 0) // filtra os numeros pares
						 .toList(); // Coleta os elementos filtrados em uma nova lista
		
		// Imprime
		numeros.forEach(System.out::println);
		
	}
}
