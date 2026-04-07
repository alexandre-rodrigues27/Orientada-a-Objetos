package pkg;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario f = new Funcionario("João", 2000, 10);

        System.out.println("Valor horas extras: " + f.calcularValorHoraExtra());
        System.out.println("Pagamento total: " + f.calcularPagamentoTotal());

        f.adicionarHorasExtras(5);

        System.out.println("Novo valor horas extras: " + f.calcularValorHoraExtra());
        System.out.println("Novo pagamento total: " + f.calcularPagamentoTotal());
        System.out.println("Salário anual: " + f.salarioAnual());
    }
}
