package pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno = null;
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		Aluno a1 = new Aluno("Alexandre", 7);
		

		do {
			System.out.println("1-Criar aluno informando nome e nota");
			System.out.println("2-Exibir informações do aluno");
			System.out.println("3-Atibuir nota");
			System.out.println("4-Obter nota");
			System.out.println("5-Atribuir nome");
			System.out.println("6-Obter nome");
			System.out.println("7-Verificão aprovação");
			System.out.println("0-Sair");
			
			opcao = teclado.nextInt();
			teclado.nextLine();
			
			switch(opcao) {
				
				case 1:
					System.out.println("Digite o nome do aluno: ");
					String nome = teclado.nextLine();
					System.out.println("Digite a nota do aluno: ");
					double nota = teclado.nextDouble();	
					
					aluno = new Aluno (nome, nota);	
					break;
					
				case 2: 
					if (aluno != null) {
						aluno.exibirInformacoes();
					}
					break;
				
				case 3:
					if (aluno != null) {
						System.out.println("Digite a nova nota: ");
						double novaNota = teclado.nextDouble();
						aluno.setNota(novaNota);
					}
					break;
					
				case 4:
					if (aluno != null) {
						System.out.println("Nota: \n"+aluno.getNota());
					}
					break;
					
				case 5:
					if (aluno != null) {
						System.out.println("Digite o novo nome : ");
						String novoNome = teclado.nextLine();
						aluno.setNome(novoNome);
					}
					break;
					
				case 6:
					if (aluno != null) {
						System.out.println("Nome: "+aluno.getNome());
					}
					break;
					
				case 7:
					if (aluno != null) {
						aluno.aprovado();
					}
					break;
					
				case 0:
					System.out.println("Saindo..");
					break;
					
				default:
					System.out.println("Opção inválida..");
			}
		} while (opcao != 0);
	} 
}
		
	
		
		

