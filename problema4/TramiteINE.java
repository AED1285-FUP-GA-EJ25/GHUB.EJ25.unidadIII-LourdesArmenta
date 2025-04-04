package problema4;
/*
 * // Proposito:Determinar si una persona puede hacer su tramite de su INE
	// considerando que se conoce su año de Nacimiento, y el año Actual donde ambos
    // valores deben introducirse por teclado, deberá utilizar 
	// una funcion que retorne el mensaje "Si pude tramitar' o 
	// 'No puede tramitar' en función de la edad.
	// Autor:
	// Fecha:
	// Determinar salida
 */
import java.util.Scanner;

public class TramiteINE {
    public static void tramiteINE(){
        //crear el objeto scanner
        Scanner entrada = new Scanner(System.in);
        //Datos salida
        String mens;
        //Dato de entrada
        int anioActual,anioNacimiento;
        //proceso
        System.out.print("Proporciona Anio Actual:");
        anioActual = entrada.nextInt();
        System.out.print("Proporciona Anio de Naciomiento:");
        anioNacimiento = entrada.nextInt();
        mens = tramitarSiNo(anioActual,anioNacimiento);
        System.out.println(mens);


    }
    public static String tramitarSiNo(int anioActual,int anioNacimiento){
        String mensaje;
        
        int edad = anioActual-anioNacimiento;
        if(edad>=18){
            mensaje = "Si puede tramitar";

        }else{
            mensaje= "No puede tramitar";
        }
        return mensaje;
    
    

    }
    
}
