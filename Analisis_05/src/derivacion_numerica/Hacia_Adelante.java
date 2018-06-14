package derivacion_numerica;

import clases.Funcion;
/**
 * @author kevin Figueroa
 * Calculo de las diferencias finitas hacia adelante de orden 1 y superior
 */
public class Hacia_Adelante {
    
    

    private final double x;
    private final double h;
    private final String f;

    public Hacia_Adelante(double x, double h, String f) {
        this.x = x;
        this.h = h;
        this.f = f;
    }

    public double primera_Dif() {
        Funcion funci = new Funcion(f);
        double derivada = (funci.eval(x + h) - funci.eval(x)) / h;
        return derivada;
    }

    public double segunda_Dif() {
        Funcion funci = new Funcion(f);
        double derivada = (-funci.eval(x + 2 * h) + 4 * (funci.eval(x + h)) - 3 * (funci.eval(x))) / (2 * h);
        return derivada;
    }

    public double primera_Dif_Orden2() {
        Funcion funci = new Funcion(f);
        double segunda_Derivada = (funci.eval(x + 2 * h) - 2 * (funci.eval(x + h)) + funci.eval(x)) / Math.pow(h, 2);
        return segunda_Derivada;
    }

    public double segunda_Dif_Orden2() {
        Funcion funci = new Funcion(f);
        double segunda_Derivada = (-funci.eval(x + 3 * h) + 4 * (funci.eval(x + 2 * h)) - 5 * (funci.eval(x + h)) + 2 * (funci.eval(x))) / Math.pow(h, 2);
        return segunda_Derivada;
    }

    public double primera_Dif_Orden3() {
        Funcion funci = new Funcion(f);
        double tercera_Derivada = (funci.eval(x + 3 * h) - 3 * (funci.eval(x + 2 * h)) + 3 * (funci.eval(x + h) - funci.eval(x))) / Math.pow(h, 3);
        return tercera_Derivada;
    }

    public double segunda_Dif_Orden3() {
        Funcion funci = new Funcion(f);
        double tercera_Derivada = (-3 * (funci.eval(x + 4 * h)) + 14 * (funci.eval(x + 3 * h)) - 24 * (funci.eval(x + 2 * h)) + 18 * (funci.eval(x + h)) - 5 * (funci.eval(x))) / Math.pow(h, 3);
        return tercera_Derivada;
    }

    public double primera_Dif_Orden4() {
        Funcion funci = new Funcion(f);
        double cuarta_Derivada = (funci.eval(x + 4 * h) - 4 * (funci.eval(x + 3 * h)) + 6 * (funci.eval(x + 2 * h)) - 4 * (funci.eval(x + h)) + funci.eval(x)) / Math.pow(h, 4);
        return cuarta_Derivada;
    }

    public double segunda_Dif_Orden4() {
        Funcion funci = new Funcion(f);
        double cuarta_Derivada = (-2 * (funci.eval(x + 5 * h)) + 11 * (funci.eval(x + 4 * h)) - 24 * (funci.eval(x + 3 * h)) + 26 * (funci.eval(x + 2 * h)) - 14 * (funci.eval(x + h)) + 3 * (funci.eval(x))) / Math.pow(h, 4);
        return cuarta_Derivada;
    }

}
