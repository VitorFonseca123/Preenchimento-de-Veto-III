
package preenchimento.de.vetor.iii;
import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class PreenchimentoDeVetorIII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y=100;
        float X = in.nextFloat();
        float[] N = new float[y];
        N[0]= X;
        
        for(int i=1; i<y; i++){
            N[i]= N[i-1]/2;
           
            
            
        }
        for(int i=0; i<y; i++){
           
            System.out.printf("N["+i+"] = %.4f\n",N[i]);
            
        }
        
    }
    
}
