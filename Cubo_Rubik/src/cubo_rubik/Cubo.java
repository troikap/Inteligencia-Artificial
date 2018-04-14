
package cubo_rubik;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author lucaz
 */
public class Cubo {
    public int Posiciones[] = new int [26];
    public int EstadoFinal[] = new int [26];
    ArrayList<Integer> Vertices = new ArrayList<Integer>();
    ArrayList<Integer> Vertices2 = new ArrayList<Integer>();
    ArrayList<Integer> Aristas = new ArrayList<Integer>();
    ArrayList<Integer> Aristas2 = new ArrayList<Integer>();
    
    public ArrayList<Integer> ArmandoVertices(){
        ArrayList<Integer> Lista = new ArrayList<Integer>();
        Lista.add(1);
        Lista.add(3);
        Lista.add(7);
        Lista.add(9);
        Lista.add(18);
        Lista.add(20);
        Lista.add(24);
        Lista.add(26);
        //ystem.out.println("Mostrando Vertices "+Lista);
        //System.out.println("Son "+Lista.size()+" Vertices");
        return Lista;
    }
    
    public ArrayList<Integer> ArmandoAristas(){
        ArrayList<Integer> Lista = new ArrayList<Integer>();
        Lista.add(2);
        Lista.add(4);
        Lista.add(6);
        Lista.add(8);
        Lista.add(10);
        Lista.add(12);
        Lista.add(15);
        Lista.add(17);
        Lista.add(19);
        Lista.add(21);
        Lista.add(23);
        Lista.add(25);
        //System.out.println("Mostrando Aristas "+Lista);
        //System.out.println("Son "+Lista.size()+" Aristas");
        return Lista;
    }
    
