package pkg3;

public class Main {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.nome = "Caramelo";
		c.raca = "Labrador";
		c.idade = 12;
		
		c.emitirSom();
		c.exibirInfo();
		System.out.println("Chamando verificação do cachorro: "+c.verificarVacinacao());
		
		System.out.println();
		
		Gato g = new Gato();
		g.emitirSom();
		g.exibirInfo();
		System.out.println("Chamando verificação do gato: "+g.verificarVacinacao());	
	}

}
