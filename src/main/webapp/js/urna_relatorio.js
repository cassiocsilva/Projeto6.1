
function carregarDados() {
	dataHora();
}

function dataHora() {
	var date = new Date();
	var dd = date.getDate();
	var MM = date.getMonth() + 1;
	var yyyy = date.getFullYear();
	var hh = date.getHours();
	var mm = date.getMinutes();
	var ss = date.getSeconds();
	if (dd < 10) {
		dd = "0" + dd;
	}
	if (MM < 10) {
		MM = "0" + MM;
	}
	if (hh < 10) {
		hh = "0" + hh;
	}
	if (mm < 10) {
		mm = "0" + mm;
	}
	if (ss < 10) {
		ss = "0" + ss;
	}
	dataHora = dd + "/" + MM + "/" + yyyy + " " + hh + ":" + mm + ":" + ss
			+ " GMT-0300 (Horário Padrão de Brasília)";
	document.getElementById("dataHora").innerHTML = dataHora;
}