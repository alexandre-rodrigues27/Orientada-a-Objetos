package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pessoa p = new Pessoa();
		//p.nome = "Ricardo";
		//p.idade = 40;
		
		Scanner teclado = new Scanner(System.in);
		Pessoa p = new Pessoa("Ricardo", 40);
		//String nome;
		//nome = p.getNome(); //este método retorna uma string com o nome
		//System.out.println("Nome: "+nome);
		
		System.out.println("Nome: "+p.getNome());
		System.out.println("Idade: "+p.getIdade());
		
		System.out.println("Digite o novo nome: ");
		String nome = teclado.nextLine();
		p.setNome(nome);
		System.out.println("Novo nome: "+p.getNome());
		
		System.out.println("Digite a nova idade: ");
		p.setIdade(teclado.nextInt());
		System.out.println("Nova idade: "+p.getIdade());
	}
}
