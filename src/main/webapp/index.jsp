<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<% session.invalidate(); %>

<!DOCTYPE html>
<html>
<head>
<title>Sistema de Votação</title>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet" href="css/botoes.css" />
<link type="text/css" rel="stylesheet" href="css/login.css" />
</head>

<body>

	<h3>Bem vindo ao Sistema de Votação</h3>

	<div class="row">
		<form action='ControllerTelaLogin' method='post'>
			<div class="row">
				<label for='lbl_titulo'>Título</label> <input type='text'
					class='form-control' id='titulo' name='titulo' placeholder='Titulo'>
			</div>
			<div class="row">
				<label for='lbl_senha'>Senha</label> <input type='password'
					class='form-control' id='senha' name='senha' placeholder='Senha'>
			</div>
			<p></p>
			<div>
				<button class="button">Logar</button>
			</div>
		</form>
	</div>

</body>

</html>