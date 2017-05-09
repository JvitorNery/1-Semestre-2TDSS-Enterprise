package br.com.fiap.socket;

import java.io.ObjectOutputStream;
import java.net.Socket;

import br.com.fiap.bean.Aluno;

public class Client {

	public static void main(String[] args) throws Exception {		
		
		Socket socket = new Socket("127.0.0.1", 1234);
		
		ObjectOutputStream objectStream = 
				new ObjectOutputStream(socket.getOutputStream());
		
		Aluno aluno = new Aluno("Maria","123456");
		
		objectStream.writeObject(aluno);
		System.out.println("Aluno serializado!");
		
		objectStream.close();
		socket.close(); 
		
	}
	
}
