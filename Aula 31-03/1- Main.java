package pkg;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Produto p = new Produto("Teclado", 100.0, 5);

		        System.out.println("Tem estoque? " + p.temEstoque());

		        boolean vendeu = p.vender(3);
		        System.out.println("Venda realizada? " + vendeu);

		        System.out.println("Quantidade atual: " + p.getQuantidade());
		        System.out.println("Valor total em estoque: " + p.calcularValorTotalEstoque());
		}
	}


