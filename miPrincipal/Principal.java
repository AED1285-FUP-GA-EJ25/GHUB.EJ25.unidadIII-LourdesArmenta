package miPrincipal;

import java.util.Scanner;
//


public class Principal {
    

    public static void main(String[] args) {
        menu();
        seleccionarMenu();
        //invocar al metodo estatico condicion1 de la clase Condicion1
        //forma1
        //problema1.Condicion1.condicion1();

        //invocar al problema
        //problema2.Condicion2.condicion2();

        //invoca al problema3
        //problema3.TramiteINE.tramiteINE();

        //invoco al problema4
        //problema4.TramiteINE.tramiteINE();

        //problema5.DeterminaMayor3.determinaMayor3();

        //problema5.DeterminarMator2V2.determinaMayor3V2();

        //problema5.DeterminarMayor3V3.determinarMayor3V3();

        //problema5.DeterminarMayor3V4.determinarMayor3V4();

        //problema6.ComisionVentas.comisionVentas();
        //problema7.EscribirNombreVocal.escribirNombreVocal();
       // problema8.EscribirNumeroLetra.escribirNumeroLetra();
     

        

        
       
    }
    public static void menu(){
        System.out.println();
        System.out.println("*************************** Menu de Opciones ************************");
        System.out.println("*\t                                                             *");
        System.out.println("*\t 1) Determina si un numero es mayor que cero                 *");
        System.out.println("*\t 2) Determina si un numero es positivo o negativo            *");
        System.out.println("*\t 3) Determina si una persona puede tramitar su INE           *");
        System.out.println("*\t 4) Determina si una persona puede tramitar su INE V2        *");
        System.out.println("*\t 5) Determina el mayor de 3 numeros                          *");
        System.out.println("*\t 6) Calcula comision de ventas                               *");
        System.out.println("*\t 7) Determina el nombre de una vocal                         *");
        System.out.println("*\t 8) Determina un numero del 1 al 3 en letra                  *");
        System.out.println("*\t 9) Determina en monto de Peaje en base a un menu            *");
        System.out.println("*\t 10) Determina en monto de Peaje en base a un menu V2        *");
        System.out.println("*\t                                                             *");
        System.out.println("*\t\t0) Salir                                             *");
        System.out.println("**********************************************************************");
        System.out.print("Seleccione Opcion:");

    }
    public static void seleccionarMenu(){
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                problema1.Condicion1.condicion1();
                break;
            case 2:
                problema2.Condicion2.condicion2();
                break;
            case 3:
                problema3.TramiteINE.tramiteINE();
                break;
            case 4:
                problema4.TramiteINE.tramiteINE();
                break;
            case 5:
                problema5.DeterminarMayor3V4.determinarMayor3V4();
                break;
            case 6:
                problema6.ComisionVentasV2.comisionVentasV2();
                break;
            case 7:
                problema7.EscribirNombreVocal.escribirNombreVocal();
                break;
            case 8:
                problema8.EscribirNumeroLetra.escribirNumeroLetra();
                break;

            case 9:
                problema9.CalcularPeaje.calcularPeaje();
                break;
            case 10:
                problema9.CalcularPeajeV2.calcularPeajeV2();
                break;
                
            case 0:
                System.out.println("Adios!");
                break;
        
            default:
            System.out.println("Opcion invalida");
                break;
        }

    }
}