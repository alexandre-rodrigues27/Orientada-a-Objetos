package pkg;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Reserva> reservas = new ArrayList<>();
		
		ReservaOnline r1 = new ReservaOnline ("Alexandre", 101, 149.90, "alexandre@gmail.com");
		ReservaOnline r2 = new ReservaOnline ("Joana", 207, 130, "jo@gmail.com");
		
		ReservaPresencial r3 = new ReservaPresencial ("Joao", 403, 100, "Hotel");
		
		reservas.add(r1);
		reservas.add(r2);
		reservas.add(r3);
		
		for(Reserva r : reservas) {
			r.realizarReserva();
			r.cancelarReserva();
			System.out.println();
		}
		
		r1.realizarReserva("Alex", "CUPOM10");

	}

}
