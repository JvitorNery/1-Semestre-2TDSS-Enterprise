package br.com.fiap.view;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import br.com.fiap.bean.Aluno;

public class Desserializacao {

	public static void main(String[] args) throws Exception {
		FileInputStream fileStream = 
				new FileInputStream("arquivo.txt");
		ObjectInputStream objectStream =
				new ObjectInputStream(fileStream);
		
		Aluno aluno = (Aluno) objectStream.readObject();
		System.out.println(aluno.getNome());
		System.out.println(aluno.getRm());
		
		objectStream.close();
		fileStream.close();
	}
	
}
