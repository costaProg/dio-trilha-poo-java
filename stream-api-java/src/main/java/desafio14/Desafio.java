package main.java.desafio14;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
public class Desafio {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
        // Encontra o maior número primo na lista
        Optional<Integer> ehPrimo = numeros.stream()
                                                .filter(Desafio::ehPrimo) // Filtra apenas os números primos
                                                .max(Integer::compareTo); // Encontra o maior número primo

        // Exibe o resultado no console
        if (ehPrimo.isPresent()) {
            System.out.println("O maior número primo na lista é: " + ehPrimo.get());
        } else {
            System.out.println("A lista não contém números primos.");
        }
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
