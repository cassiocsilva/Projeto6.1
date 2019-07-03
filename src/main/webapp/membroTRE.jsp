<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<title>Sistema de Votação</title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<link type="text/css" rel="stylesheet" href="css/botoes.css" />
<script>
	function relatorioVotacao() {
		document.getElementById("emitirRelatorioVotacao").submit();
	}
</script>
<script>
	function relatorioAuditoria() {
		document.getElementById("emitirRelatorioAuditoria").submit();
	}
</script>
</head>

<body>

	<h3>Bem vindo Membro TRE</h3>


	<div class="row">
		<p>
			<a href="urna.jsp"> <input value="Votar" type="button"
				class="button-menu"></input>
			</a>
		</p>
	</div>

	<div class="row">
		<p>
		<form id="emitirRelatorioVotacao" name="emitirRelatorioVotacao"
			method="post" action='ControllerRelatorioVotacao'>
			<input value="Emitir relatório de votação" type="button"
				class="button-menu" onclick="relatorioVotacao()"></input>
		</form>
	</div>

	<div class="row">
		<p>
		<form id="emitirRelatorioAuditoria" name="emitirRelatorioAuditoria" method="post"
			action='ControllerRelatorioAuditoria'>
			<input value="Emitir relatório de auditoria" type="button"
				class="button-menu" onclick="relatorioAuditoria()"></input>
		</form>
	</div>

	<div class="row">
		<p>
			<a href="crudCreate.jsp"> <input value='"Create" - Cadastrar'
				type="button" class="button-menu"></input>
			</a>
		</p>
	</div>

	<div class="row">
		<p>
			<a href="crudRead.jsp"> <input
				value='"Read" - Pesquisar cadastro' type="button"
				class="button-menu"></input>
			</a>
		</p>
	</div>

	<div class="row">
		<p>
			<a href="crudUpdate.jsp"> <input
				value='"Update" - Editar cadastro' type="button" class="button-menu"></input>
			</a>
		</p>
	</div>

	<div class="row">
		<p>
			<a href="crudDelete.jsp"> <input
				value='"Delete" - Excluir cadastro' type="button"
				class="button-menu"></input>
			</a>
		</p>
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