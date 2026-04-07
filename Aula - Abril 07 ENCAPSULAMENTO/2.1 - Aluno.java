package pkg;

public class Aluno {
	
	private String nome;
	private double nota1, nota2;
	
	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public void setNome(String nome) {
		if(nome.isBlank() || nome.isEmpty() || nome == null) {
			System.err.println("Nome inválido!");
		}
		else {
			this.nome = nome;
		}
	}
	
	public void setNota1(double nota1) {
		if(nota1 < 0) {
			System.err.println("Nota 1 inválida!");
		}
		else {
			this.nota1 = nota1;
		}
	}
	
	public void setNota2(double nota2) {
		if(nota2 < 0) {
			System.err.println("Nota 2 inválida!");
		}
		else {
			this.nota2 = nota2;
		}
	}	
	
	public double calculaMedia() {
		return (nota1 + nota2) / 2;
	}
}
