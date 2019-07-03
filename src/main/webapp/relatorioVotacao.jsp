<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Votacao"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- comentario -->


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<title>Sistema de Votação</title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<link type="text/css" rel="stylesheet" href="css/botoes.css" />
<link type="text/css" rel="stylesheet" href="css/urna_relatorio.css" />
<script type="text/javascript" src="js/urna_relatorio.js"></script>
</head>

<body onload="carregarDados()">

	<div class="row1">
		<h2>Urna Eletrônica</h2>
		<p>
			<h3>Relatório de Votação</h3>
			Extraído em:
			<output id="dataHora"></output>
			</br>
		</p>

		<table id="tabelaClassificacao">
			<tr>
				<th class="thClassificacao">Classificação</th>
				<th class="thVotos">Votos</th>
				<th class="thCandidata">Nome</th>
				<th class="thEstado">UF</th>
				<th class="thEstado">Idade</th>
				<th class="thEstado">Profissão</th>


				<c:forEach items="${lv}" var="lv">
					<tr>
						<td class="tdCenter">${lv.classificacao}</td>
						<td class="tdCenter">${lv.qtdeVotos}</td>
						<td class="tdCandidata">${lv.cFull.nome}</td>
						<td class="tdCenter">${lv.cFull.uf}</td>
						<td class="tdCenter">${lv.cFull.idade}</td>
						<td class="tdProfissao">${lv.cFull.profissao}</td>
					</tr>
				</c:forEach>
			</tr>
		</table>

		<ul>
			Votos Brancos e Nulos:
			<li>Brancos: ${brancos}</li>
			<li>Nulos: ${nulos}</li>
		</ul>
	

	<%
		HttpSession sessao;
		sessao = request.getSession();
		String cargo = (String) sessao.getAttribute("cargo");

		if (cargo.equals("Chefe de Sessão")) {
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
	
	</div>
	
	</div>
	
</body>
</html>
