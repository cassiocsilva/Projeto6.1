<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<title>Sistema de Votação</title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<link type="text/css" rel="stylesheet" href="css/botoes.css" />
<link type="text/css" rel="stylesheet" href="css/eleitor.css" />
</head>


<body>

	<div class="row">
		<div class="column eleitor">
			<h3>Bem vindo Eleitor</h3>
			<p></p>
			<div class="row">
				<p>
					<input value="Votar" type="button" class="button-menu"></input>
				</p>
			</div>

			<div class="row">
				<p>
					<a href="index.jsp"> <input value="Sair" type="button"
						class="button-menu"></input>
					</a>
				</p>
			</div>
		</div>


		<%
			HttpSession sessao;
			sessao = request.getSession();
			String tituloMesario = (String) sessao.getAttribute("tituloMesario");

			if (tituloMesario.equals("PreenchaNUM")) {
		%>

		<div class="column mesario">
			<h3>Tela Mesário</h3>
			<p></p>
			Título mesário não preenchido.
			<div class="row">
				<p>
					<a href="eleitor2.jsp"> <input value="Entendi" type="button"
						class="button-menu"></input>
					</a>
				</p>
			</div>
		</div>

		<%
			} else if (tituloMesario.equals("PreenchaSenha")) {
		%>

		<div class="column mesario">
			<h3>Tela Mesário</h3>
			<p></p>
			Senha mesário não preenchida.
			<div class="row">
				<p>
					<a href="eleitor2.jsp"> <input value="Entendi" type="button"
						class="button-menu"></input>
					</a>
				</p>
			</div>
		</div>
		
		<%
			} else if (tituloMesario.equals("TituloNaoEncontrado")) {
		%>

		<div class="column mesario">
			<h3>Tela Mesário</h3>
			<p></p>
			Título mesário não encontrado.
			<div class="row">
				<p>
					<a href="eleitor2.jsp"> <input value="Entendi" type="button"
						class="button-menu"></input>
					</a>
				</p>
			</div>
		</div>
		
		<%
			} else if (tituloMesario.equals("SenhaIncorreta")){
		%>

		<div class="column mesario">
			<h3>Tela Mesário</h3>
			<p></p>
			Senha incorreta.
			<div class="row">
				<p>
					<a href="eleitor2.jsp"> <input value="Entendi" type="button"
						class="button-menu"></input>
					</a>
				</p>
			</div>
		</div>

		<%
			} else if (tituloMesario.equals("alertaZonaDiferente")) {
		%>

		<div class="column mesario">
			<h3>Tela Mesário</h3>
			<p></p>
			Zona e/ou Seção Eleitoral diferente.
			<div class="row">
				<p>
					<a href="eleitor2.jsp"> <input value="Entendi" type="button"
						class="button-menu"></input>
					</a>
				</p>
			</div>
		</div>
		
		<%
			} else if (tituloMesario.equals("naoEhMesario")) {
		%>

		<div class="column mesario">
			<h3>Tela Mesário</h3>
			<p></p>
			Somente Mesário, Chefes de Sessão ou Membros do TRE podem habilitar
			eleitor para votação.
			<div class="row">
				<p>
					<a href="eleitor2.jsp"> <input value="Entendi" type="button"
						class="button-menu"></input>
					</a>
				</p>
			</div>
		</div>
		
		<%
			}
		%>

	</div>

</body>
</html>
