package br.com.fiap.socket;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import br.com.fiap.bean.Aluno;

public class Server {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(1234);
		while (true){
			System.out.println("Aguardando conexão...");
			Socket socket = server.accept();
			
			ObjectInputStream objectStream = 
					new ObjectInputStream(socket.getInputStream());
			
			try{
			Aluno aluno = (Aluno) objectStream.readObject();
			
			System.out.println(aluno.getNome());
			System.out.println(aluno.getRm());
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		/*objectStream.close();
		socket.close();
		server.close();*/
	}
	
}
