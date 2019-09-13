package Aep2;

public class Aluno 
{
	private String id;
	private double nota;
	
	
	public Aluno(String id, double nota) 
	{
		this.id = id;
		if (nota <= 10 && nota >= 0) {			
			this.nota = nota;
		}
		else {
			throw new RuntimeException("A nota do aluno precisa estar entre 0 e 10");
		}
	}
	
	public String getId() {
		return id;
	}
	
	public double getNota() {
		return nota;
	}		
}