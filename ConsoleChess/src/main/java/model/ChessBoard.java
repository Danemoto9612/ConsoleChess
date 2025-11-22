package model;

public class ChessBoard {

    private final String board[][] = new String[8][8];

    public ChessBoard(String[] white, String[] black) {

        // Organizar fichas blancas en tablero
        for (int fila = 0; fila < 3; fila++) {

            for (int columna = 0; columna < 8; columna++) {

                if (fila == 0) {

                    board[fila][columna] = white[columna];
                } else {

                    board[fila][columna] = white[columna + 8];
                }
            }
        }

        // Organizar fichas negras en tablero
        for (int fila = 7; fila > 5; fila--) {

            for (int columna = 0; columna < 8; columna++) {

                if (fila == 7) {

                    board[fila][columna] = black[columna];
                } else {

                    board[fila][columna] = black[columna + 8];
                }
            }
        }

        // Poner X en el resto del tablero
        for (int fila = 2; fila < 6; fila++) {

            for (int columna = 0; columna < 8; columna++) {

                board[fila][columna] = " XX ";
            }
        }
    }

    public String[][] getBoard() {
        return board;
    }
}
