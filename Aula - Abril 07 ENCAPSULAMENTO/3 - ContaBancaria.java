package pkg;

public class ContaBancaria {
	
	private double saldo;
	private double limite;
	
	public ContaBancaria(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setSaldo(double saldo) {
			this.saldo = saldo;
	}
	
	public void setLimite(double limite) {
		if(limite < 0) {
			System.err.println("Limite inválido!");
		}
		else {
			this.limite = limite;
		}
	}

	public void sacar(double saque) {
		if (saque > this.saldo) {
			System.err.println("Saldo insuficiente!");
		}
		else {
			this.saldo -= saque;
		}
		
	}

}
