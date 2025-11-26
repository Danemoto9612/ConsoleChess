package service;

import model.ChessBoard;

public class ChessPlotter {
    
    public ChessPlotter(ChessBoard board) {

        System.out.println("---------------------------------------------");
        System.out.println("            << Tablero Inicial >>");
        System.out.println("---------------------------------------------");

        System.out.println("     A   B   C   D   E   F   G   H");
        System.out.println("     --  --  --  --  --  --  --  --");

        for (int letras = 0; letras < 8; letras++) {

            System.out.print(letras + " | ");

            for (int numeros = 0; numeros < 8; numeros++) {

                System.out.print(board.getBoard()[letras][numeros]);
            }
            
            System.out.println(" | " + letras);
            System.out.println();
        }

        System.out.println("     --  --  --  --  --  --  --  --");
        System.out.println("     A   B   C   D   E   F   G   H");
    }

    public void plotter(ChessBoard board, int[] movement) {
        
        board.setBoard(movement[1], movement[0], movement[3], movement[2]);
        
        System.out.println("---------------------------------------------");
        
        System.out.println("     A   B   C   D   E   F   G   H");
        System.out.println("     --  --  --  --  --  --  --  --");

        for (int letras = 0; letras < 8; letras++) {

            System.out.print(letras + " | ");
            
            for (int numeros = 0; numeros < 8; numeros++) {

                System.out.print(board.getBoard()[letras][numeros]);
            }
            
            System.out.println(" | " + letras);
            System.out.println();
        }

        System.out.println("     --  --  --  --  --  --  --  --");
        System.out.println("     A   B   C   D   E   F   G   H");
    }
}