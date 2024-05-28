package bootcamp.br.com.desafio.model;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

	private LocalDate data;
	
	public Mentoria(String titulo, String descricao) {
		setTitulo(titulo);
		setDescricao(descricao);
		this.data = LocalDate.now();
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public double calcularXP() {
		return 30;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nMENTORIA: "
			   +"\nTítulo: "+ getTitulo()
			   +"\nDescrição: "+ getDescricao()
			   +"\nData da mentoria: "+ getData() +"\n";
	}
}
