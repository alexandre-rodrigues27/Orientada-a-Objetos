public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			Socket s = new Socket("127.0.0.1", 1020);
			System.out.println("Conexão efetuada com sucesso!");
			
			ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
			ObjectInputStream in = new ObjectInputStream(s.getInputStream());
			
			
			Numero n = new Numero(13.4f, 4.77f);
			//enviando o objeto:
			out.writeObject(n);
			
			Resposta res;
			//obter retorno do servidor:
			res = (Resposta) in.readObject();
			
			System.out.println("Resposta: "+res.getResultado());
			teclado.nextLine();			                   
			s.close();
			
			
		}catch (Exception e) {
			System.out.println("Erro: "+e.getMessage());
		}
 
	}
