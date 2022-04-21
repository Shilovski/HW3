package сhess;

import java.util.ArrayList;

public class Bishop extends ChessPiece {

    public Bishop(String color) {
        if  (countBishops % 2 == 1) {
            if (color.equalsIgnoreCase("BLACK")) {
                column = 5;
                row = 7;
            } else if (color.equalsIgnoreCase("WHITE")) {
                column = 5;
                row = 0;
            }
        }
        if  (countBishops % 2 == 0) {
            if (color.equalsIgnoreCase("BLACK")) {
                column = 2;
                row = 7;
            } else if (color.equalsIgnoreCase("WHITE")) {
                column = 2;
                row = 0;
            }
        }
        this.color = color;
        countBishops++;
    }

    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> str = new ArrayList<>();
        str.addAll(canMoveToDownLeft());
        str.addAll(canMoveToDownRight());
        str.addAll(canMoveToUpRight());
        str.addAll(canMoveToUpLeft());
        return str;
    }
}
