package problema2;
// Proposito: Leer un numero y si es positivo que manda el mensaje Positivo
//            en caso contrario que mande el mensaje Negativo
//            utilizando una funcion de nombre determinarPositivoNegativo
//            esta funcion recibe como parametro un numero y si es positivo
//            retorna el mensaje 'Positivo' y si es negativo retorna el 
//            el mensaje 'Negativo'
// Fecha:31 de marzo de 2025
// Autor:Lourdes Armenta
import java.util.Scanner;

public class Condicion2{
    public static void condicion2(){
        //creo objeto Scanner
        Scanner entrada = new Scanner(System.in);
        //determinar variable de salida
        String mens;
        //determina varables de entrada
        int numero;
        System.out.print("Proporciona un numero:");
        numero = entrada.nextInt();
        mens = determinarPositivoNegativo(numero);
        System.out.println("el numero "+numero+" "+mens);

    }
    public static String determinarPositivoNegativo(int numero){
        String mensaje;
        if(numero>0){
           mensaje ="Positivo";
        }
        else{
           mensaje ="Negativo";
        }
        return mensaje;
    }



}