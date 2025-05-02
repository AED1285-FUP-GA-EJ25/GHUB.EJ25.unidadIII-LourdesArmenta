package miPrincipal;

import java.util.Scanner;


public class DemoBucleFor {
    public static void main(String[] args) {
        //Uso del for
        for (int i=0;i>3;i++){ //i=0; 0>3
          System.out.println(i);  
        }
        //Lo de arriba es un bucle vacio, porqie la condicion de parada de inicio es false
        //por lo tanto nunca entra al cuerpo del bucle
        for (int i= 3;i>0;i--){ //i=0; 0>0;
            System.out.println(i);
        }

        for (int i= 3;i<0;i--){ //i=3;3<0;
            System.out.println(i);
        }
        //Lo de arriba es un bucle vacio, porqie la condicion de parada de inicio es false
        //por lo tanto nunca entra al cuerpo del bucle
        /*
        for (int i=0;i<3;i--){ //i=-3; -<3
            System.out.println(i);  
        }
            */
        //El de arriba es un bucle infinito, por lo tanto es infinito

        /*
        for (int i=5;i>0;i++){ //i=6; 6>0
            System.out.println(i);  
        }
        */
        System.out.println();
        int j;
        for(j=5; j<10;j++)
        {
            System.out.println(j);
        }
        System.out.println("Este es el valor de j"+j);

        for(j=5; j<10;j+=2) //j = 11 ; 11<10
        {
            System.out.println(j);
        }
        System.out.println("Este es el valor de j"+j);

        for(j=5; j<10;j*=2) //j = 10 ; 10<10
        {
            System.out.println(j);
        }
        System.out.println("Este es el valor de j"+j);

        /*
        for(j=5; j<10;j/=2) //j = 5 ; 5<10
        {
            System.out.println(j);
        }
        System.out.println("Este es el valor de j"+j);
        */
        //El de arriba es un ciclo infinito
        /*
         * NOTA: Regresar hacia atras y revisar un tema de estructuras de bifurcacion
         * que es el operado ?: diapositiva 13 del material colocado en Moodle
         */
        int a = 5, b =30;
        /* con el uso de if
        int mayor ;
        if (a>b)
           mayor = a;
        else
           mayor = b;
        
        System.out.println("El mayor es "+mayor);
        */
        //uso inLine
        int mayor =  a>b ? a: b;
        System.out.println("El mayor es "+mayor);
        b = 3;
        mayor =  a>b ? a: b;
        System.out.println("El mayor es "+mayor);

        //deterimina si un numero es para utilizando un if inLine o el operador ?:
        Scanner teclado = new Scanner(System.in);
        System.out.println("Proporciona un valor entero:");
        short var;
        var = teclado.nextShort();
        String mensaje = var % 2 == 0? "Es par": "Es impar";
        System.out.println(mensaje);








        
        


        

        
    }
    
}
