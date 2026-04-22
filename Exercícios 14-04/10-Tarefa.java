class Tarefa {
    String descricao;
    boolean concluida = false;

    // Método para concluir a tarefa
    void concluirTarefa() {
        concluida = true;
    }

    // Método para exibir a tarefa
    void exibirTarefa() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Status: " + (concluida ? "Concluída" : "Pendente"));
    }
}
