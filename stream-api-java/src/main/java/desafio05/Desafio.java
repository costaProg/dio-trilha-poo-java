package main.java.desafio05;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

//Programa que utiliza Stream API para calcular a média dos números maiores que 5 e exibe o resultado no console.
public class Desafio {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		OptionalDouble media = numeros.stream()
									  .filter(n -> n > 5) // Filtra os valores maiores que 5
									  .mapToInt(Integer::intValue) // Converte os elementos do stream para um IntStream
									  .average(); // Calcula a média do IntStream
				
		String resultado = media.isPresent() ? "A média dos valores maiores que 5 é: "+media.getAsDouble() : "A lista não possui valores maiores do que 5";
		System.out.println(resultado);
	}
}
