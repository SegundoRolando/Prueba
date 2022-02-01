package ec.edu.ups.PlataformasWeb.dao;



import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.PlataformasWeb.model.Libro;


@Stateless
public class LibroDao {
	@PersistenceContext
	private EntityManager em;
	
	public void insertar(Libro l) {
		// TODO Auto-generated method stub
		em.persist(l);
	}
	public List<Libro> getList() {
		List<Libro> listado =new ArrayList<Libro>();
		String jpql = "SELECT l FROM libro l";
		Query query= em.createQuery(jpql,Libro.class);
		listado = query.getResultList();
		return listado;
	
	}

	
}
