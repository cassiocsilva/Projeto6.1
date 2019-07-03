<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- comentario -->

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<title>Sistema de Votação</title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<link type="text/css" rel="stylesheet" href="css/botoes.css" />
<link type="text/css" rel="stylesheet" href="css/formularios.css" />
</head>

<body>

	<h3>EXCLUIR cadastro Eleitor, Mesário, Chefe de Sessão ou Membro
		TRE</h3>

	<form action="ControllerCrudDelete2" method="post">

		<div class="row">
			<div class="col-25">
				<label for="nome">Nome Completo</label>
			</div>
			<div class="col-75">
				<input type="text" id="nome" name="nome"
					value="${dadosReadEleitor.nome}" readonly>
			</div>
		</div>

		<div class="row">
			<div class="col-25">
				<label for="dataNascimento">Data de nascimento</label>
			</div>
			<div class="col-75">
				<input type="text" id="dataNascimento" name="dataNascimento"
					value="${dadosReadEleitor.dataNascimento}" readonly>
			</div>
		</div>

		<div class="row">
			<div class="col-25">
				<label for="municipio">Município</label>
			</div>
			<div class="col-75">
				<input type="text" id="municipio" name="municipio"
					value="${dadosReadEleitor.municipio}" readonly>
			</div>
		</div>

		<div class="row">
			<div class="col-25">
				<label for="uf">UF</label>
			</div>
			<div class="col-75">
				<input type="text" id="uf" name="uf" value="${dadosReadEleitor.uf}"
					readonly>
			</div>
		</div>

		<div class="row">
			<div class="col-25">
				<label for="numeroDeTitulo">Número de Título</label>
			</div>
			<div class="col-75">

				<input type="text" id="numeroDeTitulo" name="numeroDeTitulo"
					value="${dadosReadEleitor.numeroDeTitulo}" readonly>
			</div>
		</div>

		<div class="row">
			<div class="col-25">
				<label for="dataDeEmissao">Data de emissão</label>
			</div>
			<div class="col-75">
				<input type="text" id="dataDeEmissao" name="dataDeEmissao"
					value="${dadosReadEleitor.dataDeEmissao}" readonly>
			</div>
		</div>

		<div class="row">
			<div class="col-25">
				<label for="zona">Zona</label>
			</div>
			<div class="col-75">
				<input type="text" id="zona" name="zona"
					value="${dadosReadEleitor.zona}" readonly>
			</div>
		</div>

		<div class="row">
			<div class="col-25">
				<label for="sessaoEleitoral">Sessão eleitoral</label>
			</div>
			<div class="col-75">
				<input type="text" id="sessaoEleitoral" name="sessaoEleitoral"
					value="${dadosReadEleitor.sessaoEleitoral}" readonly>
			</div>
		</div>

		<div class="row">
			<div class="col-25">
				<label for="senha">Senha</label>
			</div>
			<div class="col-75">
				<input type="password" id="senha" name="senha"
					value="${dadosReadEleitor.senha}" readonly>
			</div>
		</div>

		<div class="row">
			<div class="col-25">
				<label for="cargo">Cargo</label>
			</div>
			<div class="col-75">
				<input type="text" id="cargo" name="cargo"
					value="${dadosReadEleitor.cargo}" readonly>
			</div>

		</div>
		</div>


		<div class="row">
			<p>
				<a> <input value="EXCLUIR cadastro" type="submit"
					class="button-menu"></input>
				</a>
			</p>
		</div>


	</form>
	</div>







	<div class="row">

		<a href="membroTRE.jsp"> <input value="Ir para Tela Membro TRE"
			type="button" class="button-menu"></input>
		</a>

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