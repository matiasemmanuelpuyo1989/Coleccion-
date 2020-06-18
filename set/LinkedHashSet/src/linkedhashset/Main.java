
package linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Matias Emmanuel Puyo
 */
public class Main {

 
    public static void main(String[] args) {
        Set<String> lista= new LinkedHashSet<>();
        //agregamos elementos al Treeset
        lista.add("uno");    
        lista.add("dos");    
        lista.add("cinco");   
        lista.add("tres");  
        lista.add("cuatro");  
        Iterator<String> i=lista.iterator();  
        while(i.hasNext())  
          {  
             System.out.println(i.next());  
          }  
    }
    
}
