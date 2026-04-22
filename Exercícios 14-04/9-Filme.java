class Filme {
    String titulo;
    String diretor;
    int duracaoEmMinutos;
    String genero;

    // Método para exibir detalhes
    void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
        System.out.println("Gênero: " + genero);
    }

    // Método para verificar se é longo
    boolean ehLongo() {
        return duracaoEmMinutos > 120;
    }
}
