
package concurrentskiplistset;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NavigableSet<String> ciudadSet = new ConcurrentSkipListSet<String>();
        ciudadSet.add("La Rioja");
        ciudadSet.add("Catamarca");
        ciudadSet.add("Cordoba");
        ciudadSet.add("Jujuy");
        
        System.out.println("---- Atravesando el set-----");
        Iterator<String> itr = ciudadSet.iterator();
        while(itr.hasNext()){
            System.out.println("Valor -  " + itr.next());
        }
    }
    
}
