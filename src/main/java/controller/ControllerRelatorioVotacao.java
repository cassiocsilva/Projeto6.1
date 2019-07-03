package controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Candidata;
import model.DAO_Candidata_jpa;
import model.DAO_Voto_jpa;
import model.Votacao;

@WebServlet(name = "ControllerRelatorioVotacao", urlPatterns = { "/ControllerRelatorioVotacao" })
public class ControllerRelatorioVotacao extends HttpServlet {

	private static final long serialVersionUID = 1L;
	HttpSession sessao;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		sessao = request.getSession();
		String cargo = (String) sessao.getAttribute("cargo");
		
		if (cargo.equals("Membro TRE") || cargo.equals("Chefe de Sessão")) {
			
			DAO_Voto_jpa vDAO = new DAO_Voto_jpa();
			List<Object[]> listaVotos = vDAO.apurarVotos();
			
			List<Votacao> lv = new LinkedList<>();
			
			int classificacao = 0;
			String brancos = "0";
			String nulos = "0";
						
			for (Object[] objects : listaVotos) {
				if (objects[1].toString().equals("00")) {
					brancos = objects[0].toString();
				} 
				else if (objects[1].toString().equals("99")){
					nulos = objects[0].toString();
				}
				
				else {
				classificacao += 1;
				
				Candidata c = new Candidata();
				c.setNumero(objects[1].toString());
				
				DAO_Candidata_jpa daoC = new DAO_Candidata_jpa();
				Candidata cFull = daoC.carregarDadosCandidata(c);
			
				Votacao v = new Votacao();
				v.setClassificacao(classificacao);
				v.setCandidata(objects[1].toString());
				v.setQtdeVotos(objects[0].toString());
				v.setcFull(cFull);
				lv.add(v);
				}
			}
			
			request.getSession().setAttribute("lv", lv);
			request.getSession().setAttribute("brancos", brancos);
			request.getSession().setAttribute("nulos", nulos);
		    response.sendRedirect("relatorioVotacao.jsp");
			
		} else {
			response.sendRedirect("alertaNaoPodeEmitirRelVot.jsp");
		}		
	}
}