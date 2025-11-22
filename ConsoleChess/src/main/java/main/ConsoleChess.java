package main;

import model.ChessBoard;
import model.ChessPieces;
import model.ChessPlayer;
import validator.MovementValidator;

public class ConsoleChess {

    public static void main(String[] args) {
        
        ChessPlayer playerWhite = new ChessPlayer("Blancas");
        ChessPlayer playerBlack = new ChessPlayer("Negras");
        ChessPieces whiteAndBlack = new ChessPieces();
        ChessBoard board = new ChessBoard(whiteAndBlack.getWhitePieces(), whiteAndBlack.getBlackPieces());
        MovementValidator validator = new MovementValidator();
        validator.movementValidator(playerWhite.makeMovement());
        System.out.println(validator.getBackString());
    }
}
