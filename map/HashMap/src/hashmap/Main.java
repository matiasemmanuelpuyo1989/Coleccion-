
package hashmap;

import java.util.HashMap;
/**
 *
 * @author Matias Emmanuel Puyo
 */
public class Main {

    
    public static void main(String[] args) {
        HashMap<String, String> lista= new HashMap<>();
        //Agregar elementos
        lista.put("matias","3423565");
        lista.put("gabriel","3233525");
        lista.put("jorge","342556555");
        lista.put("julio","342789123");
        
        //tamaño
        int i= lista.size();
        System.out.println("Tamaño: "+i);
        
        //Obtener
        String telefono=lista.get("matias");
        System.out.println("telefono: "+telefono);   
        //Eliminar todo los elementos
        lista.clear();
        int k= lista.size();
        System.out.println("Eliminado: "+k);
        //remover solo un elemento
        lista.remove("jorge");
        int j= lista.size();
        System.out.println("Tamaño: "+j);
        //Determinar si hay elementos
        boolean mt=lista.isEmpty();
        System.out.println("Tiene elemento?: "+mt);
        
        
    }
    
}
