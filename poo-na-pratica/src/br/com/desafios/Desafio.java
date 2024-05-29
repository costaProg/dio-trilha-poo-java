package br.com.desafios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        String titular = scanner.next();
        int numeroConta = scanner.nextInt();
        double saldo = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
        scanner.close();
    }
}

class ContaBancariaDesafio {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancariaDesafio () {
    
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }
}

class ContaPoupanca extends ContaBancariaDesafio {
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        //TODO: Implementar adequadamente esta sobrecarga de construtores.
    	super.numero = numero;
    	super.titular = titular;
    	super.saldo = saldo;
    	this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
    	DecimalFormat decimalFormat = new DecimalFormat("#.0");
        super.exibirInformacoes();
        //TODO: Complementar as informações com a taxa de juros.
        System.out.println("Taxa de juros: "+decimalFormat.format(this.getTaxaJuros()) + "%");
        
    }

	public double getTaxaJuros() {
		return taxaJuros;
	}
}
