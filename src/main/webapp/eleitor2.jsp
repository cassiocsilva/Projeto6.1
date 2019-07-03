<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<title>Sistema de Votação</title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<link type="text/css" rel="stylesheet" href="css/botoes.css" />
<link type="text/css" rel="stylesheet" href="css/login.css" />
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



		<div class="column mesario">
			<h3>Tela Mesário</h3>
			<p></p>
			<form action='ControllerTelaEleitor' method='post'>
				<div class="row">
					<label for='lbl_titulo'>Título</label> <input type='text'
					class='form-control' id='tituloMesario' name='tituloMesario' placeholder='Titulo'>
				</div>
				<div class="row">
					<label for='lbl_senha'>Senha</label> <input type='password'
					class='form-control' id='senhaMesario' name='senhaMesario' placeholder='Senha Mesário'>
				</div>
				<p></p>
				<div>
					<button class="button-menu">Autenticar eleitor para votação</button>
				</div>
			</form>
		</div>
	</div>

</body>
</html>