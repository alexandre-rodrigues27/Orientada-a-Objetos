//Crie uma classe chamada ContaBancaria com os atributos titular e saldo. Crie um construtor que inicialize esses 
//atributos. Implemente os métodos depositar(double valor), que adiciona um valor ao saldo, sacar(double valor), que 
//realiza o saque apenas se houver saldo suficiente e retorna true ou false, transferir(double valor, ContaBancaria destino), 
//que transfere um valor para outra conta caso haja saldo suficiente, e consultarSaldo(), que retorna o saldo atual da conta.

package pkg;

public class ContaBancaria {
	public String titular;
	public double saldo;
	
	//Contrutor
	
	public ContaBancaria (String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	// Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // Método para sacar
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    // Método para transferir
    public boolean transferir(double valor, ContaBancaria destino) {
        if (sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    // Método para consultar saldo
    public double consultarSaldo() {
        return saldo;
    }

    // (Opcional) Getter do titular
    public String getTitular() {
        return titular;
    }
}
