//Crie uma classe chamada Produto com os atributos nome, preco e quantidade. Crie um construtor que inicialize esses 
//atributos. Implemente os métodos calcularValorTotalEstoque(), que deve retornar o valor total do estoque (preço multiplicado 
//pela quantidade), temEstoque(), que retorna true se a quantidade for maior que zero, adicionarEstoque(int quantidade), que 
//adiciona produtos ao estoque, e vender(int quantidade), que diminui a quantidade em estoque apenas se houver produtos suficientes, 
//retornando true caso a venda seja realizada e false caso contrário.

package pkg;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método que calcula o valor total do estoque
    public double calcularValorTotalEstoque() {
        return preco * quantidade;
    }

    // Método que verifica se há estoque
    public boolean temEstoque() {
        return quantidade > 0;
    }

    // Método para adicionar produtos ao estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        }
    }

    // Método para vender produtos
    public boolean vender(int quantidade) {
        if (quantidade > 0 && this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            return true;
        }
        return false;
    }
}
