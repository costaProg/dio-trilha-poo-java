package main.java.desafio02;

import java.util.Arrays;
import java.util.List;

//Programa que utiliza Stream API para realizar a soma dos números pares de uma lista e exibe o resultado no console.
public class Desafio {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		int somaNumPares = numeros.stream() // stream a partir da lista de números
								  .filter(n -> n % 2 == 0) // Filtra os números pares
								  .mapToInt(Integer::intValue) // Converte para IntStream
								  .sum(); // Soma os números
						
		System.out.println("A soma dos números pares é: "+somaNumPares);
	}
}
