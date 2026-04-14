package pkg;

public class Retangulo {

	private double base;
	private double altura;
	
	public Retangulo (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setBase (double base) {
		if (base > 0) {
			this.base = base;
		} else {
			System.out.println("A base deve ser maior que zero!");
		}
	}
	
	public void setAltura (double altura) {
		if (altura > 0) {
			this.altura = altura;
		} else {
			System.out.println("A altura deve ser maior que zero!");
		}
	}
	
	public double calcularArea() {
		return base * altura;
	}
	
	
}
