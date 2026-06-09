package pkg2;

public class SaldoInsuficienteException extends IllegalArgumentException {
	public SaldoInsuficienteException (String mensagem) {
		super(mensagem);
	}

}
