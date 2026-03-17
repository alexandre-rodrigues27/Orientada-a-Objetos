package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		Carro c = new Carro("VW", "Fusca");
		System.out.println("Marca do carro: "+c.marca);
		System.out.println("Modelo do carro: "+c.modelo);
		
		Carro c4 = new Carro("Ford");
		System.out.println("Marca do carro: "+c4.marca);
		
		String marca, modelo;
		System.out.println("Digite a marca do carro: ");
		marca = teclado.nextLine();
		System.out.println("Digite o modelo do carro: ");
		modelo = teclado.nextLine();
	
		Carro c2 = new Carro (marca, modelo);
		System.out.println("Marca do carro 2: "+c2.marca);
		System.out.println("Modelo do carro 2: "+c2.modelo);
		
		System.out.println("Digite a marca e o modelo do carro: ");
		Carro c3 = new Carro (teclado.nextLine(), teclado.nextLine());
		System.out.println("Marca do carro 3: "+c3.marca);
		System.out.println("Modelo do carro 3: "+c3.modelo);
	}
	
}
