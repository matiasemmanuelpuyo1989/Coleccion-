
package linkedlist;

import java.util.LinkedList;
/**
 *
 * @author Matias Emmanuel Puyo
 */
public class Linkedlist {

    
    public static void main(String[] args) {
        LinkedList listas=new LinkedList();
        //agregar
        listas.add(10);
        listas.add(50);
        listas.add(30);
        listas.add(40);
        listas.add(20);
        
        int tamanio=listas.size();
        int i=0;
        while(i<tamanio){
            System.out.println("[" + listas.get(i) + "]->" );
            i++;
            
        }
        //eliminar
            
            listas.remove(2);
            listas.add(3, 100);
            i=0;
            tamanio=listas.size();
            System.out.println();
            while(i<tamanio){
            System.out.println("["+listas.get(i)+"]->");
            i++;
            
        }
            
    }
    
}
