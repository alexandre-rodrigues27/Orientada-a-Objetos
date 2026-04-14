package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor da base: ");
		double valorBase = teclado.nextDouble();
		
		System.out.print("Digite o valor da altura: ");
		double valorAltura = teclado.nextDouble();
		
		Retangulo r = new Retangulo(valorBase, valorAltura);
		
		System.out.println("Base: " + r.getBase());
		System.out.println("Altura: " + r.getAltura());
		System.out.println("Área: " + r.calcularArea());
		
	}
}
