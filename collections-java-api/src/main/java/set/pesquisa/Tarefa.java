package main.java.set.pesquisa;

public class Tarefa {
	private String descricao;
	private boolean tarefaConcluida;
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
		this.tarefaConcluida = false;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public boolean getTarefaConcluida() {
		return tarefaConcluida;
	}

	public void setTarefaConcluida(boolean tarefaConcluida) {
		this.tarefaConcluida = tarefaConcluida;
	}
	
	@Override
	public String toString() {
		return "\n{ Tarefa: "
				+"\nDescrição: "+getDescricao()
				+"\nTarefa Concluída: "+getTarefaConcluida()
				+"\n}";
	}
}
