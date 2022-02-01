package ec.edu.ups.PlataformasWeb.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.PlataformasWeb.dao.LibroDao;
import ec.edu.ups.PlataformasWeb.model.Libro;

@Stateless
public class LibroON {
	@Inject
	private LibroDao libroDao;
	
	public void insertarTitulo(Libro l) {
		libroDao.insertar(l);
	}
	
	public List<Libro> listar(Libro l){
		libroDao.getList();
		return null;
	}
	
}
