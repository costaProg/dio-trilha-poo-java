package main.java.desafio15;

import java.util.Arrays;
import java.util.List;

//Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
public class Desafio {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		
		boolean numNeg = numeros.stream()
								.anyMatch(n -> n < 0);
		
		String resultado = numNeg ? "A lista contém pelo menos um número negativo" : "A lista não possui nenhum número negativo";
		System.out.println(resultado);
		
	}
}
