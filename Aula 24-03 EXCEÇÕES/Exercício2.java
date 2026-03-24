package pkg;
import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Faça o tratamento de exceções em uma calculadora.

		Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double num1 = teclado.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = teclado.nextDouble();

            System.out.print("Operação (+, -, *, /): ");
            char op = teclado.next().charAt(0);

            double resultado = 0;

            switch (op) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                	 if (num2 == 0) {
                         throw new ArithmeticException("Divisão por zero!");
                     }
                     resultado = num1 / num2;
                     break;
            }

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
			System.out.println("Erro: erro de aritmética \n"+e.getMessage());
			
          } catch (NumberFormatException e) {
			System.out.println("Erro: formato inválido \n"+e.getMessage());	
			
            } catch (Exception e) {
			System.out.println("Erro: número inteiro inválido\n"+e.getMessage());
			
              }
    }
}
