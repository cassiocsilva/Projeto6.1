package controller;

import java.io.IOException;
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

@WebServlet(name = "ControllerTelaEleitor", urlPatterns = { "/ControllerTelaEleitor" })
public class ControllerTelaEleitor extends HttpServlet {

	private static final long serialVersionUID = 1L;
	HttpSession sessao;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		Eleitor mesario = new Eleitor();
		mesario.setNumeroDeTitulo(request.getParameter("tituloMesario"));
		mesario.setSenha(request.getParameter("senhaMesario"));

		if (mesario.getNumeroDeTitulo().equals("")) {
			request.getSession().setAttribute("tituloMesario", "PreenchaNUM");
			response.sendRedirect("eleitor3.jsp");
		} else if (mesario.getSenha().equals("")) {
			request.getSession().setAttribute("tituloMesario", "PreenchaSenha");
			response.sendRedirect("eleitor3.jsp");
		} else {

			DAO_Eleitor_jpa validaMesario = new DAO_Eleitor_jpa();

			try {

				Eleitor validaMesarioBD = validaMesario.validarLogin(mesario);

				if (validaMesarioBD.getNumeroDeTitulo().equals(mesario.getNumeroDeTitulo())) {

					if (validaMesarioBD.getCargo().equals("Mesário")
							|| validaMesarioBD.getCargo().equals("Chefe de Sessão")
							|| validaMesarioBD.getCargo().equals("Membro TRE")) {

						String eleitor = (String) request.getSession().getAttribute("titulo");
						String zonaEleitor = (String) request.getSession().getAttribute("zona");
						String sessaoEleitoralEleitor = (String) request.getSession().getAttribute("sessaoEleitoral");

						if (zonaEleitor.equals(validaMesarioBD.getZona())
								&& sessaoEleitoralEleitor.equals(validaMesarioBD.getSessaoEleitoral())) {

							sessao = request.getSession();
							sessao.setAttribute("tituloMesario", validaMesarioBD.getNumeroDeTitulo());

							DateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
							DateFormat horaFormat = new SimpleDateFormat("HH:mm:ss");
							Date date = new Date();
							String data = dataFormat.format(date);
							String hora = horaFormat.format(date);

							Registro r = new Registro();
							r.setData(data);
							r.setHora(hora + " GMT-3");
							r.setUsuario(validaMesarioBD.getNumeroDeTitulo());
							r.setCargo(validaMesarioBD.getCargo());
							r.setAcao("Habilitação de votação eleitor " + eleitor);

							DAO_Registro_jpa daoR = new DAO_Registro_jpa();
							daoR.registrar(r);

							response.sendRedirect("urna.jsp");

						} else {
							request.getSession().setAttribute("tituloMesario", "alertaZonaDiferente");
							response.sendRedirect("eleitor3.jsp");
						}

					} else {
						request.getSession().setAttribute("tituloMesario", "naoEhMesario");
						response.sendRedirect("eleitor3.jsp");
					}
				}

				else {
					request.getSession().setAttribute("tituloMesario", validaMesarioBD.getNumeroDeTitulo());
					response.sendRedirect("eleitor3.jsp");
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
