package clases;

import org.lsmp.djep.xjep.XJep;
import org.nfunk.jep.JEP;

/**
 *
 * @author kevin Figueroa
 * clase para transformar y evaluar valores en diferentes funciones
 */
public class Funcion {

    JEP hi = new JEP();
     XJep xj = new XJep();

    public Funcion(String funci) {
        hi.addVariable("x", 0);
        hi.addStandardConstants();
        hi.addStandardFunctions();
        hi.parseExpression(funci);
        hi.addComplex();
        xj.setAllowUndeclared(true);
        xj.setImplicitMul(true);
        hi.setImplicitMul(true);
        if (hi.hasError()) {
            System.out.println(hi.getErrorInfo());
        }
    }
/**
 *
 * @param x el numero a evaluar...
 * @return  el valor "x" evaluado en la funcion
 */
    public double eval(double x) {
        double evaluador;

        hi.addVariable("x", x);
        evaluador = hi.getValue();
        if (hi.hasError()) {
            System.out.println(hi.getErrorInfo());
        }

        return evaluador;

    }

   
 
}
