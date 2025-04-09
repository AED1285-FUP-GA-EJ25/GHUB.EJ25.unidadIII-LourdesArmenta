Algoritmo ComisionVentas
	// Proposito: Elabore un algoritmo que permita ingresar el monto de venta 
	//alcanzado por un vendedor durante un mes, 
	//luego de calcular la bonificación que le corresponde sabiendo:
	// Monto	Bonificación (%)
	// 0-1000	    0
	// 1001-2000	2
	// 2001-3000	5
	// 3001-5000	10
	//> 5000	    15
	// utilice una funcion de nombre calcularBono que regrese la comision
	// de acuerdo a la venta y reciba como parametro la venta realizada
	//Definir salida
	Definir comision como Real;
	//Definir salida
	Definir ventas como Real;
	Escribir "Proporcione las ventas del mes:";
	Leer ventas;
	comision <- calcularBono(ventas);
	Escribir "La comision es de: ", comision , " para una venta de: ",ventas;
	
	
FinAlgoritmo

Funcion comision <- calcularBono(ventas)
	Definir  comision Como Real;
	si ventas<=1000 Entonces
		comision <- 0;
	SiNo
		si ventas <=2000 Entonces
			comision <- ventas *.02;
		SiNo
			si ventas <=3000 Entonces
				comision <- ventas *.05;
			SiNo
				si ventas<=5000 Entonces
					comision <- ventas *.10;
				SiNo
					comision <- ventas *.15;
					
				FinSi
			FinSi
		FinSi
	FinSi
	
FinFuncion
