package br.com.fiap.revisao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.revisao.bean.Pessoa;
import br.com.fiap.revisao.bean.Sexo;

public class Revisao {

	public static void main(String[] args) {
		//Declarar uma variável para armazenar data
		Calendar inicioAula;
		//Armazenar na variável a data de hoje
		inicioAula = Calendar.getInstance();
		
		//Declarar uma variável para data
		Calendar terminoAula =   //Ano, mes (começa no 0) e dia 
				new GregorianCalendar(2017,Calendar.JUNE,28);
		
		//exibir as datas
		//Formatador de data
		SimpleDateFormat formatador = 
				new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Começo: " + 
				formatador.format(inicioAula.getTime()));
		System.out.println("Término: " + 
				formatador.format(terminoAula.getTime()));
		
		//Instanciar uma pessoa
		Pessoa pessoa = new Pessoa("Jonas",
			new GregorianCalendar(1994, Calendar.AUGUST, 7),
			Sexo.MASCULINO);
		
		//Comparar um enum
		if (pessoa.getSexo() == Sexo.MASCULINO){
			System.out.println("Homem");
		}else{
			System.out.println("Mulher");
		}
		
	}
	
}






