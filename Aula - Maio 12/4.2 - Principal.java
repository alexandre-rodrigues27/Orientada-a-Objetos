package pkg;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		Pessoa pessoa1 = new Pessoa ("João", 30);
		Pessoa pessoa2 = new Pessoa ("Maria", 25);
		Pessoa pessoa3 = new Pessoa ("Pedro", 40);
		
		listaPessoas.add(pessoa1);
		listaPessoas.add(pessoa2);
		listaPessoas.add(pessoa3);
		
		//Chamando um método e passando a lista como parâmetro
		exibirPessoas(listaPessoas);
	}
	
	public static void exibirPessoas(List<Pessoa> lista) {
		for (Pessoa p : lista) {
			System.out.println("Nome: "+p.getNome());
			System.out.println("Idade: "+p.getIdade());
		}
	}
	
	//public static void exibirPessoas2(List<Pessoa> lista) {
	//	for(int i=0;i<lista.size();i++) {
	//		System.out.println("Nome: "+lista.get(i).getNome());
	//		System.out.println("Idade: "+lista.get(i).getIdade());
	//	}
	//}
}
