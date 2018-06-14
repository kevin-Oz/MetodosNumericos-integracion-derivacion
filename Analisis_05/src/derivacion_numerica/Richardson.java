/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derivacion_numerica;

/**
 *
 * @author kevin Figueroa
 *
 * aproximacion de richardson para derivadas de orden 1 ----> falta algo nose xd no me gusta como quedo :V
 */
public class Richardson {

    private final double x;
    private final double h;
    private final String f;

    public Richardson(double x, double h, String f) {
        this.x = x;
        this.h = h;
        this.f = f;
    }

    //calculo de h hasta nivel 3 
    public double[] Dh_OrdenUno() {
        double[] aches = new double[3];
        aches[0] = h;
        for (int i = 1; i < 3; i++) {
            aches[i] = h / (i * 2);
            System.out.println("" + aches[i]);
        }
        System.out.println("\n");
        double valores[] = new double[aches.length];

        for (int i = 0; i < aches.length; i++) {
            Centradas dh = new Centradas(x, aches[i], f);
            valores[i] = dh.segunda_Dif();         // define el orden que desea-------> 

        }
        for (int i = 0; i < aches.length; i++) {
            System.out.println("" + valores[i]);
        }

        double nivel_uno[] = new double[valores.length - 1];
        double nivel_dos;

        for (int i = 1; i <= nivel_uno.length; i++) {
            nivel_uno[i - 1] = ((1.33333333333) * (valores[i]) - (0.33333333) * (valores[i - 1]));

        }
        System.out.println("\n");
        for (int i = 0; i < nivel_uno.length; i++) {
            System.out.println("" + nivel_uno[i]);
        }
        System.out.println("");

        nivel_dos = ((1.3333333) * (nivel_uno[1]) - (0.33333333) * (nivel_uno[0]));

        System.out.println("" + nivel_dos);

        return null;

    }

}
