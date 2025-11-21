package model;

public class ChessPieces {

    String whitePieces[] = {" TI ", " CI ", " AI ", " QN ", " KN ", " AD ", " CD ", " TD ",
        " P1 ", " P2 ", " P3 ", " P4 ", " P5 ", " P6 ", " P7 ", " P8 "};

    String blackPieces[] = {" TI ", " CI ", " AI ", " QN ", " KN ", " AD ", " CD ", " TD ",
        " P1 ", " P2 ", " P3 ", " P4 ", " P5 ", " P6 ", " P7 ", " P8 "};

    public String[] getWhitePieces() {
        return whitePieces;
    }

    public void setWhitePieces(String[] whitePieces) {
        this.whitePieces = whitePieces;
    }

    public String[] getBlackPieces() {
        return blackPieces;
    }

    public void setBlackPieces(String[] blackPieces) {
        this.blackPieces = blackPieces;
    }
}
