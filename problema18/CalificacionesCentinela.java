package problema18;
import java.util.Scanner;

public class CalificacionesCentinela {
    static Scanner teclado =new Scanner(System.in);
    public static void calificacionesCentinela() {
        double promedio = calcularPromedio();
        System.out.println("Promedio: "+promedio);
    }
    private static double calcularPromedio(){
        int calf = 0;
        int acum = 0;
        int contador = 0;
        double promedio;
        do{
           System.out.print("Dame calificacion < -99 para termina> :");
           calf = teclado.nextInt();
           if (calf != -99){
              acum = acum+calf;
              contador++;
           }
        } while( calf != -99) ;

        System.out.println("Usted capturo "+contador+" calificaciones");
        if (contador>0)
           promedio = acum/contador;
        else
           promedio = 0;
    
        return promedio;



    }
    
}
