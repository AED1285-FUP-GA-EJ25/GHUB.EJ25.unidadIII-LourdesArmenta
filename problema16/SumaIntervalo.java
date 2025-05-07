package problema16;

public class SumaIntervalo {
    public static void sumaIntervalo(){
        int suma;
        suma = calcularSumaIntervalo();
        System.out.println(suma);


    }
    private static int calcularSumaIntervalo(){
        int i = 11;
        int suma = 0;
        while (i<=50){
            suma = suma + i;
            i++;
        }
        return suma;
    }
        
    
    
}
