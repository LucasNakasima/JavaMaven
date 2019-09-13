package Aep2;

import Aep2.Aluno;
import Aep2.Avaliacao;

public class App {
	public static void main(String[] args) 
	{	
		
		Avaliacao avaliacao = new Avaliacao("Matematica", "23/09/2019");
		Aluno aluno= new Aluno("Lucas Matheus",8);
		Aluno aluno2= new Aluno("João Rodriguez",5);
		Aluno aluno3= new Aluno("Elisa Silva",6.5);
		
		Avaliacao avaliacao2 = new Avaliacao("Português", "03/10/2019");
		Aluno aluno4= new Aluno("Leonardo Pereira",3.5);
		Aluno aluno5= new Aluno("Marcela Souza",10);
		
		ExibeAvaliacao(avaliacao);
		ExibeAluno(aluno);
		ExibeAluno(aluno2);
		ExibeAluno(aluno3);
		System.out.println("----------------------------------------------------");
		System.out.println("");
		ExibeAvaliacao(avaliacao2);
		ExibeAluno(aluno4);
		ExibeAluno(aluno5);
		ExibeAluno(aluno3);
		System.out.println("----------------------------------------------------");
		
	}					
	
	public static void ExibeAvaliacao(Avaliacao avaliacao)
	{
		System.out.println("----------------------------------------------------");
		System.out.println("Prova: " + avaliacao.getAvaliacao() + " - Data: " + avaliacao.getData());
		System.out.println("----------------------------------------------------");
	}	
	public static void ExibeAluno(Aluno aluno) 
	{					
		System.out.println("Aluno: " + aluno.getId() + " - Nota: " + aluno.getNota());			
	}		
}
