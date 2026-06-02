package pkg;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Animal a = new Animal();
		
		//Cachorro c = new Cachorro();
		//c.emitesom();
		
		//Tigre t = new Tigre();
		//t.emitesom();
			
		Scanner teclado = new Scanner(System.in);
		Animal a;
		int op;
		
		System.out.println("Digite: ");
		System.out.println("1 - Para instanciar um Cachorro");
		System.out.println("2 - Para instanciar um Tigre");
		op = teclado.nextInt();
		
		if (op==1) {
			Cachorro a1 = new Cachorro();
			a1.especie = "Cuscus";
			a1.idade = 10;
			a1.raca = "Pitbull";
			a1.emiteSom();
			a1.exibeInfo();
			a1.cuidarPatio();
			
		} else {
			Animal a1 = new Tigre();
			a1.especie = "Tigrão";
			a1.idade = 8;
			a1.emiteSom();
			a1.exibeInfo();
		}
	}
}
