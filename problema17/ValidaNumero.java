package problema17;
import java.util.Scanner;
public class ValidaNumero {
    static Scanner entrada = new Scanner(System.in); //a nivel de clase
    public static void validaNumero(){
        validarNumero();

    }
    private static void validarNumero(){
        
        int numero;
        do{
            System.out.println("Introduce un numero mayo que cero:");
            numero = entrada.nextInt();
        }while (numero<=0);
        System.out.println("El numero aceptado es: "+numero);


    }
    
}
