
package controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO_Registro_jpa;
import model.DAO_Voto_jpa;
import model.Registro;
import model.Voto;



@WebServlet(name = "ControllerTelaUrna", urlPatterns = { "/ControllerTelaUrna" })
public class ControllerTelaUrna extends HttpServlet {

	private static final long serialVersionUID = 1L;
	HttpSession sessao;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("visor: " + request.getParameter("visor"));
		
		sessao = request.getSession();
		
		Voto v = new Voto();
		v.setEleitor(sessao.getAttribute("titulo").toString());
		v.setVoto(request.getParameter("visor"));
		
		DAO_Voto_jpa daoVoto = new DAO_Voto_jpa();
		
		try {
			
			Voto validaVoto = daoVoto.verificarEleitorNaoVotou(v);
			
			if (validaVoto.getEleitor().equals("eleitorNaoVotou")) {
				daoVoto.cadastrarVoto(v);
				
				Voto validaVotoRealizado = daoVoto.verificarEleitorNaoVotou(v);
				
				if (validaVotoRealizado.getEleitor().equals("eleitorJaVotou")) {
					
					DateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
					DateFormat horaFormat = new SimpleDateFormat("HH:mm:ss");
					Date date = new Date(); 
					String data = dataFormat.format(date);
					String hora = horaFormat.format(date);
					
					Registro r = new Registro();
					r.setData(data);
					r.setHora(hora + " GMT-3");
					r.setUsuario(sessao.getAttribute("titulo").toString());
					r.setCargo(sessao.getAttribute("cargo").toString());
					r.setAcao("Confirmação de Voto");
					
					DAO_Registro_jpa daoR = new DAO_Registro_jpa();
					daoR.registrar(r);
					
					response.sendRedirect("alertaFim.jsp");
				}
			}
			
			else {
				response.sendRedirect("alertaJaVotou.jsp");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}