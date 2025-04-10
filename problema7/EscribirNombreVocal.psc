Algoritmo EscribirNombreVocal
	// Proposito: Leer una vocal por el teclado y que genere una salida
	// con el nombre de la vocal, ejemplo: a "el nombre de la vocal es a"
	// e "el nombre de la vocal es e"
	// utilizando la estructra Segun 
	// Definir salida
	Definir mensaje Como Caracter;
	// definir entrada
	Definir vocal Como Caracter;
	Escribir 'Introduce una vocal:' Sin Saltar;
	Leer vocal;
	mensaje <- determinarNombre(vocal);
	Escribir mensaje;
FinAlgoritmo

Funcion mensaje <- determinarNombre(vocal)
	Definir mensaje Como Caracter;
	Segun vocal  Hacer
		'a':
			mensaje <- 'El nombre de la vocal es a';
			Escribir 'y es correcto';
		'e':
			mensaje <- 'El nombre de la vocal es e';
		'i':
			mensaje <- 'El nombre de la vocal es i';
		'o':
			mensaje <- 'El nombre de la vocal es o';
		'u':
			mensaje <- 'El nombre de la vocal es u';
		De Otro Modo:
			mensaje <- 'No es una vocal';
	FinSegun
FinFuncion
