package model;

import java.util.Scanner;

public class ChessPlayer {

    String nombre;
    String color;
    String jugada;
    String jugadas[] = new String[100];

    Scanner sc = new Scanner(System.in);

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getJugadas() {
        return jugadas;
    }

    public void setJugadas(String[] jugadas) {
        this.jugadas = jugadas;
    }

    public ChessPlayer(String color) {

        // Ciclo para ingresar nombre jugador 1
        while (true) {

            System.out.println("---------------------------------------------");
            System.out.print("Nombre jugador: ");
            this.nombre = sc.nextLine().toUpperCase();
            if (this.nombre.length() > 0) {

                break;
            } else {

                System.out.println("---------------------------------------------");
                System.out.println("     << Recuerde ingresar un nombre >>");
            }
        }

        this.color = color.toUpperCase();
        System.out.println("---------------------------------------------");
        System.out.println("Jugador: " + getName());
        System.out.println("Color: " + getColor());
        System.out.println("---------------------------------------------");
        System.out.println("            << Jugador creado >>>");
    }

    public String makeMovement() {

        System.out.println("---------------------------------------------");
        System.out.println("      << Ejemplo de jugadas válidas >>");
        System.out.println("---------------------------------------------");
        System.out.println("          E2E3 / E5D5 / E4F5 / B3C5");

        while (true) {

            System.out.println("---------------------------------------------");
            System.out.print("Ingrese jugada(CACS): ");
            jugada = sc.nextLine().toUpperCase();
            if (jugada.length() == 4) {

                System.out.println("---------------------------------------------");
                System.out.println("            << Jugada aprobada >>");
                break;
            } else {

                System.out.println("---------------------------------------------");
                System.out.println("            << Jugada errónea >>");
            }
        }
        
        return jugada;
    }
}
