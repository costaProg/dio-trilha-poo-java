package main.java.desafio13;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico e exiba o resultado no console.
public class Desafio {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		System.out.print("Informe o primeiro valor do intervalo: ");
		int o = scan.nextInt();
		System.out.print("Informe o segundo valor do intervalo: ");
		int p = scan.nextInt();
		
		List<Integer> intervalo = numeros.stream().filter(n -> n >= o && n <= p).toList();
		
		System.out.println("Numeros no intervalo dado: "+intervalo);
		
		scan.close();
	}
}
