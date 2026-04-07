package pkg;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro c = new Carro ("Gol", 70, 150);
		
		System.out.println("Velocidade atual: "+ c.velocidadeAtual);
		
		c.acelerar(3);
		System.out.println("Velocidade após acelerar: "+ c.velocidadeAtual);
		
		c.frear(2);
		System.out.println("Velocidade após frear: "+ c.velocidadeAtual);
		
		System.out.println("Atingiu a velocidade máxima? "+ c.atingiuVelocidadeMaxima());
		
		System.out.printf("Tempo aproximado de viagem: %.2f horas", c.calcularTempoViagem(320));
	}
}
