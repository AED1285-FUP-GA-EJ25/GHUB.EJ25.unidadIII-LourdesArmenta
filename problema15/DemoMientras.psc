Algoritmo DemoMientras
	// proposito: imprimier por pantalla el número del 0 al 10
	// : es decir iterar 11 veces utilizando un bucle Mientras 
	Definir i Como Entero;
	escribir "uso de estructura para";
	para i<-0 hasta 10 con paso 1 Hacer
		escribir i;
	FinPara

	escribir "uso de estructura mientras";
	i <- 12;
	Mientras i<=11 Hacer // 12<=11 F
		Escribir i;
		i <- i+2;
	FinMientras
	Escribir 'Sali del bucle';
	
	escribir "uso de estructura repetir";
	i<-12;
	Repetir
		Escribir i;
		i <- i+2;
	Mientras Que i<=11; //14<=11 F
	Escribir 'Sali del bucle';
	
FinAlgoritmo
