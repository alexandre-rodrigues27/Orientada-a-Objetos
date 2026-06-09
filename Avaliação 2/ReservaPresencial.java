package pkg;

public class ReservaPresencial extends Reserva {	
	private String local;
	
	public ReservaPresencial (String nomeCliente, int numeroQuarto, double valorDiaria, String local) {
		super(nomeCliente, numeroQuarto, valorDiaria);
		this.local = local;
	}
	
	@Override
	public void realizarReserva() {
		
		setStatusReserva(true);
		
		System.out.println("Reserva presencial realizada para: "+getNomeCliente() +" - Local: "+local);
	}
	
	@Override
	public void cancelarReserva() {
		
		setStatusReserva(false);
		
		System.out.println("Cancelamento realizado diretamente na recepção");
	}
}
