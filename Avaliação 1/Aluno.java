package pkg;

public class Aluno {
	private String nome;
	private double nota;
	public int opcao;
	
	Aluno (String nome, double nota){
		this.nome = nome;
		this.nota = nota;
	}
	
	public String getNome() { 
		return nome;
	}
	
	public double getNota() { 
		return nota;
	}
	
	public void setNome(String nome) { 
		this.nome = nome;
	}
	
	public void setNota(double nota) { 
		this.nota = nota;
	}
	
	public void aprovado() {
		if (nota >= 7) {
			System.out.println("---APROVADO---");
		} else {
			System.out.println("---REPROVADO---");
		}
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: "+nome);
		System.out.println("Nota: "+nota);
	}
	
}
