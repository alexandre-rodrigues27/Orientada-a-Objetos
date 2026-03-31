package pkg;

public class Time {
	public String nome;
    public int golsMarcados;
    public int golsSofridos;

    public Time(String nome, int golsMarcados, int golsSofridos) {
        this.nome = nome;
        this.golsMarcados = golsMarcados;
        this.golsSofridos = golsSofridos;
    }

    public void marcarGol() {
        golsMarcados++;
    }

    public void sofrerGol() {
        golsSofridos++;
    }

    public int saldoGols() {
        return golsMarcados - golsSofridos;
    }
    
    public String resultadoPartida() {
        if (saldoGols() > 0) {
            return "Vitória";
        } else if (saldoGols() == 0) {
            return "Empate";
        } else {
            return "Derrota";
        }
    }
}


