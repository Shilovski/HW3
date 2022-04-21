package сhess;

import java.util.ArrayList;

public class Knight extends ChessPiece {

    public Knight(String color) {
        if (countKnight % 2 == 1) {
            if (color.equalsIgnoreCase("BLACK")) {
                column = 1;
                row = 7;
            } else if (color.equalsIgnoreCase("WHITE")) {
                column = 1;
                row = 0;
            }
        }
        if (countKnight % 2 == 0) {
            if (color.equalsIgnoreCase("BLACK")) {
                column = 6;
                row = 7;
            } else if (color.equalsIgnoreCase("WHITE")) {
                column = 6;
                row = 0;
            }
        }
        this.color = color;
        countKnight++;
    }

    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> possibleFields = new ArrayList<>();
        return possibleFields;
    }
}
