Algoritmo DeterminarMayor3
	// Proposito: Leer 3 numero por el teclado y determinar cual de ellos es el mayor,
	// considerando que los tres numeros son diferentes
	// Autor: Lourdes Armenta
	// Fecha: 3 de abril de 2025
	// Definir variable de salida
	Definir mayor Como Entero;
	// Definir variable de entrada
	Definir a,b,c Como Entero;
	// Proceso 
	Escribir 'Proporciona primer numero:' Sin Saltar;
	Leer a;
	Escribir 'Proporciona segundo numero:' Sin Saltar;
	Leer b;
	Escribir 'Proporciona tercer numero:' Sin Saltar;
	Leer c;
	Si (a>b) Y (a>c) Entonces
		mayor <- a;
	FinSi
	Si (b>a) Y (b>c) Entonces
		mayor <- b;
	FinSi
	Si (c>a) Y (c>b) Entonces
		mayor <- c;
	FinSi
	Escribir 'El mayor es:',mayor;
FinAlgoritmo
