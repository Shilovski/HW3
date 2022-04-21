package сhess;

import java.util.ArrayList;

public class Queen extends ChessPiece {

    public Queen(String color) {
        if (color.equalsIgnoreCase("BLACK")) {
            column = 2;
            row = 7;
        }
        else if (color.equalsIgnoreCase("WHITE")) {
            column = 2;
            row = 0;
        }
        this.color = color;
    }

    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> str = new ArrayList<>();
        str.addAll(canMoveToDownLeft());
        str.addAll(canMoveToDownRight());
        str.addAll(canMoveToUpRight());
        str.addAll(canMoveToUpLeft());
        str.addAll(canMoveRows());
        str.addAll(canMoveColumns());
        str.addAll(canMoveRows());
        return str;
//        for (int i = this.column; Math.abs(i) < 8; i++, i--) {
//            for (int j = this.row; Math.abs(j) < 8; j++) {
//                if  (((i < 8) && (i >= 0) && (j <= 8) && (j > 0)) && ((i != this.column) || (j != this.row + 1))) {
//                    String str = "";
//                    possibleFields.add(str + columnArray[i] + j);
//                }
//            }
//        }
    }
}
