package problema1;
/*
 * // Proposito: Leer un numero y determine si es mayor que cero
	// Fecha: 27/03/25
	// Autor: Lourdes Armenta
 */
import java.util.Scanner;
public class Condicion1 {
    public static void condicion1(){
        //crear un objeto tipo Scanner
        Scanner teclado = new Scanner(System.in);
        //defino salida
        String mens; //declar una variable de nombre mens como char
        //defino entrada
        int numero; //declaran una variable de nombre numero como int
        System.out.print("Proporciona un número:");
        numero = teclado.nextInt();
        //invocar a la funcion
        mens = determinarMayorQuecero(numero);
        System.out.println(numero+" "+mens);
    }

    public static String determinarMayorQuecero(int numero){
        String mensaje;
        mensaje ="" ;
        if (numero>0)
        {
            mensaje = " Numero es positivo";
        }
        return mensaje;


    }










}
