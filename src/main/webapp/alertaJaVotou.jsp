<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sistema de Votação</title>
<link type="text/css" rel="stylesheet" href="css/botoes.css" />
</head>
<body>

	<h3>Aviso</h3>

	<div class="row">
		<span> Somente um voto é permitido por eleitor. </span>
	</div>

	<%
		HttpSession sessao;
		sessao = request.getSession();
		String cargo = (String) sessao.getAttribute("cargo");
		if (cargo.equals("Eleitor") || cargo.equals("Mesário")) {
	%>
	<div class="row">
		<p>
			<a href="index.jsp"> <input value="Sair" type="button"
				class="button-menu"></input>
			</a>
		</p>
	</div>

	<%
		} else if (cargo.equals("Chefe de Sessão")) {
	%>

	<div class="row">
		<p>
			<a href="index.jsp"> <input value="Sair" type="button"
				class="button-menu"></input>
			</a>
		</p>
	</div>

	<div class="row">
		<p>
			<a href="chefeDeSessao.jsp"> <input
				value="Página Chefe De Sessão" type="button" class="button-menu"></input>
			</a>
		</p>
	</div>

	<%
		} else if (cargo.equals("Membro TRE")) {
	%>

	<div class="row">
		<p>
			<a href="index.jsp"> <input value="Sair" type="button"
				class="button-menu"></input>
			</a>
		</p>
	</div>

	<div class="row">
		<p>
			<a href="membroTRE.jsp"> <input value="Página Membro TRE"
				type="button" class="button-menu"></input>
			</a>
		</p>
	</div>

	<%
		}
	%>


</body>
</html>
