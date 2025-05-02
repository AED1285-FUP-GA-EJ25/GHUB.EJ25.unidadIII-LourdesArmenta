package miPrincipal;

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
        


        

        
    }
    
}
