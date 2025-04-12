package problema9;
/*
 * //propisito: seleccionar un tipo de vehiculo y dependiendo de este se
//           le asigará una cuota de peaja utilizando la sentencia switch
	
 */
import java.util.Scanner;
public class CalcularPeaje {
    public static void calcularPeaje(){
        Scanner sc = new Scanner(System.in);
        //Definir salida
        float cuota_peaje=0;
	    //definir entrada
	    short opcion;
	    System.out.println("    Menu de Opciones   ");
        System.out.println("1) Turismo ($500)       ");
        System.out.println("2) Autobus ($1000)      ");
        System.out.println("3) Motocicleta ($100)   ");
        System.out.println("    0) Salir            ");
        opcion = sc.nextShort();
        switch (opcion){
            case 1:
                cuota_peaje = 500;
                break;
            case 2:
                cuota_peaje = 1000;
                break;
            case 3:
                cuota_peaje = 100;
                break;
            case 0:
                System.out.println("ADIOS!");
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }
        if (opcion>=1 &&  opcion<=3)
		   System.out.println("Cuota de Peaje = "+cuota_peaje);


    }

    
}
