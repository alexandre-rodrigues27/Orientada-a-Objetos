package pkg;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p = new Pessoa ("Ricardo", 41);
		exibeDadosPessoa(p);
	}
	
	public static void exibeDadosPessoa(Pessoa pe) {
		System.out.println("No método exibeDadosPessoa");
		System.out.println("Nome: "+pe.getNome());
		System.out.println("Idade: "+pe.getIdade());
	}

}
