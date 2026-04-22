import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Tarefa[] tarefas = new Tarefa[3];

        // Entrada das tarefas
        for (int i = 0; i < tarefas.length; i++) {
            tarefas[i] = new Tarefa();

            System.out.print("Digite a descrição da tarefa " + (i + 1) + ": ");
            tarefas[i].descricao = sc.nextLine();
        }

        // Escolher uma tarefa para concluir
        System.out.print("Qual tarefa deseja marcar como concluída? (1 a 3): ");
        int escolha = sc.nextInt();

        if (escolha >= 1 && escolha <= 3) {
            tarefas[escolha - 1].concluirTarefa();
        } else {
            System.out.println("Opção inválida!");
        }

        // Exibir todas as tarefas
        System.out.println("\n--- Lista de Tarefas ---");
        for (int i = 0; i < tarefas.length; i++) {
            System.out.println("Tarefa " + (i + 1) + ":");
            tarefas[i].exibirTarefa();
        }

        sc.close();
    }
}
