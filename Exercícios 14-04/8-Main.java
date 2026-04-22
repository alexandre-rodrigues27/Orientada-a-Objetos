import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Usuário criado com dados fixos
        Usuario u = new Usuario();
        u.nomeUsuario = "admin";
        u.senha = "1234";

        // Entrada de dados para login
        System.out.print("Digite o usuário: ");
        String usuarioDigitado = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senhaDigitada = sc.nextLine();

        // Tentativa de login
        boolean sucesso = u.login(usuarioDigitado, senhaDigitada);

        if (sucesso) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }

        // Exibir status
        u.exibirStatus();

        // Perguntar se deseja fazer logout
        System.out.print("Deseja fazer logout? (s/n): ");
        String resposta = sc.next();

        if (resposta.equalsIgnoreCase("s")) {
            u.logout();
            System.out.println("Logout realizado.");
        }

        // Exibir status final
        u.exibirStatus();

        sc.close();
    }
}
