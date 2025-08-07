package Dia2;

import java.util.Scanner;
import java.util.HashMap;

public class Ejercicio4 {
    public static void main(String[] args) {

    HashMap <String, Integer> miTabla = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
        System.out.println("Introduce una persona y su edad");
        miTabla.put(sc.next(), sc.nextInt());

    }

System.out.println("Los mayores de edad son:");

    for (String key : miTabla.keySet()) {
        if (miTabla.get(key) >= 18){System.out.println(key);}
    }
        sc.close();
    }
}