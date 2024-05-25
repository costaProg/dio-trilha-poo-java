package main.java.desafio08;

import java.util.Arrays;
import java.util.List;

//Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
public class Desafio {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		int somaDigitos = numeros.stream()
								 .mapToInt(n -> String.valueOf(n) // Converte o número para string
										 			  .chars() // Cria um stream de chars
										 			  .map(Character::getNumericValue) // Converte cada char para o valor numérico correspondente
										 			  .sum()) // Soma os dígitos do número
								 .sum(); // Soma os resultados dos números individuais
		
		System.out.println(somaDigitos);
	}
}
