package pkg;

public class Carro {
	
	private String marca;
	private String modelo;
	private int ano;
	
	public Carro (String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setMarca(String marca) {
		if(marca.isBlank() || marca.isEmpty() || marca == null) {
			System.err.println("Marca inválida!");
		}
		else {
			this.marca = marca;
		}
	}
	
	public void setModelo(String modelo) {
		if(modelo.isBlank() || modelo.isEmpty() || modelo == null) {
			System.err.println("Modelo inválido!");
		}
		else {
			this.modelo = modelo;
		}
	}
	
	public void setAno(int ano) {
		if (ano <= 0) {
			System.err.println("Ano inválido!");
		}
		else {
			this.ano = ano;
		}
	}	
	
	public void exibeDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
	}
}
