package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO_Eleitor_jpa;
import model.Eleitor;

@WebServlet(name = "ControllerCrudCreate", urlPatterns = { "/ControllerCrudCreate" })
public class ControllerCrudCreate extends HttpServlet {

	private static final long serialVersionUID = 1L;
	HttpSession sessao;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {

		Eleitor e = new Eleitor();
		e.setNome(request.getParameter("nome"));
		e.setDataNascimento(request.getParameter("dataNascimento"));
		e.setMunicipio(request.getParameter("municipio"));
		e.setUf(request.getParameter("uf"));
		e.setNumeroDeTitulo(request.getParameter("numeroDeTitulo"));
		e.setDataDeEmissao(request.getParameter("dataDeEmissao"));
		e.setZona(request.getParameter("zona"));
		e.setSessaoEleitoral(request.getParameter("sessaoEleitoral"));
		e.setSenha(request.getParameter("senha"));
		e.setCargo(request.getParameter("cargo"));

		DAO_Eleitor_jpa daoE = new DAO_Eleitor_jpa();
		
		try {
			
			Eleitor crudCreate = daoE.cadastrarEleitor(e);
			
			if (crudCreate.getNumeroDeTitulo().equals(e.getNumeroDeTitulo())) {
				response.sendRedirect("alertaCadastroCriado.jsp");
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