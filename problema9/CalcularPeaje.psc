Algoritmo CalcularPeaje
	//propisito: seleccionar un tipo de vehiculo y dependiendo de este se
	//           le asigará una cuota de peaja utilizando la sentencia segun
	//Definir salida
	Definir cuota_peaje Como Real;
	//definir entrada
	Definir opcion como Entero;
	Escribir "    Menu de Opeciones   ";
	Escribir "1) Turismo ($500)       ";
	Escribir "2) Autobus ($1000)      ";
	Escribir "3) Motocicleta ($100)   ";
	Escribir "    0) Salir            ";
	Leer opcion;
	segun opcion hacer
		1:
			cuota_peaje <-500;
		2:
			cuota_peaje<-1000;
		3:
			cuota_peaje<-100;
		0:
			escribir "Adios!";
		De Otro Modo:
			Escribir "Opcion inválida";
			
	FinSegun
	si (opcion>=1 y opcion<=3)
		Escribir "Cuota de Peaje = ",cuota_peaje;
	finSi
	
	
FinAlgoritmo
