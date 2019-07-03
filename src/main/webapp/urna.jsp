<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- comentario -->

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<title>Sistema de Votação</title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<link type="text/css" rel="stylesheet" href="css/botoes.css" />
<link type="text/css" rel="stylesheet" href="css/urna_votacao.css" />
<script type="text/javascript" src="js/urna_votacao.js"></script>
</head>

<body onload="corrigir()">

	<div class="row1">
		<h2>Urna Eletrônica</h2>
		<p>
			<h3>Votação</h3>
			Utilize o teclado para selecionar seu voto entre as
			candidatas de 01 a 27, ou 99 para votar nulo, ou utilize a tecla
			"Branco" para votar em branco.</br> Confira o número e a foto de sua
			candidata no display, tecle "Confirma" para confirmar, ou "Corrige"
			para corrigir.</br>Vote consciente!
		</p>
	</div>

	<div class="row">

		<div class="column teclado">
			<h3>Teclado</h3>
			<p></p>
			
			<form id="tecladoUrna" name="tecladoUrna" method="post"
				action="ControllerTelaUrna">
				<input type="hidden" id="visor" name="visor"></input>

				<table id="teclado">
					<tr>
						<td><input value="1" onclick="inserirVoto(1)" type="button"
							class="button"></input></td>
						<td><input value="2" onclick="inserirVoto(2)" type="button"
							class="button"></input></td>
						<td><input value="3" onclick="inserirVoto(3)" type="button"
							class="button"></input></td>
					</tr>
					<tr>
						<td><input value="4" onclick="inserirVoto(4)" type="button"
							class="button"></input></td>
						<td><input value="5" onclick="inserirVoto(5)" type="button"
							class="button"></input></td>
						<td><input value="6" onclick="inserirVoto(6)" type="button"
							class="button"></input></td>
					</tr>
					<tr>
						<td><input value="7" onclick="inserirVoto(7)" type="button"
							class="button"></input></td>
						<td><input value="8" onclick="inserirVoto(8)" type="button"
							class="button"></input></td>
						<td><input value="9" onclick="inserirVoto(9)" type="button"
							class="button"></input></td>
					</tr>
					<tr>
						<td><img class="button-blank"></img></td>
						<td><input value="0" onclick="inserirVoto(0)" type="button"
							class="button"></input></td>
						<td><img class="button-blank"></img></td>
					</tr>
					<tr>
						<td><input value="Branco" onclick="branco()" type="button"
							class="button-white"></input></td>
						<td><input value="Corrige" onclick="corrigir()" type="button"
							class="button-oranje"></input></td>

						<td><input value="Confirma" type="button"
							class="button-green" onclick="submeterVoto()"></input></td>

					</tr>
				</table>
			</form>
		</div>

		<div class="column display">
			<h3>Display</h3>
			<p></p>
			<form id="telaUrna" name="telaUrna" method="post" action="ControllerTelaUrna">
				<p id="demo2"></p>
				<img id="imageoption" src="" />
			</form>
		</div>	

	</div>
	
</body>
</html>
