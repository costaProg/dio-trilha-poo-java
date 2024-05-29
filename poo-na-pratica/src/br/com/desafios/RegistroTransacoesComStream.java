package br.com.desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
          
            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

            // TODO: Criar uma nova transação e adicioná-la à lista de transações
            transacoes.add(new Transacao(tipoTransacao, valorTransacao));
            
            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (Character.toUpperCase(tipoTransacao) == 'D')
                saldo += valorTransacao;
            else if (Character.toUpperCase(tipoTransacao) == 'S')
                saldo -= valorTransacao;
            else
            	i--; // Decrementa o índice para repetir a iteração
        }

        System.out.println("\nSaldo : " + saldo);
        System.out.println("Transacoes:");
        transacoes.stream()
                .map(transacao -> transacao.toString())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return getTipo()+" de "+getValor();
    }
}
