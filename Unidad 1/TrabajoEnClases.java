/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.en.clases;

import java.math.*;

/**
 *
 * @author fing.labcom
 */
public class TrabajoEnClases {

    public static void main(String[] args) {
        double a = 0.50 * (10 ^ 2);
        double b = 0.51 * (10 ^ 2);
        double Ea=0,Er=0;

        Ea = Math.abs(b - a);
        Er = Ea/b;
        
        System.out.println("El error absolutoi es: "+ Ea);
        System.out.println("El error absoluto es: "+Er);

        

    }

//    public double CalcularErrorA(double valorAprox, double valorReal) {
//
//        double Ea = 0;
//        
//
//        return Ea;
//
//    }
//
//    public double CalcularErrorR(double valorReal, double Ea) {
//        double Er = 0;
//        Er = Ea / valorReal;
//
//        return Er;
//
//    }

}
