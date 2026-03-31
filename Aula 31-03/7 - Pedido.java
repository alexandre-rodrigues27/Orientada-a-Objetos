//Crie uma classe chamada Pedido com os atributos numero, produto, preco e quantidade. Crie um construtor que inicialize esses 
//atributos. Implemente os métodos calcularSubtotal(), que retorna o valor total do pedido (preço multiplicado pela quantidade), 
//calcularDesconto(double percentual), que retorna o valor do desconto aplicado ao subtotal, calcularTotal(double percentualDesconto), 
//que retorna o valor final do pedido após o desconto, e resumoPedido(), que retorna uma string com as informações principais do pedido.

package pkg;

public class Pedido {

    public int numero;
    public String produto;
    public double preco;
    public int quantidade;

    public Pedido(int numero, String produto, double preco, int quantidade) {
        this.numero = numero;
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return preco * quantidade;
    }

    public double calcularDesconto(double percentual) {
        return calcularSubtotal() * (percentual / 100);
    }

    public double calcularTotal(double percentualDesconto) {
        return calcularSubtotal() - calcularDesconto(percentualDesconto);
    }

    public String resumoPedido() {
        return "Pedido nº: " + numero +
               "\nProduto: " + produto +
               "\nPreço: " + preco +
               "\nQuantidade: " + quantidade +
               "\nSubtotal: " + calcularSubtotal();
    }
}


