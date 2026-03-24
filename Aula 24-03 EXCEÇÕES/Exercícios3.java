package pkg;
import java.util.Scanner;

public class Aula3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Faça o tratamento de exceções em conversões de valores lidos pelo teclado. Por exemplo, ao ler uma 
		//string e converter ela para double.

		Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Digite um valor: ");
            String texto = teclado.nextLine();

            double numero = Double.parseDouble(texto);

            System.out.println("Valor convertido: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite um número.");
        }
		        
	}
}
