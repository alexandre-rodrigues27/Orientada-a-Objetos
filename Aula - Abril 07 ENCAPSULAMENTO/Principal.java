package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio: ");
        double valor = teclado.nextDouble();

        Circulo c = new Circulo(valor);

        System.out.println("Raio: " + c.getRaio());
        System.out.println("Área do círculo: " + c.calculaArea());

	}

}
