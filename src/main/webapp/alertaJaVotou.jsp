<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sistema de Vota��o</title>
<link type="text/css" rel="stylesheet" href="css/botoes.css" />
</head>
<body>

	<h3>Aviso</h3>

	<div class="row">
		<span> Somente um voto � permitido por eleitor. </span>
	</div>

	<%
		HttpSession sessao;
		sessao = request.getSession();
		String cargo = (String) sessao.getAttribute("cargo");
		if (cargo.equals("Eleitor") || cargo.equals("Mes�rio")) {
	%>
	<div class="row">
		<p>
			<a href="index.jsp"> <input value="Sair" type="button"
				class="button-menu"></input>
			</a>
		</p>
	</div>

	<%
		} else if (cargo.equals("Chefe de Sess�o")) {
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
				value="P�gina Chefe De Sess�o" type="button" class="button-menu"></input>
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
			<a href="membroTRE.jsp"> <input value="P�gina Membro TRE"
				type="button" class="button-menu"></input>
			</a>
		</p>
	</div>

	<%
		}
	%>


</body>
</html>
