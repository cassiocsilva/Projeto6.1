package controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO_Eleitor_jpa;
import model.DAO_Registro_jpa;
import model.Eleitor;
import model.Registro;


@WebServlet(name = "ControllerTelaLogin", urlPatterns = { "/ControllerTelaLogin" })
public class ControllerTelaLogin extends HttpServlet {

	private static final long serialVersionUID = 1L;
	HttpSession sessao;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {

		
		Eleitor login = new Eleitor();
		login.setNumeroDeTitulo(request.getParameter("titulo"));
		login.setSenha(request.getParameter("senha"));
		
		DAO_Eleitor_jpa validaLogin = new DAO_Eleitor_jpa();
		
		try {			

			Eleitor validaLoginBD = validaLogin.validarLogin(login);
			
			if (validaLoginBD.getNumeroDeTitulo().equals(login.getNumeroDeTitulo())) {
				
				/*
				Relatório de auditoria:
				08/03/2019; 12:30:50; Usuário 12344434; Autenticação no sistema;
				08/03/2019; 12:44:30; Usuário 12344434; Habilitação de votação usuário 33344344;
				*/
				
				DateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
				DateFormat horaFormat = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date(); 
				String data = dataFormat.format(date);
				String hora = horaFormat.format(date);
				
				Registro r = new Registro();
				r.setData(data);
				r.setHora(hora + " GMT-3");
				r.setUsuario(validaLoginBD.getNumeroDeTitulo());
				r.setCargo(validaLoginBD.getCargo());
				r.setAcao("Autenticação no sistema");
				
				DAO_Registro_jpa daoR = new DAO_Registro_jpa();
				daoR.registrar(r);
										
				sessao = request.getSession();
				sessao.setAttribute("titulo", validaLoginBD.getNumeroDeTitulo());
				sessao.setAttribute("cargo", validaLoginBD.getCargo());
				sessao.setAttribute("zona", validaLoginBD.getZona());
				sessao.setAttribute("sessaoEleitoral", validaLoginBD.getSessaoEleitoral());
				
				if (validaLoginBD.getCargo().equals("Mesário")) {
					response.sendRedirect("mesario.jsp");
				}
				else if (validaLoginBD.getCargo().equals("Chefe de Sessão")) {
					response.sendRedirect("chefeDeSessao.jsp");
				}
				else if (validaLoginBD.getCargo().equals("Membro TRE")) {
					response.sendRedirect("membroTRE.jsp");
				}
				else {
					response.sendRedirect("eleitor.jsp");
				}
			}

			
			else {
				
				if (validaLoginBD.getNumeroDeTitulo().equals("PreenchaNUM")) {
					response.sendRedirect("alertaPreenchaLogin.jsp");
				}
				else if (validaLoginBD.getNumeroDeTitulo().equals("SenhaIncorreta")) {
					response.sendRedirect("alertaSenhaIncorreta.jsp");
				}
				else if (validaLoginBD.getNumeroDeTitulo().equals("TituloNaoEncontrado")) {
					response.sendRedirect("alertaTituloNaoEncontrado.jsp");
				}
			}
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}