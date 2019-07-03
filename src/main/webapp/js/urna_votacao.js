var dig = 0;
var voto = '';

function inserirVoto(num) {
	if (dig == 0) {
		document.tecladoUrna.visor.value = '';
		voto = '';
	}
	if (dig < 2) {
		voto = voto + num;
		document.tecladoUrna.visor.value = voto;
		document.getElementById("demo2").innerHTML = voto;
		dig += 1;
	}
	if (dig == 2) {
		document.tecladoUrna.visor.value = voto;
		exibirCandidata();
	}
}

function exibirCandidata() {
	if (voto == 01) {
		document.getElementById("demo2").innerHTML = "01 AC: Sayonara Dias Moura ";
		document.getElementById("imageoption").src = "image/candidatas/candidata1.jpg";
	} else if (voto == 02) {
		document.getElementById("demo2").innerHTML = "02 AL: Raíssa de Souza Chag ";
		document.getElementById("imageoption").src = "image/candidatas/candidata2.jpg";
	} else if (voto == 03) {
		document.getElementById("demo2").innerHTML = "03 AP: Brenda Gomes Lazareth ";
		document.getElementById("imageoption").src = "image/candidatas/candidata3.jpg";
	} else if (voto == 04) {
		document.getElementById("demo2").innerHTML = "04 AM: Lorena Alencar Machado da Silva ";
		document.getElementById("imageoption").src = "image/candidatas/candidata4.jpg";
	} else if (voto == 05) {
		document.getElementById("demo2").innerHTML = "05 BA: Liliane Natiele Santos Silva ";
		document.getElementById("imageoption").src = "image/candidatas/candidata5.jpg";
	} else if (voto == 06) {
		document.getElementById("demo2").innerHTML = "06 CE: Luana Carvalho Lobo ";
		document.getElementById("imageoption").src = "image/candidatas/candidata6.jpg";
	} else if (voto == 07) {
		document.getElementById("demo2").innerHTML = "07 DF: Ana Gabriela Carvalho Borges ";
		document.getElementById("imageoption").src = "image/candidatas/candidata7.jpg";
	} else if (voto == 08) {
		document.getElementById("demo2").innerHTML = "08 ES: Thainá de Castro ";
		document.getElementById("imageoption").src = "image/candidatas/candidata8.jpg";
	} else if (voto == 09) {
		document.getElementById("demo2").innerHTML = "09 GO: Isadora Rocha Dantas ";
		document.getElementById("imageoption").src = "image/candidatas/candidata9.jpg";
	} else if (voto == 10) {
		document.getElementById("demo2").innerHTML = "10 MA: Anna Carolina Azevedo Sousa ";
		document.getElementById("imageoption").src = "image/candidatas/candidata10.jpg";
	} else if (voto == 11) {
		document.getElementById("demo2").innerHTML = "11 MT: Ingrid Cristina Santin ";
		document.getElementById("imageoption").src = "image/candidatas/candidata11.jpg";
	} else if (voto == 12) {
		document.getElementById("demo2").innerHTML = "12 MS: Priscilla Xavier Vacchiano ";
		document.getElementById("imageoption").src = "image/candidatas/candidata12.jpg";
	} else if (voto == 13) {
		document.getElementById("demo2").innerHTML = "13 MG: Júlia do Vale Horta ";
		document.getElementById("imageoption").src = "image/candidatas/candidata13.jpg";
	} else if (voto == 14) {
		document.getElementById("demo2").innerHTML = "14 PA: Wilma da Silva Paulino ";
		document.getElementById("imageoption").src = "image/candidatas/candidata14.jpg";
	} else if (voto == 15) {
		document.getElementById("demo2").innerHTML = "15 PB: Kennya de Araújo da Silva ";
		document.getElementById("imageoption").src = "image/candidatas/candidata15.jpg";
	} else if (voto == 16) {
		document.getElementById("demo2").innerHTML = "16 PR: Djenifer Frey ";
		document.getElementById("imageoption").src = "image/candidatas/candidata16.jpg";
	} else if (voto == 17) {
		document.getElementById("demo2").innerHTML = "17 PE: Bárbara Daniele Barbosa de Souza ";
		document.getElementById("imageoption").src = "image/candidatas/candidata17.jpg";
	} else if (voto == 18) {
		document.getElementById("demo2").innerHTML = "18 PI: Dagmara da Silva Landim ";
		document.getElementById("imageoption").src = "image/candidatas/candidata18.jpg";
	} else if (voto == 19) {
		document.getElementById("demo2").innerHTML = "19 RJ: Isadora Saraiva Meira ";
		document.getElementById("imageoption").src = "image/candidatas/candidata19.jpg";
	} else if (voto == 20) {
		document.getElementById("demo2").innerHTML = "20 RN: Erika Fontes de Oliveira ";
		document.getElementById("imageoption").src = "image/candidatas/candidata20.jpg";
	} else if (voto == 21) {
		document.getElementById("demo2").innerHTML = "21 RS: Bianca Beatriz Scheren ";
		document.getElementById("imageoption").src = "image/candidatas/candidata21.jpg";
	} else if (voto == 22) {
		document.getElementById("demo2").innerHTML = "22 RO: Hunaide Horitham dos Santos ";
		document.getElementById("imageoption").src = "image/candidatas/candidata22.jpg";
	} else if (voto == 23) {
		document.getElementById("demo2").innerHTML = "23 RR: Natali Vitória Lima Da Silva ";
		document.getElementById("imageoption").src = "image/candidatas/candidata23.jpg";
	} else if (voto == 24) {
		document.getElementById("demo2").innerHTML = "24 SC: Patrícia Marafon ";
		document.getElementById("imageoption").src = "image/candidatas/candidata24.jpg";
	} else if (voto == 25) {
		document.getElementById("demo2").innerHTML = "25 SP: Bianca Dias Lopes ";
		document.getElementById("imageoption").src = "image/candidatas/candidata25.jpg";
	} else if (voto == 26) {
		document.getElementById("demo2").innerHTML = "26 SE: Ingrid Moraes Vieira ";
		document.getElementById("imageoption").src = "image/candidatas/candidata26.jpg";
	} else if (voto == 27) {
		document.getElementById("demo2").innerHTML = "27 TO: Alessandra de Almeida ";
		document.getElementById("imageoption").src = "image/candidatas/candidata27.jpg";
	} else {
		document.tecladoUrna.visor.value = '99';
		document.getElementById("demo2").innerHTML = "VOTO NULO";
		document.getElementById("imageoption").src = "image/candidatas/candidata99.jpg";
	}
}

function branco() {
	if (dig == 0) {
		dig = 2;
		document.tecladoUrna.visor.value = '00';
		document.getElementById("demo2").innerHTML = "VOTO BRANCO";
		document.getElementById("imageoption").src = "image/candidatas/candidata00.jpg";
	}
}

function corrigir() {
	document.tecladoUrna.visor.value = '';
	document.getElementById("demo2").innerHTML = '';
	document.getElementById("imageoption").src = '';
	dig = 0;
}


function submeterVoto() {
	if (dig == 2) {
		document.getElementById("tecladoUrna").submit();
	}
}


