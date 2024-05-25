package main.java.desafio17;

import java.util.Arrays;
import java.util.List;

//Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
public class Desafio {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
	    List<Integer> numPrimos = numeros.stream().filter(Desafio::ehPrimo).toList();
	    
	    System.out.println("Lista de números primos: " + numPrimos);

	}
	
	// Função estática para verificar se um número é primo
    private static boolean ehPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
