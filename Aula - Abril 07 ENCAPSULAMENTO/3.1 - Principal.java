package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		ContaBancaria p = new ContaBancaria (100, 1000);
		
		System.out.println("Saldo atual: "+p.getSaldo());
		System.out.println("Limite: "+p.getLimite());
		
		System.out.println("Digite o novo saldo: ");
		double saldo = teclado.nextDouble();
		p.setSaldo(saldo);
		
		System.out.println("Digite o novo limite: ");
		double limite = teclado.nextDouble();
		p.setLimite(limite);
		
		
		System.out.println("Qual o valor do saque: ");
		double saque = teclado.nextDouble();
		p.sacar(saque);
		System.out.println("Novo Saldo: "+p.getSaldo());
		System.out.println("Novo Limite: "+p.getLimite());
	}
}
