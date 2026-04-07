package pkg;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Filme f = new Filme("Vingadores", 150, 12);

        System.out.println("=== FILME ===");
        System.out.println(f.descricaoFilme());

        int idade = 10;
        System.out.println("\nPode assistir com " + idade + " anos? " + f.podeAssistir(idade));
    }
}
