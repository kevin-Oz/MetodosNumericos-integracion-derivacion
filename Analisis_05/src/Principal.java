
import derivacion_numerica.Hacia_Adelante;
import derivacion_numerica.Richardson;
import derivacion_numerica.Centradas;
import derivacion_numerica.Form_35_puntos;
import integracion_numerica.Regla_del_Trapecio;
import integracion_numerica.Rosemberg;
import integracion_numerica.Simpson_UnTercio;
import integracion_numerica.Simpson_TresOctavos;
import pricipalPKG.Portada;

/**
 *
 * @author kevin Figueroa
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Portada prl = new Portada();
        prl.show();
        String f = "(sin(x)*(1/x))";
        double a = -1;
        double b = 1;
        int n = 1;

        // recive como parametros el valor de -> x -> h -> funcion
//        Hacia_Adelante nueva = new Hacia_Adelante(5.7,0.1,"(2*x)*cos(x)");
//        System.out.println(""+nueva.segunda_Dif_Orden2()+"\n");
//        
//        
//Richardson rick = new Richardson(2,0.8,"x^(0.5)");
//
//  for (int i = 0; i < rick.Dh_OrdenUno().length; i++) {
//            for (int j = 0; j <rick.Dh_OrdenUno().length+1; j++) {
//                if (rick.Dh_OrdenUno()[i][j]!=0.0) {
//                   System.out.print(""+rick.Dh_OrdenUno()[i][j]+"  ");
//                }
//            }
//            System.out.println("");
//        }


//        
//        Form_35_puntos tp= new Form_35_puntos(4.2, 0.1,"ln(x)*tan(x)");
//        System.out.println(""+tp.cinco_puntos_SD());
//     Regla_del_Trapecio rt  = new Regla_del_Trapecio(f,a ,b);
//     //**** SI ELIGE COMPUESTO DEBE AGRGAR EL VALOR DE """N"" CON EL SETTER -->
//     
//     rt.setN(4);
//        System.out.println(""+rt.compuesto(rt.relleno(rt.asche()),rt.asche()));
//        
//        System.out.println("---------");
//        Simpson_UnTercio Smps= new Simpson_UnTercio(f,-1,1);
//        Smps.setN(n);
//        System.out.println(""+Smps.simpson_compuesto(Smps.asche(), Smps.sumatoria_uno(Smps.asche()),Smps.sumatoria_dos(Smps.asche())));
//        
//Simpson_TresOctavos s38= new Simpson_TresOctavos(f, a, b);
//        s38.setN(n);
//        System.out.println(""+s38.simpson_compuesto(s38.asche(),s38.sumatoria_uno(s38.asche()),
//        s38.sumatoria_dos(s38.asche()),s38.sumatoria_tres(s38.asche())));

//        Rosemberg ros = new Rosemberg(f, a, b);
//        ros.setNivel(n);
////          for (int i = 0; i <n+1; i++) {
////         System.out.println(""+ros.aches()[i]);   
////        }
//        for (int i = 0; i < n + 1; i++) {
//            for (int j = 0; j < n + 2; j++) {
//                if (ros.levels(ros.aches())[i][j]!=0.0) {
//                    System.out.print("" + ros.levels(ros.aches())[i][j] + "       ");
//                }
//            }
//            System.out.println("");
//        }

//        Centradas cc= new Centradas(2,0.8,"(x)^(0.5)");
//        System.out.println(""+cc.segunda_Dif());
    }

}
