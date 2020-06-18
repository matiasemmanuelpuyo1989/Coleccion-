
package enummap;

import java.util.EnumMap;

/**
 *
 * @author Matias Emmanuel Puyo
 */
public class Main {

    enum Size{
        S,M,L,XL,XXL,XXXL
    }
    public static void main(String[] args) {
        EnumMap<Size, String> tamaño=new EnumMap<>(Size.class);
        tamaño.put(Size.S, "S");
        tamaño.put(Size.M, "M");
        tamaño.put(Size.L, "L");
        tamaño.put(Size.XL, "XL");
        tamaño.put(Size.XXL, "XXL");
        tamaño.put(Size.XXXL, "XXXL");
        
        for(Size size: Size.values()){
            System.out.println(size + ":" + tamaño.get(size));
        }
    }
    
}
