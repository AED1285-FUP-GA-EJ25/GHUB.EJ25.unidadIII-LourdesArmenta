package miPrincipal;

import java.util.Scanner;
//

import problema14.CapturaCalificaciones;


public class Principal {
    

    public static void main(String[] args) {
        menu();
        seleccionarMenu();
       

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
        System.out.println("*\t 11) Imprimir Hola 10 veces                                  *");
        System.out.println("*\t 12) Imprimir del 1 al 10                                    *");
        System.out.println("*\t 13) Imprimir del 10 al 1                                    *");
        System.out.println("*\t 14) Generar una tabla de multiplicar                        *");
        System.out.println("*\t 15) Calcular promedio de n calificaciones                   *");
        System.out.println("*\t 16) Calcula suma en intervalo 11 a 50                       *");
        System.out.println("*\t 17) Captura numero mayor que cero                           *");

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
            case 11:
                problema10.DemostrarBucle1.demostrarBubcle1();
                break;
            case 12:
                problema11.DemostrarBucle2.demostrarBucle2();
                break;
            case 13:
                problema12.DemostrarBucle3.demostrarBucle3();
                break;
            case 14:
                problema13.GenerarTablaMultiplicar.generarTablaMultiplicar();
                
                break;
            case 15:
                problema14.CapturaCalificaciones.capturaCalificaciones();
                break;
            case 16:
                problema16.SumaIntervalo.sumaIntervalo();
                break;
            case 17:
                problema17.ValidaNumero.validaNumero();
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