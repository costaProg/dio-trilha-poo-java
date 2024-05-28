package bootcamp.br.com.desafio.model;

public class Curso extends Conteudo {

	private int cargaHoraria;
	
	public Curso(String titulo, String descricao, int cargaHoraria) {
		setTitulo(titulo);
		setDescricao(descricao);
		this.cargaHoraria = cargaHoraria;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public double calcularXP() {
		return XP_PADRAO * (double)this.cargaHoraria;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nCURSO: "
			   +"\nTítulo: "+ getTitulo()
			   +"\nDescrição: "+ getDescricao()
			   +"\nCarga Horária: "+ getCargaHoraria() +"\n";
	}
}
