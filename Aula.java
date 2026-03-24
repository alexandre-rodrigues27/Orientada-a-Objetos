package pkg;
import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escreva um programa que solicita ao usuário para digitar um número inteiro e exiba a raiz quadrada 
		//desse número. Certifique-se de que o programa trate adequadamente as exceções se o usuário digitar um valor inválido, 
		//por exemplo, ler um char ou string.

		Scanner teclado = new Scanner (System.in);
		
		try {
			System.out.println("Digite um número inteiro: ");
			int numero = teclado.nextInt();
		
			if (numero < 0) {
                System.out.println("Não é possível calcular a raiz de número negativo.");
            } else {
                double raiz = Math.sqrt(numero);
                System.out.println("A raiz quadrada de " + numero + " é " + raiz);
            }
			
			
		} catch (Exception e) {
			System.out.println("Erro: número inteiro inválido\n"+e.getMessage());
		}
		        
		        
		      

		        
		        
		        
		        
	}
}