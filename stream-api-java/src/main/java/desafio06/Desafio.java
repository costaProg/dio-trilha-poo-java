package main.java.desafio06;

import java.util.Arrays;
import java.util.List;

//Programa que utiliza Stream API para verificar se a lista contém algum número maior que 10 e exibe o resultado no console.
public class Desafio {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		boolean maior = numeros.stream()
							   .anyMatch(n -> n > 10); // Verifica se algum número no stream é maior que 10.
		
		String resultado = maior ? "A lista contém pelo menos um número maior que 10 " : "A lista não contém nenhum número maior que 10.";
		System.out.println(resultado);
	}
}