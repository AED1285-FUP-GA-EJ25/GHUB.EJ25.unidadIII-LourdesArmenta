package problema5;
/*
 * // Proposito: Leer 3 numero por el teclado y determinar cual de ellos es el mayor,
	// considerando que los tres numeros son diferentes
	// Autor: Lourdes Armenta
	// Fecha: 3 de abril de 2025
	
 */
import java.util.Scanner;
public class DeterminaMayor3{
    public static void determinaMayor3(){
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
        if(a>b && b>c )
        {
            mayor = a;
        }
        if (b>a && b>c)
        {
            mayor = b;
        }
        if (c>a && c>b){
            mayor = c;
        }
        System.out.println("El mayor es: "+mayor);



    }
    
}