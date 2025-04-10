package problema7;
/*
 * Proposito:Leer una vocal por el teclado y que genere una salida
	        // con el nombre de la vocal, ejemplo: a "el nombre de la vocal es a"
	        // e "el nombre de la vocal es e"
	        // utilizando la estructra Segun 
 * Autor:
 * Fecha:
 */
import java.util.Scanner;
public class EscribirNombreVocal {
    public static void escribirNombreVocal(){
        //definir objeto Scanner
        //definir entrada
        char vocal;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una vocal:");
        vocal = entrada.next().charAt(0);
        String mensaje = determinarNombre(vocal);
        System.out.println(mensaje);
    }
    private static String determinarNombre(char vocal){
        String mensaje;
        switch (vocal) {
            case 'a':
                mensaje = "El nombre de la vocal es a"; 
                break;
            case 'e':
                mensaje = "El nombre de la vocal es e"; 
                break;
            case 'i':
                mensaje = "El nombre de la vocal es i"; 
                break;
            case 'o':
                mensaje = "El nombre de la vocal es o"; 
                break;
            case 'u':
                mensaje = "El nombre de la vocal es u"; 
                break;
            default:
                mensaje = "No es una vocal"; 
               
        }
        /* Esto es lo mismo que la sentencia de arriba
        if(vocal=='a')
        {
            mensaje= "El nombre de la vocal es a"; 
        }
        else if (vocal=='e'){
            mensaje= "El nombre de la vocal es e"; 
        } else if (vocal =='i'){
            mensaje= "El nombre de la vocal es i"; 
        } else if(vocal=='o'){
            mensaje= "El nombre de la vocal es o"; 
        }else if(vocal=='u'){
            mensaje= "El nombre de la vocal es u"; 
        }else{
            mensaje= "No es una vocal"; 
        }
        */
        
        //esta es la linea que sigue al break
        return mensaje;

    }
    
}
