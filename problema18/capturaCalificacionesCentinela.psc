Algoritmo capturaCalificacionesCentinela
	// Proposito: // Proposito: capturar n calificaciones de un alumno
	// y determinar su promedio, utilizando un valor CENTINELA para terminar 
	// de capturar calificaciones
	// utilizado una funcion que retorne el promedio
	Definir promedio Como Real;
	promedio <- calcularPromedio();
	Escribir 'Promedio de calificaciones = ',promedio;
FinAlgoritmo

Funcion promedio <- calcularPromedio()
	Definir promedio Como Real;
	Definir calf Como Entero;
	Definir acum Como Entero;
	acum <- 0;
	Definir contador Como Entero;
	contador <- 0;
	Repetir
		Escribir 'Proporciona una calificacion <-99 para terminar>' Sin Saltar;
		Leer calf;
		Si calf<>-99 Entonces
			acum <- acum+calf;
			contador <- contador+1;
		FinSi
	Mientras Que calf<>-99
	Escribir 'Usted ingreso: ',contador,' calificaciones ';
	Si contador>0 Entonces
		promedio <- acum/contador;
	SiNo
		promedio <- 0;
	FinSi
FinFuncion
