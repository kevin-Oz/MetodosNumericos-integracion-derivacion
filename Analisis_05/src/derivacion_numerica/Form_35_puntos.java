package derivacion_numerica;

import clases.Funcion;

/**
 * @author kevin Figueroa 
 * 
 * calculo de las formulas de 3 y 5 puntos .
 */
public class Form_35_puntos {

    private final double x;
    private final double h;
    private final String f;
    public   Funcion fun;

    public Form_35_puntos(double x, double h, String f) {
        this.fun= new Funcion(f);
        this.x = x;
        this.h = h;
        this.f = f;
    }

    /**
     *
     * @return el valor aproximado de la derivada.
     */
    public double tres_puntos() {
        double derivada = (1 / (2 * h)) * (-3 * (fun.eval(x)) + 4 * (fun.eval(x + h)) - fun.eval(x + 2 * h));
        return derivada;
    }

    public double cinco_puntos_PD() {
        double derivada = (1 / (12 * h)) * (-25 * (fun.eval(x)) + 48 * (fun.eval(x + h)) - 36 * (fun.eval(x + 2 * h)) + 16 * (fun.eval(x + 3 * h)) - 3 * (fun.eval(x + 4 * h)));
        return derivada;
    }

    public double cinco_puntos_SD() {
        double derivada = (1 / (12 * h)) * (fun.eval(x - 2 * h) - 8 * (fun.eval(x - h)) + 8 * (fun.eval(x + h)) - fun.eval(x + 2 * h));
        return derivada;
    }

}
