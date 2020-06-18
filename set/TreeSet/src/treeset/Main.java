
package treeset;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Matias Emmanuel Puyo
 */
public class Main {

    public static void main(String[] args) {
        Set<String> lista= new TreeSet<>();
        //agregamos elementos al Treeset
        lista.add("matias");
        lista.add("gabriel");
        lista.add("Emmanuel");
        lista.add("matias");
        lista.add("puyo");
        //mostramos lo que hay en el elemento
        
        for(String elemento: lista){
            System.out.println(elemento);
        }
        
    }
    
}
