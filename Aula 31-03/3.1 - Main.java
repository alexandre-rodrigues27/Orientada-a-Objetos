package pkg;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Criando alunos
        Aluno aluno1 = new Aluno("Ana", 8, 7.5, 9);
        Aluno aluno2 = new Aluno("Carlos", 5, 6, 6.5);

        System.out.println("Aluno: " + aluno1.nome);
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println("Aprovado? " + (aluno1.aprovado() ? "Sim" : "Não"));
        System.out.println("Maior nota: " + aluno1.maiorNota());
        System.out.println("Menor nota: " + aluno1.menorNota());

        System.out.println("--------------------------");

        System.out.println("Aluno: " + aluno2.nome);
        System.out.println("Média: " + aluno2.calcularMedia());
        System.out.println("Aprovado? " + (aluno2.aprovado() ? "Sim" : "Não"));
        System.out.println("Maior nota: " + aluno2.maiorNota());
        System.out.println("Menor nota: " + aluno2.menorNota());	
	}
}

