package pkg2;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main {

	public static void main(String[] args) {
		// Criando um obejto para serializar
		Pessoa p = new Pessoa("Ricardo", 30);
		
		//Convertendo o objeto em um JSONObject
		JSONObject json = new JSONbject();
		json.put("nome", p.getNome());
		json.put("idade", p.getIdade());
		String jsonString = json.toJSONString();
		
		gravaArquivo(jsonString);
		try {
			lerArquivo();
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void gravaArquivo(String jsonString) {
		
		try(FileWriter fileWriter = new FileWriter("pessoa.json")){
			fileWriter.write(jsonString);
			System.out.println("Arquivo person.json salvo com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void lerArquivo() throws org.json.simple.parser.ParseException {
	//Lendo o arquivo e desserializando o JSON para objeto
		try (FileReader fileReader = new FileReader("pessoa.json")) {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);
			
			//Criando um objeto Person a partir do JSON
			String nome = (String) jsonObject.get("nome");
			long idade = (long) jsonObject.get("idade");
			Pessoa deserializerPerson = new Pessoa (nome, (int) idade);
			
			System.out.println("Objeto desserializado: " + deserializedPerson);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
