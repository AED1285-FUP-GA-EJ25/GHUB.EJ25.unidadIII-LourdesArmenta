package problema8;
//Proposito

import java.util.Scanner;

public class EscribirNumeroLetra {
    public static void escribirNumeroLetra(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Proporciona un numero de 1 a 3");
        int numero = sc.nextInt();
        String mensaje = determinarNombre(numero);
        System.out.println(mensaje);

    }
    private static String determinarNombre(int numero){
        switch (numero) {
            case 1:
                return "Uno";
    
            case 2:
                return "Dos";
            case 3:
                return "Tres";
        
            default:
                return "Fuera de Rango";
        }


    }
    
}
