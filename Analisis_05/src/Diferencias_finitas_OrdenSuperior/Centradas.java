package Diferencias_finitas_OrdenSuperior;

import clases.Funcion;

/**
 * @author kevin Figueroa
 */
public class Centradas {
    
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
        double derivada = (fun.eval(x + h) - fun.eval(x - h)) / 2 * h;
        return derivada;
    }
    
    public double segunda_Dif() {
        Funcion fun = new Funcion(f);
        double derivada = (-fun.eval(x + 2 * h) + 8 * (fun.eval(x + h)) - 8 * (fun.eval(x - h)) + fun.eval(x - 2 * h)) / 12 * h;
        return derivada;
    }
    
    public double primera_Dif_Orden2() {
        Funcion fun = new Funcion(f);
        double segunda_derivada = (fun.eval(x + h) - 2 * (fun.eval(x)) + fun.eval(x - h)) / Math.pow(h, 2);
        return segunda_derivada;
    }
    
    public double segunda_Dif_Orden2() {
        Funcion fun = new Funcion(f);
        double segunda_derivada = (-fun.eval(x + 2 * h) + 16 * (fun.eval(x + h)) - 30 * (fun.eval(x)) + 16 * (fun.eval(x - h)) - fun.eval(x - 2 * h)) / 12 * (Math.pow(h, 2));
        return segunda_derivada;
    }
    
    public double primera_Dif_Orden3() {
        Funcion fun = new Funcion(f);
        double tercera_derivada = (fun.eval(x + 2 * h) - 2 * (fun.eval(x + h)) + 2 * (fun.eval(x - h)) - fun.eval(x - 2 * h)) / 2 * (Math.pow(h, 3));
        return tercera_derivada;
    }
    
    public double segunda_Dif_Orden3() {
        Funcion fun = new Funcion(f);
        double tercera_derivada = (-fun.eval(x + 3 * h) + 8 * (fun.eval(x + 2 * h)) - 12 * (fun.eval(x + h)) + 12 * (fun.eval(x - h)) - 8 * (fun.eval(x - 2 * h)) + fun.eval(x - 3 * h)) / 8 * (Math.pow(h, 3));
        return tercera_derivada;
    }
    
    public double primera_Dif_Orden4() {
        Funcion fun = new Funcion(f);
        double cuarta_derivada = (fun.eval(x + 2 * h) - 4 * (fun.eval(x + h)) + 6 * (fun.eval(x)) - 4 * (fun.eval(x - h)) + fun.eval(x - 2 * h)) / Math.pow(h, 4);
        return cuarta_derivada;
    }    
    
    public double segunda_Dif_Orden4() {
        Funcion fun = new Funcion(f);
        double cuarta_derivada = (-fun.eval(x + 3 * h) + 12 * (fun.eval(x + 2 * h)) - 39 * (fun.eval(x + h)) + 56 * (fun.eval(x)) - 39 * (fun.eval(x - h)) + 12 * (fun.eval(x - 2 * h)) - fun.eval(x - 3 * h)) / 6 * (Math.pow(h, 4));
        return cuarta_derivada;
    }
    
}
