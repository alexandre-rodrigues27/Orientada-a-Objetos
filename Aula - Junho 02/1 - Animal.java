package pkg;

public abstract class Animal {
	public String especie;
	public int idade;
	public abstract void emiteSom();
	
	public void exibeInfo() {
		System.out.println("Espécie: "+especie);
		System.out.println("Idade: "+idade);
	}
	
}
