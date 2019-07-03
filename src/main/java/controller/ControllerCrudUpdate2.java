package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO_Eleitor_jpa;
import model.Eleitor;

@WebServlet(name = "ControllerCrudUpdate2", urlPatterns = { "/ControllerCrudUpdate2" })
public class ControllerCrudUpdate2 extends HttpServlet {

	private static final long serialVersionUID = 1L;
	HttpSession sessao;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {

		Eleitor eAtual = new Eleitor();
		eAtual.setNome(request.getParameter("nome"));
		eAtual.setDataNascimento(request.getParameter("dataNascimento"));
		eAtual.setMunicipio(request.getParameter("municipio"));
		eAtual.setUf(request.getParameter("uf"));
		eAtual.setNumeroDeTitulo(request.getParameter("numeroDeTitulo"));
		eAtual.setDataDeEmissao(request.getParameter("dataDeEmissao"));
		eAtual.setZona(request.getParameter("zona"));
		eAtual.setSessaoEleitoral(request.getParameter("sessaoEleitoral"));
		eAtual.setSenha(request.getParameter("senha"));
		eAtual.setCargo(request.getParameter("cargo"));

		DAO_Eleitor_jpa daoE = new DAO_Eleitor_jpa();

		try {

			daoE.editarEleitor(eAtual);

			Eleitor eDB = daoE.buscarEleitor(eAtual);
			

			if (eDB.getNome().equals(eAtual.getNome()) && eDB.getDataNascimento().equals(eAtual.getDataNascimento())
					&& eDB.getMunicipio().equals(eAtual.getMunicipio()) && eDB.getUf().equals(eAtual.getUf())
					&& eDB.getNumeroDeTitulo().equals(eAtual.getNumeroDeTitulo())
					&& eDB.getDataDeEmissao().equals(eAtual.getDataDeEmissao())
					&& eDB.getZona().equals(eAtual.getZona())
					&& eDB.getSessaoEleitoral().equals(eAtual.getSessaoEleitoral())
					&& eDB.getSenha().equals(eAtual.getSenha()) && eDB.getCargo().equals(eAtual.getCargo())) {
				response.sendRedirect("alertaCadastroEditado.jsp");

			} else {
				response.sendRedirect("alertaCadastroNaoOk.jsp");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}