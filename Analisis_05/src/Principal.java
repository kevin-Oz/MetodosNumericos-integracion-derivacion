import derivacion_numerica.Hacia_Adelante;
import derivacion_numerica.Richardson;
import derivacion_numerica.Centradas;
import derivacion_numerica.Form_35_puntos;
import integracion_numerica.Regla_del_Trapecio;
import integracion_numerica.Simpson_UnTercio;
import integracion_numerica.Simpson_TresOctavos;
/**
 *
 * @author kevin Figueroa
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String f="(x)*(e^x)";
        double a=0;
        double b=2;
        int n=5;
        // recive como parametros el valor de -> x -> h -> funcion
    
//        Hacia_Adelante nueva = new Hacia_Adelante(5.7,0.1,"(2*x)*cos(x)");
//        System.out.println(""+nueva.segunda_Dif_Orden2()+"\n");
//        
//        
//Richardson rick = new Richardson(2,0.8,"x^(0.5)");
//System.out.println(""+rick.Dh_OrdenUno());
//        
//        Form_35_puntos tp= new Form_35_puntos(4.2, 0.1,"ln(x)*tan(x)");
//        System.out.println(""+tp.cinco_puntos_SD());
        
//     Regla_del_Trapecio rt  = new Regla_del_Trapecio("(e^x)*cos(x)", 0, 1.2);
//     //**** SI ELIGE COMPUESTO DEBE AGRGAR EL VALOR DE """N"" CON EL SETTER -->
//     
//     rt.setN(6);
//        System.out.println(""+rt.compuesto(rt.relleno(rt.asche()),rt.asche()));
//        

//        Simpson_UnTercio Smps= new Simpson_UnTercio("x^(0.5)",1,1.3);
//        Smps.setN(3);
//        System.out.println(""+Smps.simpson_compuesto(Smps.asche_compuesta(), Smps.sumatoria_uno(Smps.asche_compuesta()),Smps.sumatoria_dos(Smps.asche_compuesta())));

        Simpson_TresOctavos s38= new Simpson_TresOctavos(f, a, b);
        s38.setN(n);
        System.out.println(""+s38.simpson_compuesto(s38.asche_compuesta(),s38.sumatoria_uno(s38.asche_compuesta()),
        s38.sumatoria_dos(s38.asche_compuesta()),s38.sumatoria_tres(s38.asche_compuesta())));
        
        
//        Centradas cc= new Centradas(2,0.8,"(x)^(0.5)");
//        System.out.println(""+cc.segunda_Dif());
    
    }
    
}
