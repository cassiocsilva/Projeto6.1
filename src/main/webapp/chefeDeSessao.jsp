<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<title>Sistema de Votação</title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<link type="text/css" rel="stylesheet" href="css/botoes.css" />
<script>
	function emitirRelat() {
		document.getElementById("emitirRelatorio").submit();
	}
</script>
</head>


<body>

	<h3>Bem vindo Chefe de Sessão</h3>


	<div class="row">
		<p>
			<a href="urna.jsp"> <input value="Votar" type="button"
				class="button-menu"></input>
			</a>
		</p>
	</div>

	<div class="row">
		<p>
		<form id="emitirRelatorio" name="emitirRelatorio" method="post"
			action="ControllerRelatorioVotacao">
			<input value="Emitir relatório de votação" type="button"
				class="button-menu" onclick="emitirRelat()"></input>
		</form>
	</div>

	<div class="row">
		<p>
			<a href="index.jsp"> <input value="Sair" type="button"
				class="button-menu"></input>
			</a>
		</p>
	</div>

</body>
</html>