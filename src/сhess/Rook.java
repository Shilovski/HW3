package сhess;

import java.util.ArrayList;

public class Rook extends ChessPiece {

    public Rook(String color) {
        if (countRook % 2 == 1) {
            if (color.equalsIgnoreCase("BLACK")) {
                column = 0;
                row = 7;
            } else if (color.equalsIgnoreCase("WHITE")) {
                column = 0;
                row = 0;
            }
        }
        if (countRook % 2 == 0) {
            if (color.equalsIgnoreCase("BLACK")) {
                column = 7;
                row = 7;
            } else if (color.equalsIgnoreCase("WHITE")) {
                column = 7;
                row = 0;
            }
        }
        this.color = color;
        countRook++;
    }

    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> str = new ArrayList<>();
        str.addAll(canMoveColumns());
        str.addAll(canMoveRows());
        return str;
    }
}
