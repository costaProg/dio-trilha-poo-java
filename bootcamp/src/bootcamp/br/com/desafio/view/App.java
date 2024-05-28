package bootcamp.br.com.desafio.view;
import bootcamp.br.com.desafio.model.Bootcamp;
import bootcamp.br.com.desafio.model.Conteudo;
import bootcamp.br.com.desafio.model.Curso;
import bootcamp.br.com.desafio.model.Dev;
import bootcamp.br.com.desafio.model.Mentoria;

public class App {
	public static void main(String[] args) {
		
		Conteudo cursoJava = new Curso("Fundamentos JAVA", "Curso introdutório a linguagem Java", 12);
		Conteudo cursoJS = new Curso("Fundamentos JavaScript", "Curso introdutótio a linguagem JavaScript", 8);
		Conteudo mentoria = new Mentoria("Mentoria POO", "Mentoria de programação orientada a objetos JAVA");
		
		Bootcamp bootcamp = new Bootcamp("Bootcamp", "Descrição teste");
		
		Dev devLucas = new Dev("lucas");
		Dev devMarcos = new Dev("Marcos");
		
		System.out.println("--------- Momento da inscrição no bootcamp ---------");
		devLucas.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos iniciados por Lucas: "+ devLucas.getConteudosIniciados());
		System.out.println("Conteúdos concluidos por Lucas: " + devLucas.getConteudosConcluidos());
		System.out.println("----------------------------------------------------");
		devMarcos.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos iniciados por Marcos: " + devMarcos.getConteudosIniciados());
		System.out.println("Conteúdos concluidos por Marcos: " + devMarcos.getConteudosConcluidos());
		System.out.println("----------------------------------------------------");
		
		System.out.println("----------------------------------------------------");
		devLucas.getConteudosIniciados().add(cursoJava);
		devLucas.getConteudosIniciados().add(cursoJS);
		devLucas.getConteudosIniciados().add(mentoria);
		System.out.println("Conteudos iniciados por Lucas: "+ devLucas.getConteudosIniciados());
		System.out.println("Conteúdos concluidos por Lucas: " + devLucas.getConteudosConcluidos());
		System.out.println("Total de XP do Lucas: " + devLucas.calcularTotalXp());
		System.out.println("----------------------------------------------------");
		devMarcos.getConteudosIniciados().add(cursoJava);
		devMarcos.getConteudosIniciados().add(cursoJS);
		devMarcos.getConteudosIniciados().add(mentoria);
		System.out.println("Conteudos iniciados por Marcos: "+ devLucas.getConteudosIniciados());
		System.out.println("Conteúdos concluidos por Marcos: " + devLucas.getConteudosConcluidos());
		System.out.println("Total de XP do Marcos: " + devMarcos.calcularTotalXp());
		System.out.println("----------------------------------------------------");
		
		System.out.println("----------------------------------------------------");
		devLucas.progredir();
		devLucas.progredir();
		devLucas.progredir();
		System.out.println("Conteudos iniciados por Lucas: "+ devLucas.getConteudosIniciados());
		System.out.println("Conteúdos concluidos por Lucas: " + devLucas.getConteudosConcluidos());
		System.out.println("Total de XP do Lucas: " + devLucas.calcularTotalXp());
		System.out.println("----------------------------------------------------");
		devMarcos.progredir();
		System.out.println("Conteudos iniciados por Marcos: "+ devMarcos.getConteudosIniciados());
		System.out.println("Conteúdos concluidos por Marcos: " + devMarcos.getConteudosConcluidos());
		System.out.println("Total de XP do Marcos: " + devMarcos.calcularTotalXp());
		System.out.println("----------------------------------------------------");
	}
}
