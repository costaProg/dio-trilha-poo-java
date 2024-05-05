package telefone;

import funcionalidade.iphone.Iphone;

public class TelefoneMovel {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		System.out.println("Funcinalidade: Reprodutor Musical");
		iphone.tocar();
		iphone.pausar();
		iphone.selecionaMusica();
		System.out.println("\nFuncinalidade: Aparelho Telefonico");
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		System.out.println("\nFuncinalidade: Navegador na internet");
		iphone.exibirPagina();
		iphone.adicionaNovaAba();
		iphone.atualizaPagina();
	}
}
