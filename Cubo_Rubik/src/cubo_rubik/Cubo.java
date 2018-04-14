
package cubo_rubik;

/**
 *
 * @author lucaz
 */
public class Cubo {
    
    public int Posiciones[] = new int [26];
    public int EstadoFinal[] = new int [26];
    int i;
    void EstadoFinal(){
        System.out.println("Estado Final es: ");
        for (i=0 ; i<26; i++){
            EstadoFinal[i] = i+1;
            if (i!=25) {
                System.out.print(EstadoFinal[i]+",");
            }
            else {
                System.out.print(EstadoFinal[i]);
            }
        }
    }
    public Cubo(){
        EstadoFinal();
    }
     

    
}
