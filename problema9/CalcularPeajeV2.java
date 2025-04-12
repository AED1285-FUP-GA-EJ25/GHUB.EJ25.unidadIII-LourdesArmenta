package problema9;

import java.util.Scanner;

public class CalcularPeajeV2 {
    public static void calcularPeajeV2() {
        imprimirMenu();

        float cuota_peaje=seleccionarMenu();

        if (cuota_peaje != -1)
            System.out.println("Cuota peaja: "+cuota_peaje);

        
    }
    private static void imprimirMenu(){
        System.out.println();
        System.out.println("    Menu de Opciones   ");
        System.out.println("1) Turismo ($500)       ");
        System.out.println("2) Autobus ($1000)      ");
        System.out.println("3) Motocicleta ($100)   ");
        System.out.println("    0) Salir            ");

    }
    private static float seleccionarMenu(){
        Scanner sc = new Scanner(System.in);
        float cuota_peaje =0;
        
        short opcion = sc.nextShort();
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
                cuota_peaje = -1;
                break;
            default:
                System.out.println("opcion invalida");
                cuota_peaje = -1;
                break;
        }
        return cuota_peaje;

    }
    
}
