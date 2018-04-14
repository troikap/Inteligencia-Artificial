
package cubo_rubik;

/**
 *
 * @author lucaz
 */
public class Cubo_Rubik {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Cubo cubito = new Cubo();
        InterfazCubo_Rubik interfaz= new InterfazCubo_Rubik(cubito);
        interfaz.setVisible(true);
    }
    
}
