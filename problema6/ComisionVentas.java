package problema6;
    
    // Proposito: Elabore un algoritmo que permita ingresar el monto de venta 
	// alcanzado por un vendedor durante un mes, 
	// luego de calcular la bonificación que le corresponde sabiendo:
	// Monto	Bonificación ( MOD )
	// 0-1000	    0
	// 1001-2000	2
	// 2001-3000	5
	// 3001-5000	10
	// > 5000	    15
	// utilice una funcion de nombre calcularBono que regrese la comision
	// de acuerdo a la venta y reciba como parametro la venta realizada
    /*
     * Autor: Lourdes Armenta
     * Fecha: 9 de abril de 2025
     */

import java.util.Scanner;
public class ComisionVentas{
    public static void comisionVentas(){
        //declaro objeto scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Proporcione las ventas del mes");
        double ventas = sc.nextDouble();
        double comision = calcularBono(ventas);
        System.out.println("La comision es de: "+comision+" para una venta de: "+ventas);

    }
    private static double calcularBono(double ventas){
        double comision;
        if (ventas<1000)
        {
            comision = 0.0;
        }
        else if(ventas<=2000)
        {
            comision = ventas * 0.02;
        }
        else if(ventas<=3000)
        {
            comision = ventas * 0.05;
        }
        else if(ventas<=5000)
        {
            comision = ventas * 0.10;
        }
        else
        {
            comision = ventas * 0.15;
        }
        return comision;

    }
}