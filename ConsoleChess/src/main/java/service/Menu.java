package service;

import java.util.Scanner;

public class Menu {

    String option;

    Scanner sc = new Scanner(System.in);

    public void documentation() {

        do {

            System.out.println("---------------------------------------------------------");
            System.out.println("0. Salir                            2. Piezas");
            System.out.println("1. Jugadas                          3. Repositorio GITHUB");
            System.out.println("---------------------------------------------------------");
            option = sc.nextLine();
            
            switch (option) {
                case "0" -> {
                    
                    System.out.println("---------------------------------------------------------");
                    System.out.println("   <<-------------   <<-------------  <<-------------");
                    break;
                }
                case "1" -> {
                    
                    break;
                }
                case "2" -> {
                    
                    System.out.println("---------------------------------------------------------");
                    System.out.println("Peón    =   P[#]");
                    System.out.println("Torre   =   T[I - D]");
                    System.out.println("Caballo =   C[I - D]");
                    System.out.println("Alfíl   =   A[I - D]");
                    System.out.println("Reina   =   Q[I - D]");
                    System.out.println("Rey     =   R[I - D]");
                    break;
                }
                case "3" -> {
                    
                    System.out.println("---------------------------------------------------------");
                    System.out.println("https://github.com/danemoto9612");
                    break;
                }
                default -> {
                    
                    break;
                }
            }
        } while (!option.equals("0"));
    }

}
