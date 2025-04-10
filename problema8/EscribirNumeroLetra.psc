Algoritmo EscribirNumeroLetra
	//Proposito:
	//Autor:
	//Fecha:
	definir numero Como Entero;
	definir mensaje Como Caracter;
	Escribir "Proporciona Numero de 1 a 3" Sin Saltar;
	Leer numero;
	mensaje <- determinarNombre(numero);
	escribir mensaje;
FinAlgoritmo
funcion nombreNumero<- determinarNombre(numero)
	definir nombreNumero Como Caracter;
	segun numero hacer
		1:
			nombreNumero<-"Uno";
		2:
			nombreNumero<-"Dos";
		3:
			nombreNumero<-"Tres";
		De Otro Modo:
			nombreNumero<-"Fuera de Rango";
	FinSegun
	
FinFuncion
