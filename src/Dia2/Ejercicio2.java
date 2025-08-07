package Dia2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int[] miArray = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un número:");
            miArray[i] = sc.nextInt();
        }

        int max = miArray[0];
        int min = miArray[0];

        for (int i = 1; i < 5; i++) {
            if (miArray[i] > max) max = miArray[i];
            if (miArray[i] < min) min = miArray[i];
        }

        System.out.println("Los números ingresados son:");
        for (int i = 0; i < 5; i++) {
            System.out.println(miArray[i]);
        }

        System.out.println("Número máximo es: " + max);
        System.out.println("Número mínimo es: " + min);

        sc.close();
    }
}
