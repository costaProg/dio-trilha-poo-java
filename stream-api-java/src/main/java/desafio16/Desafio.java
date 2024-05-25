package main.java.desafio16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares
e outra contendo os números ímpares da lista original, e exiba os resultados no console.*/
public class Desafio {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Map<Boolean, List<Integer>> numParticionados = numeros.stream()
															  .collect(Collectors.partitioningBy(n -> n % 2 == 0));
		
		List<Integer> numPares = numParticionados.get(true);
		List<Integer> numImpares = numParticionados.get(false);
		
		System.out.println("Números pares: " + numPares);
		System.out.println("Números ímpares: " + numImpares);
	}
}
