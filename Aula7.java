package pkg;

public class Aula7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pesquise quais são as Exceções existentes que já possuem tratamento e explique brevemente como cada uma 
		//funciona. Teste duas exceções.
		
		//NullPointerException = Quando você tenta usar um objeto que está vazio (null).
		//ArithmeticException = Erros em cálculos matemáticos.
		//NumberFormatException = Quando você tenta converter uma String em número, mas o texto não é numérico.
		//ArrayIndexOutOfBoundsException = Quando você tenta acessar uma posição (índice) de um array que não existe.
		//IllegalArgumentException = Usada para avisar que um argumento enviado a um método é inválido ou inadequado.
		//IOException = Erros de entrada e saída.
		
		String nome = null; 

        try {
            int tamanho = nome.length(); 
            System.out.println("O nome tem " + tamanho + " letras.");
            
        } catch (NullPointerException e) {
            System.out.println("Erro: Você tentou usar uma variável que está nula!");
        }
        
        
        try {
            int[] notas = {10, 8, 9}; 
            System.out.println(notas[5]); 
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Essa posição não existe na lista!");
        }
	}
}
        
      

          
