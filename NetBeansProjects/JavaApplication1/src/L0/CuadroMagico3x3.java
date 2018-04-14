/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L0;

/**
 *
 * @author lucaz
 */
public class CuadroMagico3x3 {

    /**
     * @param args the command line arguments
     */
    
    
        private static int Cuadro[][] = new int [3][3];
        void llenar() {
            for (int i=0;i<3;i++){
                for (int j=0;j<3;j++){
                    Cuadro[i][j] = 0;
                }
            }
        }
        private static int pares[] = new int [4];
        private static int impares[] = new int [5];
        
        void pareseimpares(){
            int x=0, y=0;
            for (int n=9;n>0;n--){
                if (n%2==0){
                    pares[x]=n;
                    x++;
                }
                else {
                    impares[y]=n;
                    y++;
                }
            }
        }
        
        void acomodarpares(){
            int x=0;
            for (int i=0;i<3;i++){
                for(int j=2;j>=0;j--){
                    if(i%2==0 && j%2==0){
                        Cuadro[i][j]=pares[x];
                        x++;
                    }
                }
            }
        }
    
        void acomodarimpares(){
            int y=4;
            for (int i=0;i<3;i++){
                for(int j=2;j>=0;j--){
                    if(Cuadro[i][j] == 0){
                        Cuadro[i][j]=impares[y];
                        y--;
                    }
                }
            }
        }
        
        void mostrar(){
            for(int i = 0; i<3; i++){
                for (int j=0;j<3; j++){
                    System.out.print("|" + Cuadro[i][j]+ "|");
                }
            }System.out.println(" ");
        }
    
    public static void main(String[] args) {
        
        CuadroMagico3x3 o = new CuadroMagico3x3();
        o.pareseimpares();
        o.acomodarpares();
        o.acomodarimpares();
        o.mostrar();
        // TODO code application logic here
    }
    
}
