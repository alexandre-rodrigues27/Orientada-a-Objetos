package pkg2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto p1 = new Produto ("Caneta", 1.5);
		//Produto p2 = p1.clone(); //Criando uma copia de P1
		Produto p2 = p1.aponta(); //Apontando para o p2
		
		System.out.println("P1: "+p1.getNome()+" - Preço: "+p1.getPreco());
		System.out.println("P2: "+p2.getNome()+" - Preço: "+p2.getPreco());
		
		p2.setPreco(2.33);
		System.out.println("P1: "+p1.getNome()+" - Preço: "+p1.getPreco());
		System.out.println("P2: "+p2.getNome()+" - Preço: "+p2.getPreco());
	}

}
