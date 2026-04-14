package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
        Triangulo t = new Triangulo();

        System.out.print("Digite o lado A: ");
        t.setLadoA(teclado.nextDouble());

        System.out.print("Digite o lado B: ");
        t.setLadoB(teclado.nextDouble());

        System.out.print("Digite o lado C: ");
        t.setLadoC(teclado.nextDouble());

        System.out.println(t.verificaEquilatero());

        teclado.close();
    }
}

