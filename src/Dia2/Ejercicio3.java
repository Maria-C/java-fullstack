package Dia2;

import java.util.Scanner;
import java.util.HashMap;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> capitales = new HashMap<>();

        System.out.println("----- Carga de países y capitales -----");
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese un país: ");
            String pais = sc.nextLine().trim();

            System.out.print("Ingrese su capital: ");
            String capital = sc.nextLine().trim();

            // Guardar todo en minúsculas para búsqueda insensible a mayúsculas
            capitales.put(pais.toLowerCase(), capital);
        }

        System.out.println("\nLas capitales cargadas son:");
        for (String capital : capitales.values()) {
            System.out.println("- " + capital);
        }

        System.out.print("\nIngrese un país para buscar su capital: ");
        String paisBuscado = sc.nextLine().trim().toLowerCase();

        if (capitales.containsKey(paisBuscado)) {
            System.out.println("La capital de " + paisBuscado + " es " + capitales.get(paisBuscado));
        } else {
            System.out.println("País no encontrado");
        }

        sc.close();
    }
}
