package main.java.desafio09;

import java.util.Arrays;
import java.util.List;

//Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
public class Desafio {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		boolean valoresDistintos = numeros.stream()
										  .distinct()
										  .count() == numeros.size();
		
	String resultado = valoresDistintos ? "Todos os valores são distintos" : "Existe pelo menos um valor repetido";
	System.out.println(resultado);
	}
}
