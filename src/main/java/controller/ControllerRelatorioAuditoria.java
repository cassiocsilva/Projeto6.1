package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO_Registro_jpa;
import model.Registro;

@WebServlet(name = "ControllerRelatorioAuditoria", urlPatterns = { "/ControllerRelatorioAuditoria" })
public class ControllerRelatorioAuditoria extends HttpServlet {

	private static final long serialVersionUID = 1L;
	HttpSession sessao;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		sessao = request.getSession();
		String cargo = (String) sessao.getAttribute("cargo");
		
		if (cargo.equals("Membro TRE") || cargo.equals("Chefe de Sessão")) {
			
			DAO_Registro_jpa daoR = new DAO_Registro_jpa();
			List<Registro[]> lr = daoR.listarRegistros();
			
			request.getSession().setAttribute("lr", lr);
			
		    response.sendRedirect("relatorioAuditoria.jsp");
			
		} else {
			response.sendRedirect("alertaNaoPodeEmitirRelVot.jsp");
		}		
	}
}
