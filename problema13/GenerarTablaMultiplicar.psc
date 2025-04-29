Algoritmo GenerarTablaMultiplicar
	// Proposito: generar una tabla de multiplicar del 1 al 10
	// solicitando al usuario la el número de la tabla
	// de multiplicar que se quiere generar, utilizando una Funcion 
	// de nombre generarTabla que reciba como parametro en numero de la tabla
	// 1 * 5 = 5
	// 2 * 5 = 10
	// 3 * 5 = 15
	// 4 * 5 = 20
	// 10 * 5 = 50
	// Autor:
	// Fecha:
	// Definir salida
	// Definir entrada
	Definir num Como Entero;
	Escribir 'Proporciona numero:';
	Leer num;
	generarTabla(num);
FinAlgoritmo

Funcion generarTabla(num)
	Definir i Como Entero;
	Escribir 'TABLA DE MULTIPLICAR DEL ',num;
	Para i<-1 Hasta 10 Hacer
		Escribir i,' * ',num,' = ',i*num;
	FinPara
FinFuncion
