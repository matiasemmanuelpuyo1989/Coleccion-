
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    
    public static void main(String[] args) {
        Scanner Datos=new Scanner(System.in);
        ArrayList listas=new ArrayList();
        
        //añadir al arraylist
        listas.add("matias");
        listas.add("Gabriel");
        listas.add("Nicolas");
        listas.add("jorge");
        listas.add("Adriana");
        
        //mostrar elemento de la arraylist
        
        listas.forEach((misDatos)->{
            System.out.println(misDatos);
        });
        
        //eliminar elementos del arraylist
        listas.remove(3);
        System.out.println("Elemento nuevo");
        listas.forEach((misDatos)->{
            System.out.println(misDatos);
        });
        
    }
    
}
