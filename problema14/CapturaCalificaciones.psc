Algoritmo CapturaCalificaciones
	// Proposito: capturar 3 calificaciones de un alumno
	// y determinar su promedio
	// utilizado una funcion que retorne el promedio
	Definir promedio Como Real;
	Definir n Como Entero;
	Escribir 'Cantidad de calificaciones:' sin saltar; 
	Leer n;
	promedio <- calcularPromedio(n);
	Escribir promedio;
FinAlgoritmo

Funcion promedio <- calcularPromedio(n)
	Definir promedio Como Real;
	Definir i Como Entero;
	Definir c Como Entero;
	Definir acum Como Entero;
	acum <- 0;
	Para i<-1 Hasta n Hacer
		Escribir 'Dame calificicacion ',i,':' sin saltar;
		Leer c;
		acum <- acum+c;
	FinPara
	promedio <- acum/n;
FinFuncion
