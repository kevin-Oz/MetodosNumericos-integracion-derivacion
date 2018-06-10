package Diferencias_finitas_OrdenSuperior;

import clases.Funcion;
/**
 * @author kevin Figueroa
 */
public class Hacia_Atras {

    private double x;
    private double h;
    private String f;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public double primera_Dif() {
        Funcion fun = new Funcion(f);
        double derivada = (fun.eval(x) - fun.eval(x - h)) / h;
        return derivada;
    }

    public double segunda_Dif() {
        Funcion fun = new Funcion(f);
        double derivada = (3 * (fun.eval(x)) - 4 * (fun.eval(x - h)) + fun.eval(x - 2 * h)) / (2 * h);
        return derivada;
    }

    public double primera_Dif_Orden2() {
        Funcion fun = new Funcion(f);
        double segunda_derivada = (fun.eval(x) - 2 * (fun.eval(x - h)) + fun.eval(x - 2 * h)) / Math.pow(h, 2);
        return segunda_derivada;
    }

    public double segunda_Dif_Orden2() {
        Funcion fun = new Funcion(f);
        double tercera_derivada = (2 * (fun.eval(x)) - 5 * (fun.eval(x - h)) + 4 * (fun.eval(x - 2 * h)) - fun.eval(x - 3 * h)) / Math.pow(h, 2);
        return tercera_derivada;
    }

    public double primera_Dif_Orden3() {
        Funcion fun = new Funcion(f);
        double tercera_derivada = (fun.eval(x) - 3 * (fun.eval(x - h)) + 3 * (fun.eval(x - 2 * h)) - fun.eval(x - 4 * h)) / Math.pow(h, 3);
        return tercera_derivada;
    }

    public double segunda_Dif_Orden3() {
        Funcion fun = new Funcion(f);
        double tercera_derivada = (5 * (fun.eval(x)) - 18 * (fun.eval(x - h)) + 24 * (fun.eval(x - 2 * h)) - 14 * (fun.eval(x - 3 * h)) + 3 * (fun.eval(x - 4 * h))) / Math.pow(h, 3);
        return tercera_derivada;

    }

    public double primera_Dif_Orden4() {
        Funcion fun = new Funcion(f);
        double cuarta_derivada = (fun.eval(x) - 4 * (fun.eval(x - h)) + 6 * (fun.eval(x - 2 * h)) - 4 * (fun.eval(x - 3 * h)) + fun.eval(x - 4 * h)) / Math.pow(h, 4);
        return cuarta_derivada;

    }

    public double segunda_Dif_Orden4() {
        Funcion fun = new Funcion(f);
        double cuarta_derivada = (3 * (fun.eval(x)) - 14 * (fun.eval(x - h)) + 26 * (fun.eval(x - 2 * h)) - 24 * (fun.eval(x - 3 * h)) + 11 * (fun.eval(x - 4 * h)) - 2 * (fun.eval(x - 5 * h))) / Math.pow(h, 4);
        return cuarta_derivada;
    }

}