    void EstadoFinal(){
        System.out.println("Estado Final es: ");
        for (int i=0 ; i<26; i++){
            EstadoFinal[i] = i+1;
        }
        MostrarCubo(EstadoFinal);
    }
    public void MostrarCubo(int[] cubo){
        System.out.println(cubo[0]+"  -  "+cubo[1]+"  -  "+cubo[2]+"          "+cubo[9]+"  -  "+cubo[10]+"  -  "+cubo[11]+"          "+cubo[17]+"  -  "+cubo[18]+"  -  "+cubo[19]);
        System.out.println(cubo[3]+"  -  "+cubo[4]+"  -  "+cubo[5]+"          "+cubo[12]+"     -     "+cubo[13]+"          "+cubo[20]+"  -  "+cubo[21]+"  -  "+cubo[22]);
        System.out.println(cubo[6]+"  -  "+cubo[7]+"  -  "+cubo[8]+"          "+cubo[14]+"  -  "+cubo[15]+"  -  "+cubo[16]+"          "+cubo[23]+"  -  "+cubo[24]+"  -  "+cubo[25]);
        System.out.println();
    }
    public void GenerarCuboAleatorio(){
        this.Posiciones[4] = 5;
        this.Posiciones[12] = 13;
        this.Posiciones[10] = 11;
        this.Posiciones[13] = 14;
        this.Posiciones[15] = 16;
        this.Posiciones[21] = 22;
        Vertices = ArmandoVertices();
        Vertices2 = ArmandoVertices();
        Collections.shuffle(Vertices2);
        for (int i=0 ; i<Vertices.size(); i++){
                //System.out.println("Mostrando Vertices--------------------- "+this.Vertices.get(i));
                //System.out.println("------------------------------------------------------------- "+this.Vertices2.get(i));
                Posiciones[Vertices.get(i)-1] = Vertices2.get(i);
        }
        Aristas = ArmandoAristas();
        Aristas2 = ArmandoAristas();
        Collections.shuffle(Aristas2);
        for (int i=0 ; i<Aristas.size(); i++){
                //System.out.println("Mostrando Aristas--------------------- "+this.Aristas.get(i));
                //System.out.println("------------------------------------------------------------- "+this.Aristas2.get(i));
                Posiciones[Aristas.get(i)-1] = Aristas2.get(i);
        }
        System.out.println("El Cubo posee: "+Vertices.size()+" Vertices y "+Aristas.size()+" Aristas.");
        EstadoFinal();
        System.out.println("El Cubo Generado es: ");
        MostrarCubo(Posiciones);
    }
    public int[] MoverSuperiorAIzquierda(int cubito[]){
        int resagado = 0;
        int resagado2 = 0;
        resagado = cubito[0];
        cubito[0] = cubito[2];
        cubito[2] = cubito[19];
        cubito[19] = cubito[17];
        cubito[17] = resagado;
        resagado2 = cubito[1];
        cubito[1] = cubito[11];
        cubito[11] = cubito[18];
        cubito[18] = cubito[9];
        cubito[9] = resagado2;
        MostrarCubo(cubito);
        return cubito;
    }
    public int[] MoverSuperiorADerecha(int cubito[]){
        int resagado = 0;
        int resagado2 = 0;
        resagado = cubito[2];
        cubito[2] = cubito[0];
        cubito[0] = cubito[17];
        cubito[17] = cubito[19];
        cubito[19] = resagado;
        resagado2 = cubito[1];
        cubito[1] = cubito[9];
        cubito[9] = cubito[18];
        cubito[18] = cubito[11];
        cubito[11] = resagado2;
        MostrarCubo(cubito);
        return cubito;
    }
    public int[] MoverInferiorAIzquierda(int cubito[]){
        int resagado = 0;
        int resagado2 = 0;
        resagado = cubito[6];
        cubito[6] = cubito[8];
        cubito[8] = cubito[25];
        cubito[25] = cubito[23];
        cubito[23] = resagado;
        resagado2 = cubito[7];
        cubito[7] = cubito[16];
        cubito[16] = cubito[24];
        cubito[24] = cubito[14];
        cubito[14] = resagado2;
        MostrarCubo(cubito);
        return cubito;
    }        
    public int[] MoverInferiorADerecha(int cubito[]){
        int resagado = 0;
        int resagado2 = 0;
        resagado = cubito[8];
        cubito[8] = cubito[6];
        cubito[6] = cubito[23];
        cubito[23] = cubito[25];
        cubito[25] = resagado;
        resagado2 = cubito[7];
        cubito[7] = cubito[14];
        cubito[14] = cubito[24];
        cubito[24] = cubito[16];
        cubito[16] = resagado2;
        MostrarCubo(cubito);
        return cubito;
    }        
    public int[] MoverDerechaAArriba(int cubito[]){
        int resagado = 0;
        int resagado2 = 0;
        resagado = cubito[2];
        cubito[2] = cubito[8];
        cubito[8] = cubito[25];
        cubito[25] = cubito[19];
        cubito[19] = resagado;
        resagado2 = cubito[5];
        cubito[5] = cubito[16];
        cubito[16] = cubito[22];
        cubito[22] = cubito[11];
        cubito[11] = resagado2;
        MostrarCubo(cubito);
        return cubito;
    }
    public int[] MoverDerechaAAbajo(int cubito[]){
        int resagado = 0;
        int resagado2 = 0;
        resagado = cubito[8];
        cubito[8] = cubito[2];
        cubito[2] = cubito[19];
        cubito[19] = cubito[25];
        cubito[25] = resagado;
        resagado2 = cubito[5];
        cubito[5] = cubito[11];
        cubito[11] = cubito[22];
        cubito[22] = cubito[16];
        cubito[16] = resagado2;
        MostrarCubo(cubito);
        return cubito;
    }
    public int[] MoverIzquierdaAArriba(int cubito[]){
        int resagado = 0;
        int resagado2 = 0;
        resagado = cubito[0];
        cubito[0] = cubito[6];
        cubito[6] = cubito[23];
        cubito[23] = cubito[17];
        cubito[17] = resagado;
        resagado2 = cubito[3];
        cubito[3] = cubito[14];
        cubito[14] = cubito[20];
        cubito[20] = cubito[9];
        cubito[9] = resagado2;
        MostrarCubo(cubito);
        return cubito;
    }
    public int[] MoverIzquierdaAAbajo(int cubito[]){
        int resagado = 0;
        int resagado2 = 0;
        resagado = cubito[6];
        cubito[6] = cubito[0];
        cubito[0] = cubito[17];
        cubito[17] = cubito[23];
        cubito[23] = resagado;
        resagado2 = cubito[3];
        cubito[3] = cubito[9];
        cubito[9] = cubito[20];
        cubito[20] = cubito[14];
        cubito[14] = resagado2;
        MostrarCubo(cubito);
        return cubito;
    }
    public int[] MoverTraseroAIzquierda(int cubito[]){
        int resagado = 0;
        int resagado2 = 0;
        resagado = cubito[17];
        cubito[17] = cubito[19];
        cubito[19] = cubito[25];
        cubito[25] = cubito[23];
        cubito[23] = resagado;
        resagado2 = cubito[18];
        cubito[18] = cubito[22];
        cubito[22] = cubito[24];
        cubito[24] = cubito[20];
        cubito[20] = resagado2;
        MostrarCubo(cubito);
        return cubito;
    }
    public int[] MoverTraseroADerecha(int cubito[]){
        int resagado = 0;
        int resagado2 = 0;
        resagado = cubito[19];
        cubito[19] = cubito[17];
        cubito[17] = cubito[23];
        cubito[23] = cubito[25];
        cubito[25] = resagado;
        resagado2 = cubito[18];
        cubito[18] = cubito[20];
        cubito[20] = cubito[24];
        cubito[24] = cubito[22];
        cubito[22] = resagado2;
        MostrarCubo(cubito);
        return cubito;
    }
    public int[] MoverFrontalAIzquierda(int cubito[]){
        int resagado = 0;
        int resagado2 = 0;
        resagado = cubito[0];
        cubito[0] = cubito[2];
        cubito[2] = cubito[8];
        cubito[8] = cubito[6];
        cubito[6] = resagado;
        resagado2 = cubito[1];
        cubito[1] = cubito[5];
        cubito[5] = cubito[7];
        cubito[7] = cubito[3];
        cubito[3] = resagado2;
        MostrarCubo(cubito);
        return cubito;
    }
    public int[] MoverFrontalADerecha (int cubito[]){
        int resagado = 0;
        int resagado2 = 0;
        resagado = cubito[2];
        cubito[2] = cubito[0];
        cubito[0] = cubito[6];
        cubito[6] = cubito[8];
        cubito[8] = resagado;
        resagado2 = cubito[1];
        cubito[1] = cubito[3];
        cubito[3] = cubito[7];
        cubito[7] = cubito[5];
        cubito[5] = resagado2;
        MostrarCubo(cubito);
        return cubito;
    }
    
    public Cubo(){
        //Aristas();
        //Vertices();
        GenerarCuboAleatorio();
        //MoverFrontalADerecha(Posiciones);
    }
}
