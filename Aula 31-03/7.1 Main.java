package pkg;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Pedido p = new Pedido(1, "Notebook", 3000.0, 2);

        System.out.println("=== RESUMO DO PEDIDO ===");
        System.out.println(p.resumoPedido());
        
        System.out.println("Desconto: " + p.calcularDesconto(10));
        System.out.println("Total: " + (p.calcularSubtotal() - p.calcularDesconto(10)));
	}
}
	
