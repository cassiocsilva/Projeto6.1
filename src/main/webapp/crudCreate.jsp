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

	<h3>CADASTRAR Eleitor, Mesário, Chefe de Sessão ou Membro TRE</h3>

	<form action=ControllerCrudCreate method="post">

		<div class="row">
			<div class="col-25">
				<label for="nome">Nome Completo</label>
			</div>
			<div class="col-75">
				<input type="text" id="nome" name="nome"
					placeholder="Nome Completo..">
			</div>
		</div>

		<div class="row">
			<div class="col-25">
				<label for="dataNascimento">Data de nascimento</label>
			</div>
			<div class="col-75">
				<input type="text" id="dataNascimento" name="dataNascimento"
					placeholder="dd/mm/aaaa..">
			</div>
		</div>

		<div class="row">
			<div class="col-25">
				<label for="municipio">Município</label>
			</div>
			<div class="col-75">
				<input type="text" id="municipio" name="municipio"
					placeholder="Município..">
			</div>
		</div>

		<div class="row">
			<div class="col-25">
				<label for="uf">UF</label>
			</div>
			<div class="col-75">
				<input type="text" id="uf" name="uf" placeholder="UF..">
			</div>
		</div>

		<div class="row">
			<div class="col-25">
				<label for="numeroDeTitulo">Número de Título</label>
			</div>
			<div class="col-75">
				<input type="text" id="numeroDeTitulo" name="numeroDeTitulo"
					placeholder="Preencha somente números..">
			</div>
		</div>

		<div class="row">
			<div class="col-25">
				<label for="dataDeEmissao">Data de emissão</label>
			</div>
			<div class="col-75">
				<input type="text" id="dataDeEmissao" name="dataDeEmissao"
					placeholder="dd/mm/aaaa..">
			</div>
		</div>

		<div class="row">
			<div class="col-25">
				<label for="zona">Zona</label>
			</div>
			<div class="col-75">
				<input type="text" id="zona" name="zona" placeholder="Zona..">
			</div>
		</div>

		<div class="row">
			<div class="col-25">
				<label for="sessaoEleitoral">Sessão eleitoral</label>
			</div>
			<div class="col-75">
				<input type="text" id="sessaoEleitoral" name="sessaoEleitoral"
					placeholder="Sessão eleitoral..">
			</div>
		</div>

		<div class="row">
			<div class="col-25">
				<label for="senha">Senha</label>
			</div>
			<div class="col-75">
				<input type="password" id="senha" name="senha" placeholder="Senha..">
			</div>
		</div>

		<div class="row">
			<div class="col-25">
				<label for="cargo">Cargo</label>
			</div>
			<div class="col-75">
				<select id="cargo" name="cargo">
					<option value="Eleitor">Eleitor</option>
					<option value="Mesário">Mesário</option>
					<option value="Chefe de Sessão">Chefe de Sessão</option>
					<option value="Membro do TRE">Membro do TRE</option>
				</select>
			</div>
		</div>
		
		<div class="row">
			<p>
				<a> <input value="CADASTRAR" type="submit"
					class="button-menu"></input>
				</a>
			</p>
		</div>
		
	</form>
	</div>
	
	
	
	<div class="row">

			<a href="membroTRE.jsp"> <input value="Ir para Tela Membro TRE" type="button"
				class="button-menu"></input>
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