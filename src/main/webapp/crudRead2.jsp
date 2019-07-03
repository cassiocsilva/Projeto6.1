<%@page import="model.DAO_Eleitor_jpa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Eleitor"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- comentario -->

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<title>Sistema de Votação</title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<link type="text/css" rel="stylesheet" href="css/botoes.css" />
<style type="text/css">
.colunaUm {
	float: left;
	width: 200px;
}
.colunaDois {
	float: left;
	width: 250px;
}
</style>
</head>

<body>

	<h3>PESQUISAR cadastro Eleitor, Mesário, Chefe de Sessão ou Membro
		TRE</h3>

	<table>
		<div>
			<tr>
				<td class="colunaUm"><br>Nome completo:</br> <br>Data de
						Nascimento:</br> <br>Município</br> <br>Número de Titulo</br> <br>Data
						de Emissão</br> <br>Zona</br> <br>Sessão Eleitoral</br> <br>Cargo</br>
				</td>

				<td class="colunaDois"><br>${dadosReadEleitor.nome}</br> <br>${dadosReadEleitor.dataNascimento}</br>
					<br>${dadosReadEleitor.municipio}</br> <br>${dadosReadEleitor.numeroDeTitulo}</br>
					<br>${dadosReadEleitor.dataDeEmissao}</br> <br>${dadosReadEleitor.zona}</br>
					<br>${dadosReadEleitor.sessaoEleitoral}</br> <br>${dadosReadEleitor.cargo}</br>
					<br></br></td>

			</tr>
		</div>
	</table>

	<div class="row">
		<p>
			<a href="crudRead.jsp"> <input value="Nova pesquisa" type="button"
				class="button-menu"></input>
			</a>
		</p>
	</div>
	
	<div class="row">
		<p>
			<a href="membroTRE.jsp"> <input value="Tela Membro TRE" type="button"
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