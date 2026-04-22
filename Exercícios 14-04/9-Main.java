import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Filme filme = new Filme();

        // Entrada de dados
        System.out.print("Digite o título do filme: ");
        filme.titulo = sc.nextLine();

        System.out.print("Digite o diretor: ");
        filme.diretor = sc.nextLine();

        System.out.print("Digite a duração em minutos: ");
        filme.duracaoEmMinutos = sc.nextInt();
        sc.nextLine(); // limpar buffer

        System.out.print("Digite o gênero: ");
        filme.genero = sc.nextLine();

        // Exibir detalhes
        System.out.println("\n--- Detalhes do Filme ---");
        filme.exibirDetalhes();

        // Verificar se é longo
        if (filme.ehLongo()) {
            System.out.println("Esse filme é considerado LONGO.");
        } else {
            System.out.println("Esse filme NÃO é considerado longo.");
        }

        sc.close();
    }
}
