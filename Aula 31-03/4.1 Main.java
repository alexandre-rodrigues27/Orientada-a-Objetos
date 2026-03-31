package pkg;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Retangulo r = new Retangulo (4, 3);
		
		System.out.println("Área = " + r.calcularArea());
		System.out.println("Perímetro = " + r.calcularPerimetro());
		System.out.println("Diagonal = " + r.calcularDiagonal());
		System.out.println("É quadrado? = " + r.ehQuadrado());
	}
}
