package problema15;

public class DemoMientras {
    public static void main(String[] args) {
        //Proposito:imprimir por pantalla el número del 0 al 10
	    // : es decir iterar 11 veces utilizando un bucle while
        System.out.println("Uso del ciclo for");
        for (int i=0;i<11;i++){
            System.out.println(i);
        }
        System.out.println("Uso del ciclo while");
        int i =0;
        while(i<11){
            System.out.println(i);
            i++;

        }
        System.out.println("Uso del ciclo do..while");
        i=0;
        do{
            System.out.println(i);
            i++;
           
        }while (i<11);
   
    }
    
}
