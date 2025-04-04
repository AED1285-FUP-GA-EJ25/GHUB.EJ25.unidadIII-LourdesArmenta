Algoritmo DeterminarMayor3V2
	// Proposito: Leer 3 numero por el teclado y determinar cual de ellos es el mayor,
	// 			considerando que los tres numeros son diferentes
	//			utilice una funcion de nombre determinarMayor que reciba como parametro
	//			tres argumentos de nombre num1,num2 y num3 y que retorne el mayor
	//
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
	mayor <- determinarMayor(a,b,c);
	Escribir 'El mayor es:',mayor;
FinAlgoritmo
Funcion mayor <- determinarMayor(num1,num2,num3)
	definir mayor Como Entero;
	Si (num1>num2) Y (num1>num3) Entonces
		mayor <- num1;
	FinSi
	Si (num2>num1) Y (num2>num3) Entonces
		mayor <- num2;
	FinSi
	Si (num3>num1) Y (num3>num2) Entonces
		mayor <- num3;
	FinSi
	
FinFuncion
