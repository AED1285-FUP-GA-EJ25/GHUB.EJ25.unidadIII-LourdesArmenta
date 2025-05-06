Algoritmo SumaIntervalo
	//Proposito: calcule la suma del intervalo de 11 a 50
	//           y lo imprima por pantalla
	//           utilizando la estructura Mientras
	//         ::11+12+13+14.....50
	//
	definir suma Como Entero;
	suma <- calcularSumaIntervalo();
	Escribir "suma = ",suma;
	
	
FinAlgoritmo
Funcion suma<-calcularSumaIntervalo()
	definir i como entero;
	definir suma Como Entero;
	suma <- 0;
	para i<- 11 hasta 50 con paso 1 Hacer
		suma <- suma +i;
	FinPara
	
FinFuncion
