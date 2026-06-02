package pkg3;

public class Cachorro implements Animal {
	
	public String nome;
	public String raca;
	public int idade;
	
	@Override 
	public void emitirSom() {
		System.out.println("auau!");
	}
	
	@Override
	public void exibirInfo() {
		System.out.println("========== CACHORRO ==========");
		System.out.println("Nome: "+nome);
		System.out.println("Raça: "+raca);
		System.out.println("Idade: "+idade);
	}

	@Override
	public boolean verificarVacinacao() {
		System.out.println("Verificando vacinação do cachorro...");
		return false;
	}

}
