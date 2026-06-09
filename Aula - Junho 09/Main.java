package pkg2;

public class Main {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente (100, 1000);
		System.out.println(cc.getSaldo());
		cc.depositar(10);
		cc.sacar(-100);
	}
}
