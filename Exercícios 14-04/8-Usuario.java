class Usuario {
    String nomeUsuario;
    String senha;
    boolean logado = false;

    // Método de login
    boolean login(String usuario, String senha) {
        if (this.nomeUsuario.equals(usuario) && this.senha.equals(senha)) {
            logado = true;
            return true;
        } else {
            logado = false;
            return false;
        }
    }

    // Método de logout
    void logout() {
        logado = false;
    }

    // Método para exibir status
    void exibirStatus() {
        if (logado) {
            System.out.println("Usuário está logado.");
        } else {
            System.out.println("Usuário NÃO está logado.");
        }
    }
}
