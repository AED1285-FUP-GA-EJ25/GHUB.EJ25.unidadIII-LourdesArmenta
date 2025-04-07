package problema5;
import java.util.Scanner;
public class DeterminarMayor3V3{
    public static void determinarMayor3V3(){
         //creamos el objeto Scanner
         Scanner sc = new Scanner(System.in);
         //definir variable salida
         int mayor = 0;
         //deinir variables entrada
         int a,b,c;
         System.out.print("Proporciona primer numero:");
         a = sc.nextInt();
         System.out.print("Proporciona segundo numero:");
         b = sc.nextInt();
         System.out.print("Proporciona tercer numero:");
         c = sc.nextInt();
         mayor = determinarMayor(a, b, c);
         System.out.println("El mayor es: "+mayor);

    }
    public static int determinarMayor(int num1, int num2,int num3){
        int mayor=0;

        if(num1>num2 && num1>num3 )
            mayor = num1;
        else 
            if(num2>num1 && num2>num3)
                mayor = num2;
            else
                mayor = num3;
        return mayor;
        


    }

}