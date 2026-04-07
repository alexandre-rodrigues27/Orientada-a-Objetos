package pkg;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		//this.idade = idade;
		this.setIdade(idade); //chamando o set pois tenho validação 
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String nome) {
		if(nome.isBlank() || nome.isEmpty() || nome == null) {
			System.err.println("Nome inválido!");
		}
		else {
			this.nome = nome;
		}
	}
	
	public void setIdade(int idade) {
		if (idade <= 0) {
			System.out.println("Impossível atribuir idade.");
			System.err.println("Idade inválida!");
		}
		else {
        this.idade = idade;
		}
	}
}
