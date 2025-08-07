package Dia2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad < 18) {
            System.out.println("Menor de edad");
        } else if (edad < 60) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Adulto mayor");
        }

        sc.close();
    }
}
