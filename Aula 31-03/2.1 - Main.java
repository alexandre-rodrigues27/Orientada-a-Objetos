package pkg;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando contas
        ContaBancaria conta1 = new ContaBancaria("João", 1000);
        ContaBancaria conta2 = new ContaBancaria("Maria", 500);

        // Consultar saldo inicial
        System.out.println("Saldo inicial João: " + conta1.consultarSaldo());
        System.out.println("Saldo inicial Maria: " + conta2.consultarSaldo());

        // Depósito
        conta1.depositar(200);
        System.out.println("Após depósito, saldo João: " + conta1.consultarSaldo());

        // Saque
        boolean saque = conta1.sacar(150);
        System.out.println("Saque realizado? " + saque);
        System.out.println("Saldo João: " + conta1.consultarSaldo());

        // Saque sem saldo suficiente
        boolean saqueErro = conta1.sacar(2000);
        System.out.println("Saque realizado? " + saqueErro);
        System.out.println("Saldo João: " + conta1.consultarSaldo());

        // Transferência
        boolean transferencia = conta1.transferir(300, conta2);
        System.out.println("Transferência realizada? " + transferencia);

        // Saldos finais
        System.out.println("Saldo final João: " + conta1.consultarSaldo());
        System.out.println("Saldo final Maria: " + conta2.consultarSaldo());
		  
	}
}

