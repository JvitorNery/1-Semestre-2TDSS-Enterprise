package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.TimeDAO;
import br.com.fiap.dao.impl.TimeDAOImpl;
import br.com.fiap.entity.Time;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
		//Cadastrar um Time
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		TimeDAO dao = new TimeDAOImpl(em);
		
		Time time = new Time(0,"Noroeste","Alfredo de Castilho",
					new GregorianCalendar(1990, Calendar.NOVEMBER, 10),null);
		
		dao.insert(time);
		
		em.close();
		System.exit(0);
	}
	
}
