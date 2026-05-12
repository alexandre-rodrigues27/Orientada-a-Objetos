package pkg3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Endereco end = new Endereco ("Rua Andradas", 1614);
		//Pessoa p = new Pessoa ("UFN", 75, end);
		
		Pessoa p = new Pessoa ("UFN", 75, new Endereco("Rua Andradas", 1614));
		
		System.out.println("Nome: "+p.getNome());
		System.out.println("Idade: "+p.getIdade());
		System.out.println("Endereço: "+p.getEndereco().toString());
		System.out.println("Rua: "+p.getEndereco().getRua());
		System.out.println("Núm: "+p.getEndereco().getNumero());
	}

}
