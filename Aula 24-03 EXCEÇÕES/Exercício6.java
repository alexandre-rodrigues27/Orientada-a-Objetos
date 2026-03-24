package pkg;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escreva um programa que tenha um valor fixo de premiação (ex: double premio = 5000.0). Peça ao usuário para digitar quantos 
		//ganhadores dividirão esse prêmio.Tratamento 1: Use ArithmeticException para o caso de o usuário digitar 0 (divisão por zero).
		//Tratamento 2: Use InputMismatchException para garantir que ele digitou um número inteiro.
		
		double premio = 5000.0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Digite o número de ganhadores: ");
            int ganhadores = teclado.nextInt();

            double valorPorPessoa = premio / ganhadores;
            System.out.println("Cada ganhador receberá: R$ " + valorPorPessoa);

        } catch (InputMismatchException e) {
            System.out.println("Erro: digite um número inteiro.");
            
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
	}
}
