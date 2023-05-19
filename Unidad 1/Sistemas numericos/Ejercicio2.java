package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in);
//        System.out.print("Ingrese una cifra: ");
//        int cifra = leer.nextInt();
        double cifra1 = 27.025;
        
        System.out.print("\nbinario:\t");
        binario((int) cifra1);
        
    }

    public static void binario(int N) {
        if (N == 1) {
            System.out.print("1");
        } else {
            binario(N / 2);
            System.out.print(N % 2);
        }
    }

}