
package treemap;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Matias Emmanuel Puyo
 */
public class Main {

    
    public static void main(String[] args) {
        Map<Integer, String> animal=new TreeMap<Integer, String>();
        //agregar elemento animal
        animal.put(1, "leon");
        animal.put(4, "tigre");
        animal.put(2, "leopardo");
        animal.put(3, "caballo");
        animal.put(5, "mono");
        
        System.out.println(animal);
        
    }
    
}
