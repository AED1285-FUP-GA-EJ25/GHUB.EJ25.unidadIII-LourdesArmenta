package problema14;
/*
 * // Proposito: capturar 3 calificaciones de un alumno
	// y determinar su promedio
	// utilizado una funcion que retorne el promedio
 */
import java.util.Scanner;
public class CapturaCalificaciones {
    static Scanner sc = new Scanner(System.in);//la variable esta declarada a nivel de clase
                                            // debe ser estática para que pueda ser utilizada
                                            // por métodos estáticos
    public static void capturaCalificaciones(){ 
        System.out.print("Cantidad de calificaciones:");
        int n = sc.nextInt();
        double promedio = calcularPromedio(n);
        System.out.println(promedio);
    }
    private static double calcularPromedio(int n){
        double acum = 0;
        for (int i=1; i<=n; i++){
            System.out.print("Dame calificicacion "+i+":");
            int c = sc.nextInt();
            acum = acum +c; // acum+=c;
        }
        return acum/n;

    }
    
}
