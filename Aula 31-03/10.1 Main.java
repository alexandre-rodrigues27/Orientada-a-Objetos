package pkg;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Time t = new Time("Brasil", 0, 0);

	        // Simulando jogo
	        t.marcarGol();
	        t.marcarGol();
	        t.sofrerGol();

	        System.out.println("Time: "+ t.nome);
	        System.out.println("Gols marcados: " + t.saldoGols());
	        System.out.println("Resultado: " + t.resultadoPartida());
	    }
	}
