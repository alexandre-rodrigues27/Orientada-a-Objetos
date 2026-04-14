package pkg4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.print("Digite o nome: ");
        p.setNome(teclado.nextLine());

        System.out.print("Digite a idade: ");
        p.setIdade(teclado.nextInt());
        teclado.nextLine(); 

        System.out.print("Digite o CPF: ");
        p.setCpf(teclado.nextLine());

        System.out.println("\nResultado:");
        System.out.println(p.verificaMaiorDeIdade());

        teclado.close();
    }
}
