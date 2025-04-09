Algoritmo ComisionVentasV2
	// Proposito: Elabore un algoritmo que permita ingresar el monto de venta 
	// alcanzado por un vendedor durante un mes, 
	// luego de calcular la bonificación que le corresponde sabiendo:
	// Monto	Bonificación ( MOD )
	// 0-1000	    0
	// 1001-2000	2
	// 2001-3000	5
	// 3001-5000	10
	// > 5000	    15
	// Definir salida
	Definir comision Como Real;
	// Definir salida
	Definir ventas Como Real;
	Escribir 'Proporcione las ventas del mes:';
	Leer ventas;
	comision <- calcularBono(ventas);
	Escribir 'La comision es de: ',comision,' para una venta de: ',ventas;
FinAlgoritmo

Funcion comision <- calcularBono(ventas)
	Definir comision Como Real;
	Si ventas>0 Y ventas<=1000 Entonces
		comision <- 0;
	FinSi
	Si ventas>1000 Y ventas<=2000 Entonces
		comision <- ventas*.02;
	FinSi
	Si ventas>2000 Y ventas<=3000 Entonces
		comision <- ventas*.05;
	FinSi
	Si ventas>2000 Y ventas<=5000 Entonces
		comision <- ventas*.10;
	FinSi
	Si ventas>5000 Entonces
		comision <- ventas*.15;
	FinSi
	
FinFuncion

