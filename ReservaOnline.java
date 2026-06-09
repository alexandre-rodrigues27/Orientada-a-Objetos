package pkg;

public class ReservaOnline extends Reserva {
	private String email;
	
	public ReservaOnline (String nomeCliente, int numeroQuarto, double valorDiaria, String email) {
		super (nomeCliente, numeroQuarto, valorDiaria);
		this.email = email;
		
	}
	
	@Override
	public void realizarReserva() {
		setStatusReserva(true);
		System.out.println("Reserva online realizada para: "+getNomeCliente() +" - E-mail: "+email);
	}
	
	public void realizarReserva (String nomeCliente) {
		setStatusReserva(true);
		System.out.println("Reserva online realizada para: "+nomeCliente);
	}
	
	public void realizarReserva (String nomeCliente, String cupom) {
		setStatusReserva(true);
		System.out.println("Reserva online realizada para: "+nomeCliente +" - Cupom: "+cupom);
	}
	
	@Override
	public void cancelarReserva() {
		setStatusReserva (false);
		
		System.out.println("Cancelamento permitido apenas" + "até 24 horas antes da hospedagem");
	}
}
