package pkg;

public class Gerente extends Funcionario {

    private double bonus;

    public Gerente(double salario, double bonus) {
        super(salario);
        this.bonus = bonus;
    }

    @Override
    public void calcularSalario() {
        double salarioFinal = salario + bonus;

        System.out.println("Salário base: " + salario);
        System.out.println("Bônus: " + bonus);
        System.out.println("Salário do gerente: " + salarioFinal);
    }
}
