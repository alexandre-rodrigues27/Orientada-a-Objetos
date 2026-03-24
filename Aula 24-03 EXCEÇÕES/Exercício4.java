package pkg;
import java.util.Scanner;

public class Aula4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Crie um array de Strings com 5 nomes de pessoas (ex: "Ana", "Carlos", etc.). Peça ao usuário para digitar um 
		//número de 0 a 4 para ver quem está naquela posição. Trate a exceção caso o usuário digite um índice que não 
		//existe (ex: 10 ou -1), usando ArrayIndexOutOfBoundsException. Trate também se ele digitar uma letra.

		String[] nomes = {"Ana", "Carlos", "Pedro", "João", "Maria"};
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Digite um número de 0 a 4 para ver o nome correspondente: ");
            int indice = Integer.parseInt(teclado.nextLine());

            System.out.println("Nome na posição " + indice + ": " + nomes[indice]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Digite um número entre 0 e 4.");
            
        } catch (NumberFormatException e) {
            System.out.println("Erro: entrada inválida! Digite um número inteiro.");
            
        }
	}
}
