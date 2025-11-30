package main;

import java.util.Scanner;
import model.ChessBoard;
import model.ChessPieces;
import model.ChessPlayer;
import service.ChessPlotter;
import service.Menu;
import validator.MovementValidator;

public class ConsoleChess {

    public static void main(String[] args) {

        String option;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("---------------------------------------------");
            System.out.println("         C O N S O L E   C H E S S");
            System.out.println("---------------------------------------------");
            System.out.println("0. Salir");
            System.out.println("1. Jugar");
            System.out.println("2. Ver registro de jugadas");
            System.out.println("3. Ver documentación");
            System.out.println("---------------------------------------------");
            System.out.print("Ingrese opción: ");
            option = sc.nextLine();

            switch (option) {
                case "0" -> {

                    System.out.println("---------------------------------------------");
                    System.out.println("           H A S T A   P R O N T O");
                    System.out.println("---------------------------------------------");
                    break;
                }
                case "1" -> {

                    // Instanciamiento de componentes clave de ajedréz
                    ChessPlayer playerWhite = new ChessPlayer("Blancas");
                    ChessPlayer playerBlack = new ChessPlayer("Negras");
                    ChessPieces whiteAndBlack = new ChessPieces();
                    ChessBoard board = new ChessBoard(whiteAndBlack.getWhitePieces(), whiteAndBlack.getBlackPieces());
                    MovementValidator validator = new MovementValidator();
                    ChessPlotter plotter = new ChessPlotter(board);
                    while (true) {

                        int[] optionWhite = validator.movementValidator(board, playerWhite.makeMovement());
                        
                        if (optionWhite != null) {

                            System.out.println("---------------------------------------------");
                            System.out.println("            << Jugada aprobada >>");
                            plotter.plotter(board, validator.getBackString());
                        } else {

                            System.out.println("---------------------------------------------");
                            System.out.println("            << Jugada errónea >>");
                        }
                        
                        int[] optionBlack = validator.movementValidator(board, playerBlack.makeMovement());
                        
                        if (optionBlack != null) {

                            System.out.println("---------------------------------------------");
                            System.out.println("            << Jugada aprobada >>");
                            plotter.plotter(board, validator.getBackString());
                        } else {

                            System.out.println("---------------------------------------------");
                            System.out.println("            << Jugada errónea >>");
                        }
                    }
                }
                case "2" -> {

                    break;
                }
                case "3" -> {

                    Menu information = new Menu();
                    information.documentation();
                    break;
                }
                case "4" -> {

                    System.out.println("---------------------------------------------");
                    System.out.println("       << CREATED BY DANIEL MORALES >>");
                    break;
                }
                default -> {

                    System.out.println("---------------------------------------------");
                    System.out.println("        O P C I Ó N   I N V Á L I D A");
                    break;
                }
            }
        } while (!option.equals("0"));
    }
}
