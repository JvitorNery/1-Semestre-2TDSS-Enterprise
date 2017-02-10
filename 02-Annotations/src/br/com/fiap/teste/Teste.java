package br.com.fiap.teste;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.annotation.Coluna;
import br.com.fiap.bean.Animal;

public class Teste {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		//Recuperar os atributos da classe animal
		Field[] atributos = 
				animal.getClass().getDeclaredFields();
		//Exibir os nomes dos atributos
		for (Field field : atributos) {
			Coluna anotacao = 
					field.getAnnotation(Coluna.class);
			if (anotacao != null)
				System.out.println("Atributo: " + field.getName() 
					+ " Coluna: " + anotacao.nome() );
		}
		
		System.out.println("Métodos da classe");
		//Recuperar os métodos da classe animal
		Method[] metodos = animal.getClass().getDeclaredMethods();
		for (Method method : metodos) {
			//Exibir o nome dos métodos
			System.out.println(method.getName());
		}
		
		
	}
	
}
