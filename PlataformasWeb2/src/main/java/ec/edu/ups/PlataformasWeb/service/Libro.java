package ec.edu.ups.PlataformasWeb.service;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.PlataformasWeb.business.LibroON;
@WebServlet("/Libros")
public class Libro extends HttpServlet {
	@Inject
	private LibroON libroON;
	
	public Libro() {
        super();
        // TODO Auto-generated constructor stub
    }
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
