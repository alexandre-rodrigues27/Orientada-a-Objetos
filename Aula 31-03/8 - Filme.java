package pkg;

public class Filme {
	private String titulo;
    private int duracao;
    private int classificacaoEtaria;

    public Filme(String titulo, int duracao, int classificacaoEtaria) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public double converterDuracaoHoras() {
        return duracao / 60.0;
    }

    public boolean podeAssistir(int idade) {
        return idade >= classificacaoEtaria;
    }

    public String descricaoFilme() {
        return "Título: " + titulo +
               "\nDuração: " + duracao + " minutos" +
               "\nClassificação etária: " + classificacaoEtaria + " anos" +
               "\nDuração em horas: " + converterDuracaoHoras();	    
	}

}
