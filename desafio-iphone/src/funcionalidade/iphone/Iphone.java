package funcionalidade.iphone;

import funcionalidade.navegador.NavegadorInternet;
import funcionalidade.reprodutor.ReprodutorMusical;
import funcionalidade.telefonico.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	public void exibirPagina() {
		System.out.println("Exibindo página...");
	}

	public void adicionaNovaAba() {
		System.out.println("Nova aba adicionada ao navegador");
	}

	public void atualizaPagina() {
		System.out.println("Página atualizada");
	}

	public void ligar() {
		System.out.println("Ligando...");
	}

	public void atender() {
		System.out.println("Telefone Atendido");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}

	public void tocar() {
		System.out.println("Musica tocando..");
	}

	public void pausar() {
		System.out.println("Musica Pausada !");
	}

	public void selecionaMusica() {
		System.out.println("Musica selecionada !");
	}
	
}
