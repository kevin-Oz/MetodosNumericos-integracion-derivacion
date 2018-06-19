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
    
    public  Funcion fun;
    
    public Hacia_Adelante(double x, double h, String f) {
        this.fun = new Funcion(f);
        this.x = x;
        this.h = h;
        this.f = f;
    }

    public double primera_Dif() {
   
        double derivada = (fun.eval(x + h) - fun.eval(x)) / h;
        return derivada;
    }

    public double segunda_Dif() {
        double derivada = (-fun.eval(x + 2 * h) + 4 * (fun.eval(x + h)) - 3 * (fun.eval(x))) / (2 * h);
        return derivada;
    }

    public double primera_Dif_Orden2() {
        double segunda_Derivada = (fun.eval(x + 2 * h) - 2 * (fun.eval(x + h)) + fun.eval(x)) / Math.pow(h, 2);
        return segunda_Derivada;
    }

    public double segunda_Dif_Orden2() {
        double segunda_Derivada = (-fun.eval(x + 3 * h) + 4 * (fun.eval(x + 2 * h)) - 5 * (fun.eval(x + h)) + 2 * (fun.eval(x))) / Math.pow(h, 2);
        return segunda_Derivada;
    }

    public double primera_Dif_Orden3() {
        double tercera_Derivada = (fun.eval(x + 3 * h) - 3 * (fun.eval(x + 2 * h)) + 3 * (fun.eval(x + h) - fun.eval(x))) / Math.pow(h, 3);
        return tercera_Derivada;
    }

    public double segunda_Dif_Orden3() {
        double tercera_Derivada = (-3 * (fun.eval(x + 4 * h)) + 14 * (fun.eval(x + 3 * h)) - 24 * (fun.eval(x + 2 * h)) + 18 * (fun.eval(x + h)) - 5 * (fun.eval(x))) / Math.pow(h, 3);
        return tercera_Derivada;
    }

    public double primera_Dif_Orden4() {
        double cuarta_Derivada = (fun.eval(x + 4 * h) - 4 * (fun.eval(x + 3 * h)) + 6 * (fun.eval(x + 2 * h)) - 4 * (fun.eval(x + h)) + fun.eval(x)) / Math.pow(h, 4);
        return cuarta_Derivada;
    }

    public double segunda_Dif_Orden4() {
        double cuarta_Derivada = (-2 * (fun.eval(x + 5 * h)) + 11 * (fun.eval(x + 4 * h)) - 24 * (fun.eval(x + 3 * h)) + 26 * (fun.eval(x + 2 * h)) - 14 * (fun.eval(x + h)) + 3 * (fun.eval(x))) / Math.pow(h, 4);
        return cuarta_Derivada;
    }

}
