/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo2;

/**
 *
 * @author fing.labcom
 */
public class Ejercicios {
    
        public static void main(String[] args) {
            //Ejercicio 3
        System.out.println("El numero 42 base 8 a base 10 es: "+basexABaseY(42, 8, 10)); // 
        //Ejercicio 4
        System.out.println("El numero 64 base 10 a base 2 es: "+basexABaseY(64, 10, 2)); // 
        //Ejercicio 5
        System.out.println("El numero 145 base 10 a base 2 es: "+basexABaseY(145, 10, 2)); // 
        //Ejercicio 6
        String hexNumber="C";
                int decimalNumber=Integer.parseInt(hexNumber, 16);
                System.out.println("La letra C en base 16 a base 10 es: "+decimalNumber );
        //Ejecicio 7
        String hex1Number="ABCD";
                int decimal1Number=Integer.parseInt(hex1Number, 16);
                System.out.println("La letra C en base 16 a base 10 es: "+decimal1Number );
        
        
        }
        public static int basexABaseY(long numero, int basex, int basey) {
    if (basex >= 2 && basex <= 10 && basey >= 2 && basey <= 10) {
        if (basex == 10 || basey == 10) {
            int decimal = 0;
            int digito;
            final long DIVISOR = basey;
            for (long i = numero, j = 0; i > 0; i /= DIVISOR, j++) {
                digito = (int) (i % DIVISOR);
                decimal += digito * Math.pow(basex, j);
            }
            return decimal;
        } else {
            // Lo paso a decimal
            int aDecimal = basexABaseY(numero, basex, 10);
            // Lo paso a la base deseada
            int numeroBaseY = basexABaseY(aDecimal, 10, basey);
            return numeroBaseY;
        }
    } else {
        return -1;
    }
}
        

}
