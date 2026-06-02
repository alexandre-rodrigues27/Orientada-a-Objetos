package pkg;

public class Cachorro extends Animal{
	public String raca;

	@Override
	public void emiteSom() {
		System.out.println("au au au");
	}
	
	public void cuidarPatio() {
		System.out.println("O cachorro cuida do pátio!");
	}
	
	@Override
	public void exibeInfo() {
		System.out.println("Espécie: "+especie);
		System.out.println("Idade: "+idade);
		//super.exibeInfo();
		System.out.println("Raça: "+raca);
	}
	
}
