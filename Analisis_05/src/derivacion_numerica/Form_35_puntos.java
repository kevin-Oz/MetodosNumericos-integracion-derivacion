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
    private final String funcion;

    public Form_35_puntos(double x, double h, String funcion) {
        this.x = x;
        this.h = h;
        this.funcion = funcion;
    }

    /**
     *
     * @return el valor aproximado de la derivada.
     */
    public double tres_puntos() {
        Funcion fun = new Funcion(funcion);
        double derivada = (1 / (2 * h)) * (-3 * (fun.eval(x)) + 4 * (fun.eval(x + h)) - fun.eval(x + 2 * h));
        return derivada;
    }

    public double cinco_puntos_PD() {
        Funcion fun = new Funcion(funcion);
        double derivada = (1 / (12 * h)) * (-25 * (fun.eval(x)) + 48 * (fun.eval(x + h)) - 36 * (fun.eval(x + 2 * h)) + 16 * (fun.eval(x + 3 * h)) - 3 * (fun.eval(x + 4 * h)));
        return derivada;
    }

    public double cinco_puntos_SD() {
        Funcion fun = new Funcion(funcion);
        double derivada = (1 / (12 * h)) * (fun.eval(x - 2 * h) - 8 * (fun.eval(x - h)) + 8 * (fun.eval(x + h)) - fun.eval(x + 2 * h));
        return derivada;
    }

}
