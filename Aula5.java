package pkg;
import java.util.Scanner;

public class Aula5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Escreva um programa que leia uma temperatura em String do teclado (ex: "25.5") e a converta para double para realizar
		//um cálculo (ex: converter para Fahrenheit). Use Double.parseDouble() para a conversão. Trate a exceção NumberFormatException, 
		//que ocorre se o usuário digitar algo como "25,5" (com vírgula) ou "vinte graus", impedindo a conversão.
		
		Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Digite a temperatura em Celsius (ex: 25.5): ");
            String entrada = teclado.nextLine();

            double celsius = Double.parseDouble(entrada);

            double fahrenheit = celsius * 9 / 5 + 32;

            System.out.printf("Temperatura em Fahrenheit: %.2f°F\n", fahrenheit);

        } catch (NumberFormatException e) {
            System.out.println("Erro: entrada inválida! Use ponto para decimais, por exemplo: 25.5");
        }
	}
}



