package main;

import model.ChessBoard;
import model.ChessPieces;
import model.ChessPlayer;
import service.ChessPlotter;
import validator.MovementValidator;

public class ConsoleChess {

    public static void main(String[] args) {
        
        // Instanciamiento de componentes clave de ajedréz
        ChessPlayer playerWhite = new ChessPlayer("Blancas");
        ChessPlayer playerBlack = new ChessPlayer("Negras");
        ChessPieces whiteAndBlack = new ChessPieces();
        ChessBoard board = new ChessBoard(whiteAndBlack.getWhitePieces(), whiteAndBlack.getBlackPieces());
        MovementValidator validator = new MovementValidator();
        ChessPlotter plotter = new ChessPlotter(board);
        
        
        
        plotter.plotter(board, validator.movementValidator(playerWhite.makeMovement()));
    }
}