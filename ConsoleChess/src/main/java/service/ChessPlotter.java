package service;

public class ChessPlotter {

    public ChessPlotter(String[][] board) {

        System.out.println("---------------------------------------------");
        System.out.println("            << Tablero Inicial >>");
        System.out.println("---------------------------------------------");
        System.out.println("     0   1   2   3   4   5   6   7");
        System.out.println("     --  --  --  --  --  --  --  --");
        for (int letras = 0; letras < 8; letras++) {

            System.out.print(letras + " | ");
            
            for (int numeros = 0; numeros < 8; numeros++) {

                System.out.print(board[letras][numeros]);
            }
            System.out.println(" | " + letras);
            System.out.println();
        }
        
        System.out.println("     --  --  --  --  --  --  --  --");
        System.out.println("     0   1   2   3   4   5   6   7");
    }

    public void plotter(String[][] board, int[] movement) {

        board[movement[2]][movement[3]] = board[movement[0]][movement[1]];
        board[movement[0]][movement[1]] = " XX ";
        
        for (int letras = 0; letras < 8; letras++) {

            for (int numeros = 0; numeros < 8; numeros++) {

                System.out.print(board[letras][numeros]);
            }
            System.out.println();
        }
    }
}
