package pkg;

public class ProdutoComDesconto extends Produto {

    private double percentualDesconto;

    public ProdutoComDesconto(double preco, double percentualDesconto) {
        super(preco);
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public void desconto() {
        double valorDesconto = preco * (percentualDesconto / 100);
        double precoFinal = preco - valorDesconto;

        System.out.println("Preço original: " + preco);
        System.out.println("Desconto: " + percentualDesconto + "%");
        System.out.println("Preço com desconto: " + precoFinal);
    }
}
