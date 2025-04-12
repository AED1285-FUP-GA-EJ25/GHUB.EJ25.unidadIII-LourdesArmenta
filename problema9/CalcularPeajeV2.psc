Algoritmo CalcularPeajeV2
	// propisito: seleccionar un tipo de vehiculo y dependiendo de este se
	// le asigar� una cuota de peaja utilizando la sentencia segun,
	// utilice una funcion para imprimir el menu de nombre imprimirMenu
	// que no regrese nada y no reciba nada, de igual manera hacer otra funcion para seleccion
	// la opcion del Menu de nombre seleccionarMenu que regrese el peaje de acuerdo al
	//tipo de vehiculo y no reciba ningun parametro
	// Definir salida
	Definir cuota_peaje Como Real;
	// definir entrada
	
	imprimirMenu();
	cuota_peaje <- seleccionarMenu();
	Si (cuota_peaje <> -1 ) Entonces
		Escribir 'Cuota de Peaje = ',cuota_peaje;
	FinSi
FinAlgoritmo
Funcion imprimirMenu
	Escribir '    Menu de Opciones   ';
	Escribir '1) Turismo ($500)       ';
	Escribir '2) Autobus ($1000)      ';
	Escribir '3) Motocicleta ($100)   ';
	Escribir '    0) Salir            ';
FinFuncion

Funcion cuota_peaje<-seleccionarMenu()
	Definir  opcion Como Entero;
	definir cuota_peaje Como Real;
	cuota_peaje <- 0;
	Leer opcion;
	Segun opcion  Hacer
		1:
			cuota_peaje <- 500;
		2:
			cuota_peaje <- 1000;
		3:
			cuota_peaje <- 100;
		0:
			Escribir 'Adios!';
			cuota_peaje <- -1;
		De Otro Modo:
			Escribir 'Opcion inv�lida';
			cuota_peaje <- -1;
	FinSegun
FinFuncion

