Algoritmo SumaIntervalo
	// Proposito: calcule la suma del intervalo de 11 a 50
	// y lo imprima por pantalla
	// utilizando la estructura Mientras
	// ::11+12+13+14.....50
	Definir suma Como Entero;
	suma <- calcularSumaIntervalo();
	Escribir 'suma = ',suma;
FinAlgoritmo

Funcion suma <- calcularSumaIntervalo()
	Definir i Como Entero;
	Definir suma Como Entero;
	suma <- 0;
	i<-11;
	Mientras i<=50 Hacer
		suma = suma +i;
		i <- i+1;
	Fin Mientras
	
	
FinFuncion
