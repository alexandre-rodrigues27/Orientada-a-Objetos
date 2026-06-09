package pkg;

public class Reserva {
	protected String nomeCliente;
	protected int numeroQuarto;
	protected double valorDiaria;
	protected boolean statusReserva;
	
	public Reserva (String nomeCliente, int numeroQuarto, double valorDiaria) {
		this.nomeCliente = nomeCliente;
		this.numeroQuarto = numeroQuarto;
		this.valorDiaria = valorDiaria;
		this.statusReserva = false;
}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public boolean isStatusReserva() {
		return statusReserva;
	}

	public void setStatusReserva(boolean statusReserva) {
		this.statusReserva = statusReserva;
	}
	
	public void realizarReserva() {
		
		statusReserva = true;
		
		System.out.println("Reserva realizada para: "+nomeCliente);
	}
	
	public void cancelarReserva() {
		
		statusReserva = false;
		
		System.out.println("Reserva cancelada para: "+nomeCliente);
	}
}

