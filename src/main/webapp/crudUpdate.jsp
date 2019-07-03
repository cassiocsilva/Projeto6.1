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

	<h3>EDITAR cadastro Eleitor, Mesário, Chefe de Sessão ou Membro
		TRE</h3>

	<form action="ControllerCrudUpdate" method="post">

		<div class="row">
			<div class="col-25">
				<label for="numeroDeTitulo">Número de Título</label>
			</div>
			<div class="col-75">
				<input type="text" id="numeroDeTitulo" name="numeroDeTitulo"
					placeholder="Preencha somente números..">
			</div>
		</div>

		<p></p>

		<div class="row">
			<div class="col-75">
				<input class="button-menu" type="submit" value="EDITAR">
			</div>
		</div>

		<div class="row">
			<p>
				<a href="membroTRE.jsp"> <input value="Ir para Tela Membro TRE"
					type="button" class="button-menu"></input>
				</a>
			</p>
		</div>

		<div class="row">
			
				<a href="index.jsp"> <input value="Sair" type="button"
					class="button-menu"></input>
				</a>
			
		</div>

	</form>
	</div>

</body>
</html>