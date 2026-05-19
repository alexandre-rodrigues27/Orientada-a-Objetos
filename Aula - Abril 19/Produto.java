package pkg;

public class Produto {

    protected double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    public void desconto() {
        System.out.println("Preço original: " + preco);
    }
}