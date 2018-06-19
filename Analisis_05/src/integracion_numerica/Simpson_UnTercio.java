package integracion_numerica;

import clases.Funcion;

/**
 *
 * @author kevin Figueroa
 */
public class Simpson_UnTercio {

    private final String f;
    private final double a;
    private final double b;
    private double n;
 public Funcion fun;
 
    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public Simpson_UnTercio(String f, double a, double b) {
        this.fun = new Funcion(f);
        this.f = f;
        this.a = a;
        this.b = b;
    }
    
    public double asche() {
        double h = (b - a) / (2 * n); 
        return h;
    }

    public double sumatoria_uno(double h) {
        double sum_ = 0;
        for (int k = 1; k <= (n - 1); k++) {
            double temp=(2*k)*h;
            sum_ = sum_ + fun.eval(a +temp);
        }
        return sum_;
    }

    public double sumatoria_dos(double h) {
        double sum_ = 0;
        for (int k = 1; k <= n; k++) {
            double temp = ((2 * k) - 1)*h;
            sum_ = sum_+ fun.eval(a + temp);
        }
       
        return sum_;
    }

    public double simpson_simple(double h) {
        double integral = (h / 3) * (fun.eval(a) + 4 * (fun.eval(a + h)) + fun.eval(b));
        return integral;
    }

    public double simpson_compuesto(double h, double sumatoria_uno, double sumatoria_dos) {
        double integral = (((h / 3) * (fun.eval(a) + fun.eval(b))) + (((2 * h) / 3) * (sumatoria_uno)) + (((4 * h) / 3) * (sumatoria_dos)));
        return integral;
    }

}
