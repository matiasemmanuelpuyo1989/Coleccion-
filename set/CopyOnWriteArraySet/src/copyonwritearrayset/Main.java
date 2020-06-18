
package copyonwritearrayset;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 *
 * @author Matias Emmanuel Puyo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>(Arrays.asList(1,2,3));
        System.out.println(set);    //[1, 2, 3]
 
//Obtener interador 1
Iterator<Integer> itr1 = set.iterator();
 
//Agrega un elemento y verifica que el conjunto este actualizado
set.add(4);
System.out.println(set);    //[1, 2, 3, 4]
    }
    
}
