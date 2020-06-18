
package hashset;

import java.util.HashSet;

/**
 *
 * @author Matias Emmanuel Puyo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //no permite duplicado
        HashSet<String>mascotas=new HashSet<String>();
        //agregar elemento
        mascotas.add("Perro");
        mascotas.add("Gato");
        mascotas.add("Conejo");
        mascotas.add("Hamster");
        mascotas.add("Conejo");
        mascotas.add("Perro");
        mascotas.add("Gato");
        //hay 3 elemento duplicado.. Perro,Gato,Conejo
        //mostramos todo los elementos
        //System.out.println(mascotas);
        
        //tambien podemos usar un for para mostrar todos los elementos
        //for(String masco:mascotas){
           // System.out.println(masco);
        //}
        //eliminar todos los elementos
        //mascotas.clear();
        //System.out.println(mascotas);
        
        //eliminar un elemento especifico 
        mascotas.remove("Perro");
        System.out.println(mascotas);
    }
    
}
