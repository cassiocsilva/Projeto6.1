<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Registro"%>
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
			<h3>Relatório de Auditoria</h3>
			Extraído em:
			<output id="dataHora"></output>
			</br>
		</p>

		<table id="tabelaAuditoria">
			<tr>
				<th class="thData">Data</th>
				<th class="thHora">Hora</th>
				<th class="thTitulo">Título</th>
				<th class="thNumero">Número</th>
				<th class="thAcao">Ação</th>

				<c:forEach items="${lr}" var="lr">
					<tr>
						<td class="tdCenter">${lr.data}</td>
						<td class="tdCenter">${lr.hora}</td>
						<td class="tdCargo">${lr.cargo}</td>
						<td class="tdCenter">${lr.usuario}</td>
						<td class="tdAcao">${lr.acao}</td>
					</tr>
				</c:forEach>
			</tr>
		</table>
	

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

</body>
</html>
