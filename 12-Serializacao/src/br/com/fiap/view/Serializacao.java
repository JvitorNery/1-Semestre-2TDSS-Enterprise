package br.com.fiap.view;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.fiap.bean.Aluno;

public class Serializacao {

	public static void main(String[] args) throws Exception {
		FileOutputStream fileStream =
			new FileOutputStream("arquivo.txt");
		ObjectOutputStream objectStream =
			new ObjectOutputStream(fileStream);
		
		//Serializar o Aluno
		Aluno aluno = new Aluno("Leticia","77275");
		
		objectStream.writeObject(aluno);
		
		System.out.println("Aluno serializado!");
		
		objectStream.close();
		fileStream.close();
		
		
	}
	
}
