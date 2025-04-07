package problema5;
/*
 *  // Proposito: Leer 3 numero por el teclado y determinar 
 *  //cual de ellos es el mayor, considerando que los tres numeros 
 *  //son diferentes y además deberá utilizar una funcion de nombre
 *   determinarMayor que reciba como parametro tres argumentos de nombre:
 *  num1,num2 y num3 y que retorne el mayor
	// Autor: Lourdes Armenta
	// Fecha: 3 de abril de 2025
	
 */
import java.util.Scanner;

public class DeterminarMator2V2 {
    public static void determinaMayor3V2(){
        //creamos el objeto Scanner
        Scanner sc = new Scanner(System.in);
        //definir variable salida
        int mayor = 0;
        //deinir variables entrada
        int a,b,c;
        System.out.print("Proporciona primer numero:");
        a = sc.nextInt();
        System.out.print("Proporciona segundo numero:");
        b = sc.nextInt();
        System.out.print("Proporciona tercer numero:");
        c = sc.nextInt();
        mayor = determinarMayor(a, b, c);
        System.out.println("El mayor es: "+mayor);

    }
    public static int determinarMayor(int num1, int num2,int num3){
        int mayor=0;

        if(num1>num2 && num1>num3 )
        {
            mayor = num1;
        }
        if (num2>num1 && num2>num3)
        {
            mayor = num2;
        }
        if (num3>num1 && num3>num2){
            mayor = num3;
        }
        return mayor;


    }
    
}
