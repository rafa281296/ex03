package br.usjt.ex03;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteCriarUmaCidade {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Cidade u = new Cidade();
		u.setNome("cidade");
		u.setLati(15.2);
		u.setLongi(30.7);
		
		List <Previsao> y = new ArrayList<>();
		Previsao p = new Previsao();
		p.setDescricao("desc");
		p.setCidade(u);
		y.add(p);
		u.setPrevisoes(y);
		
		
		
		manager.persist(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}