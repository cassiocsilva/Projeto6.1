package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO_Eleitor_jpa;
import model.Eleitor;

@WebServlet(name = "ControllerCrudRead", urlPatterns = { "/ControllerCrudRead" })
public class ControllerCrudRead extends HttpServlet {

	private static final long serialVersionUID = 1L;
	HttpSession sessao;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {

		Eleitor e = new Eleitor();
		
		String titulo = request.getParameter("numeroDeTitulo");		
		e.setNumeroDeTitulo(titulo);

		DAO_Eleitor_jpa daoE = new DAO_Eleitor_jpa();
		
		try {
			
			Eleitor eBD = daoE.buscarEleitor(e);
			
			if (eBD.getNumeroDeTitulo().equals("TituloNaoEncontrado")) {
				response.sendRedirect("alertaTituloNaoEncontrado.jsp");
			} 
			
			else if (eBD.getNumeroDeTitulo().equals(e.getNumeroDeTitulo())) {
				request.getSession().setAttribute("dadosReadEleitor", eBD);
				response.sendRedirect("crudRead2.jsp");
			}
			
			else {
				response.sendRedirect("alertaCadastroNaoOk.jsp");
			}
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}