
package linkedhashmap;
import java.util.Map;
import java.util.LinkedHashMap;

/**
 *
 * @author Matias Emmanuel Puyo
 */
public class Main {

    
    public static void main(String[] args) {
        Map<Integer, String> lmap =new LinkedHashMap<Integer, String>();
        lmap.put(1, "manzana");
        lmap.put(2, "pera");
        lmap.put(3, "frutilla");
        lmap.put(4, "banana");
        lmap.put(5, "ciruela");
        System.out.println(lmap);
        
    }
    
}
