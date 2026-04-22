class Produto {
    String nome;
    double preco;
    int quantidade;

    void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    double calcularValorTotal() {
        return preco * quantidade;
    }
}
