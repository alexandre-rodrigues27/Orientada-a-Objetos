package pkg2;

public class Main {

	public static void main(String[] args) {
		
		Circulo c = new Circulo(3.4);
		System.out.println("============== CÍRCULO ==============");
		System.out.println("Área do círculo: "+c.area());
		System.out.println("Perímetro do círculo: "+c.perimetro());
		
		System.out.println();
		
		Retangulo r = new Retangulo(3.7, 8.3);
		System.out.println("============== RETÂNGULO ==============");
		System.out.println("Área do retângulo: "+r.area());
		System.out.println("Perímetro do retângulo: "+r.perimetro());
	}
}
