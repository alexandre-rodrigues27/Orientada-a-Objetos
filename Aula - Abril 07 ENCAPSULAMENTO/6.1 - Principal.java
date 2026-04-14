package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

        Carro c = new Carro("Toyota", "Corola", 2020);

        System.out.print("Digite a marca: ");
        c.setMarca(teclado.nextLine());

        System.out.print("Digite o modelo: ");
        c.setModelo(teclado.nextLine());

        System.out.print("Digite o ano: ");
        c.setAno(teclado.nextInt());

        System.out.println("\nDetalhes do carro:");
        c.exibeDetalhes();

    }
}
