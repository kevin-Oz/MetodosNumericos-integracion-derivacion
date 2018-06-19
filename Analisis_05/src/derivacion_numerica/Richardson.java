
package derivacion_numerica;

/**
 *
 * @author kevin Figueroa
 *
 * aproximacion de richardson para derivadas de orden 1 ----> falta algo nose xd no me gusta como quedo :V
 * 
 * 
 */
public class Richardson {

    private final double x;
    private final double h;
    private final String f;

    public Richardson(double x, double h, String f) {
        this.x = x;
        this.h = h;
        this.f = f;
    }

    //calculo de h hasta nivel 3 
    
// revisar el calculo de la h y compararlo con el codigo de rosemberg    
    
    public double[][] Dh_OrdenUno() {
        double[] aches = new double[3];
        aches[0] = h;
        for (int i = 1; i < 3; i++) {
            aches[i] = h / (i * 2);
        }
        double valores[] = new double[aches.length];

        for (int i = 0; i < aches.length; i++) {
            Centradas dh = new Centradas(x, aches[i], f);
            valores[i] = dh.segunda_Dif();         // define el orden que desea-------> programa un metodo para calcular dif derivada

        }

        double nivel_uno[] = new double[valores.length - 1];
        double nivel_dos;

        for (int i = 1; i <= nivel_uno.length; i++) {
            nivel_uno[i - 1] = ((1.33333333333) * (valores[i]) - (0.33333333) * (valores[i - 1]));

        }
        for (int i = 0; i < nivel_uno.length; i++) {
        }

        nivel_dos = ((1.3333333) * (nivel_uno[1]) - (0.33333333) * (nivel_uno[0]));

        double matriz[][]= new double[aches.length][aches.length+1];
        
        for (int i = 0; i < aches.length; i++) {
            for (int j = 0; j <aches.length+1; j++) {
                if(j==0){
                    matriz[i][j]=aches[i];
                    }else if(j==1){
                    matriz[i][j]=valores[i];
                }else{
                        matriz[1][2]=nivel_uno[0];
                        matriz[2][2]=nivel_uno[1];
                     
                    }
                   matriz[2][3]=nivel_dos;
        }
        }
        
        return matriz;

}
}
