package pkg;

public class Funcionario {

    protected double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public void calcularSalario() {
        System.out.println("Salário do funcionário: " + salario);
    }
}
