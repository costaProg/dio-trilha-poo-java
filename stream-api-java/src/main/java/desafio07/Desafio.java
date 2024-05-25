package main.java.desafio07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Programa que utiliza a  Stream API para encontrar o segundo número maior da lista e exibe o resultado no console.
public class Desafio {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Optional<Integer> segundoMaior = numeros.stream()
												.distinct() // Remove duplicatas
												.sorted(Comparator.reverseOrder()) //Ordena em ordem decrescente
												.skip(1) // Pula o maior número
												.findFirst(); // Encontra o segundo maior
		
		String resultado =  segundoMaior.isPresent() ? "Segundo maior valor da lista: "+segundoMaior.get() : "A lista contém apenas um valor ou a mesma está vazia!";
		System.out.println(resultado);
	}
}
