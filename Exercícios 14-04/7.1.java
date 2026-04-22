import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Produto p1 = new Produto();

        System.out.print("Digite o nome do produto: ");
        p1.nome = teclado.nextLine();

        System.out.print("Digite o preço: ");
        p1.preco = teclado.nextDouble();

        System.out.print("Digite a quantidade: ");
        p1.quantidade = teclado.nextInt();

        Produto p2 = new Produto();
        p2.nome = "Notebook";
        p2.preco = 3500.00;
        p2.quantidade = 5;

        System.out.println("Produto 1");
        p1.exibirInformacoes();
        System.out.println("Valor total: " + p1.calcularValorTotal());

        System.out.println("Produto 2");
        p2.exibirInformacoes();
        System.out.println("Valor total: " + p2.calcularValorTotal());

    }
}
