package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO_Eleitor_jpa;
import model.Eleitor;

@WebServlet(name = "ControllerCrudDelete2", urlPatterns = { "/ControllerCrudDelete2" })
public class ControllerCrudDelete2 extends HttpServlet {

	private static final long serialVersionUID = 1L;
	HttpSession sessao;

	@SuppressWarnings("unlikely-arg-type")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {

		Eleitor e = new Eleitor();
		e.setNumeroDeTitulo(request.getParameter("numeroDeTitulo"));

		DAO_Eleitor_jpa daoE = new DAO_Eleitor_jpa();

		try {

			daoE.excluirEleitor(e);

			Eleitor eBD = daoE.verificarNumeroDeTituloNaoCadastrado(e);
			
			System.out.println("ControllerCrudDelete2");
			System.out.println("e.getNumeroDeTitulo(): "+e.getNumeroDeTitulo());
			System.out.println("e.getNumeroDeTitulo(): "+e.getNumeroDeTitulo());

			if (eBD.getNumeroDeTitulo().equals("numNaoCadastrado")) {
				response.sendRedirect("alertaCadastroExcluido.jsp");

			} else {
				response.sendRedirect("alertaCadastroNaoOk.jsp");
			}

		} catch (Exception exp) {
			// TODO Auto-generated catch block
			exp.printStackTrace();
		}

	}
}