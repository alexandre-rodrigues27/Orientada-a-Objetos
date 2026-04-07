package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		Aluno p = new Aluno("Alexandre", 70, 60.5);
	
		System.out.println("Nome: "+p.getNome());
		System.out.println("Nota 1: "+p.getNota1());
		System.out.println("Nota 2: "+p.getNota2());
		
		System.out.println("Digite o novo nome: ");
		String nome = teclado.nextLine();
		p.setNome(nome);
		
		System.out.println("Digite a nova nota 1: ");
		double nota1 = teclado.nextDouble();
		p.setNota1(nota1);
		
		System.out.println("Digite a nova nota 2: ");
		double nota2 = teclado.nextDouble();
		p.setNota2(nota2);
		
		System.out.println("Novo nome: "+p.getNome());
		System.out.println("Nova nota 1: "+p.getNota1());
		System.out.println("Nova nota 2: "+p.getNota2());
		System.out.println("Média do aluno :"+p.calculaMedia());
	}
}
