package pkg;

public class Circulo {
	
	private double raio;
	
	public Circulo (double raio) {
		setRaio(raio);
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        } else {
            System.out.println("O raio deve ser maior que zero.");
        }
	}
        
    public double calculaArea() {
        return Math.PI * raio * raio;
    }
}
