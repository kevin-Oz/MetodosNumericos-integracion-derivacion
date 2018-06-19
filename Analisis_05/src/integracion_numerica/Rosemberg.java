package integracion_numerica;
import integracion_numerica.Regla_del_Trapecio;
/**
 *
 * @author kevin Figueroa
 */
public class Rosemberg {

private final String f;
private final double a;
private final double b;
private int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    public Rosemberg(String f, double a, double b) {
        this.f = f;
        this.a = a;
        this.b = b;
    }
     
    
    public double [] aches(){
        double[] aches = new double[nivel+1];
        aches[0] = (b-a);
        for (int i = 1; i<aches.length; i++) {
            aches[i] =(aches[i-1] /(2));
        }
    return aches;
    }
    
    public double rosemberg(int k,double r1,double r2){
        double potencia=Math.pow(4,k);
      double valor= (((potencia*r1)-(r2))/(potencia-1));
    return valor;
        
    }
    
    public double [][] levels(double [] aches){
        Regla_del_Trapecio rt = new Regla_del_Trapecio(f, a, b);
        Rosemberg romberg = new Rosemberg(f, a, b);
       //matriz que almacenara todos los datos
        double [][] ros= new double[nivel+1][nivel+2];
        
        // llenado de la matriz con los valores de h y calculo de la primer columna por el metodo del trapecio
        for (int i = 0; i <nivel+1; i++) { 
                for (int j = 0; j <nivel+2; j++) {
                if(j==0){
                     ros[i][j]=aches[i];
                }else{
                    if(i==0 && j==1){
                           
                       ros[i][j]=rt.simple(); 
                    } 
                    else if(i>=1 && j==1){
                        double aux = (b-a)/ros[i][0];
                        int temp = (int)aux;
                        rt.setN(temp);
                     ros[i][j]=rt.compuesto(rt.relleno(ros[i][0]),ros[i][0]);
                    }
                    
                }
            }
           
        }
        //ciclo para los niveles de Rosemberg
        int k=-1;
        while (k <=nivel) {
                //recorrido de la Matriz
               for (int j = 0; j <nivel+2; j++) {
                 for (int i = 0; i < nivel+1; i++) {
                        if(i>(j-2) && j>1){            
                            ros[i][j]=romberg.rosemberg(k,ros[i][j-1],ros[i-1][j-1]);                      
                        }
                    }
                k++;
            }
        }

        
        
    return ros;   
    }
    
}
