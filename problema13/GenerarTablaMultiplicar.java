package problema13;
/*
 * Proposito:generar una tabla de multiplicar del 1 al 10
	// solicitando al usuario la el número de la tabla
	// de multiplicar que se quiere generar, utilizando una Funcion 
	// de nombre generarTabla que reciba como parametro en numero de la tabla
	// 1 * 5 = 5
	// 2 * 5 = 10
	// 3 * 5 = 15
	// 4 * 5 = 20
	// 10 * 5 = 50
	// Autor:
	// Fecha:
	// Definir salida
	// Definir entrada
 * Autor:Lourdes Armenta
 * Fecha: 30 de abril de 2025
 */
import java.util.Scanner;


public class GenerarTablaMultiplicar {
    public static void generarTablaMultiplicar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Proporciona un numero:");
        int num = sc.nextInt();
        generarTabla(num);

        
    }
    public static void generarTabla(int num){
        System.out.println("Tabla de Multiplicar "+num);
        int i ;
        for(i=1;i<=10;i++){
            System.out.println(i+" * "+num+" = "+ i*num);
        }


    }
    
}
