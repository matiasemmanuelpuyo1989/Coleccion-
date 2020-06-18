/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumset;
import java.util.*;  
import java.util.Iterator;
import java.util.Set;
enum Dias {
    Lunes ,Martes ,Miercoles ,Jueves ,Viernes, Sabado, Domingo
}  

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Dias> set = EnumSet.of(Dias.Lunes, Dias.Miercoles);  
    // Elementos de desplazamiento
        Iterator<Dias> iter = set.iterator();  
        while (iter.hasNext())  
          System.out.println(iter.next());
    }
    
}
