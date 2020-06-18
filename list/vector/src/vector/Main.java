
package vector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Matias Emmanuel Puyo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //creado un vector
        int Vector[]=new int[5];
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for (int x = 0; x < 4; x++) {
            System.out.println("Ingrese Numero en la posicion: "+"("+(x+1)+")");
            
            String numero=br.readLine();
            Vector[x]=Integer.parseInt(numero);
        }
        for (int y = 0; y < 4; y++) {
            System.out.println(Vector[y]);
        }
    }
    
}
