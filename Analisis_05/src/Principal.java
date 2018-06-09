import Diferencias_finitas_OrdenSuperior.Hacia_Adelante;
/**
 *
 * @author kevin Figueroa
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Hacia_Adelante nueva = new Hacia_Adelante();
        nueva.setF("ln(x)");
        nueva.setH(0.1);
        nueva.setX(5);
        
        System.out.println(""+nueva.primera_Dif());
        
    }
    
}
