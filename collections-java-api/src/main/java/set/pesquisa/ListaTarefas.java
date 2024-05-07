package main.java.set.pesquisa;
import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	//Conjunto de objetos do tipo "Tarefa" como atributo.
	private Set<Tarefa> tarefasSet;
	
	//Construtor do conjunto de objetos do tipo "Tarefa".
	public ListaTarefas() {
		this.tarefasSet = new HashSet<Tarefa>();
	}
	
	//Adiciona uma nova tarefa ao Set.
	public void adicionarTarefa(String descricao) {
		tarefasSet.add(new Tarefa(descricao));
	}
	
	//Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
	public void removerTarefa(String descricao) {
		if(!tarefasSet.isEmpty()) {
			for(Tarefa t : tarefasSet) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefasSet.remove(t);
					System.out.println("Tarefa removida com sucesso!!");
					break;
				}
			}
		} else {
			System.out.println("Lista de tarefas está vazia !!");
		}
	}
	
	//Exibe todas as tarefas da lista de tarefas.
	public void exibirTarefas() {
		if(!tarefasSet.isEmpty())
			System.out.println(tarefasSet);
		else
			System.out.println("Lista de tarefas está vazia !!");
	}
	
	//Conta o número total de tarefas na lista de tarefas.
	public void contarTarefas() {
		if(!tarefasSet.isEmpty())
			System.out.println("Total de tarefa(s): "+tarefasSet.size());
		else
			System.out.println("Lista de tarefas está vazia !!");
	}
	
	//Retorna um Set com as tarefas concluídas.
	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefasConcluidas = new HashSet<Tarefa>();
		if(!tarefasSet.isEmpty()) {
			for(Tarefa t : tarefasSet) {
				if(t.getTarefaConcluida()) {
					tarefasConcluidas.add(t);
				}
			}
		}else {
			System.out.println("Lista de tarefas está vazia !!");
		}
		return tarefasConcluidas;
	}

	//Retorna um Set com as tarefas pendentes.
	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasPendentes = new HashSet<Tarefa>();
		if(!tarefasSet.isEmpty()) {
			for(Tarefa t : tarefasSet) {
				if(!t.getTarefaConcluida()) {
					tarefasPendentes.add(t);
				}
			}
		}else {
			System.out.println("Lista de tarefas está vazia !!");
		}
		return tarefasPendentes;
	}
	
	//Marca uma tarefa como concluída de acordo com a descrição.
	public void marcarTarefaConcluida(String descricao) {
		if(!tarefasSet.isEmpty()) {
			for(Tarefa t : tarefasSet) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setTarefaConcluida(true);
					System.out.println("Tarefa com a descrição ' "+descricao+" ' marcada como concluída!");
					break;
				}
			}
		}else {
			System.out.println("Lista de tarefas está vazia!");
		}
	}
	
	//Marca uma tarefa como pendente de acordo com a descrição.
	public void marcarTarefaPendente(String descricao) {
		if(!tarefasSet.isEmpty()) {
			for(Tarefa t : tarefasSet) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setTarefaConcluida(false);
					System.out.println("Tarefa com a descrição ' "+descricao+" ' marcada como pendente!");
					break;
				}
			}
		}else {
			System.out.println("Lista de tarefas está vazia!");
		}
	}
	
	//Remove todas as tarefas da lista de tarefas.
	public void limparListaTarefas() {
		if(!tarefasSet.isEmpty()) {
			tarefasSet.removeAll(tarefasSet);
			System.out.println("Todas as tarefas foram removidas!!");
		}else {
			System.out.println("A lista de tarefas já está vazia!!");
		}
		
	}
	
}
