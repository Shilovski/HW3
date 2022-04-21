package сhess;

import java.util.ArrayList;

public class King extends ChessPiece {

    public King(String color) {
        if (color.equalsIgnoreCase("BLACK")) {
            column = 3;
            row = 7;
        }
        else if (color.equalsIgnoreCase("WHITE")) {
            column = 3;
            row = 0;
        }
        this.color = color;
    }

    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> possibleFields = new ArrayList<>();
        for (int i = this.column - 1; i < this.column + 2; i++)
            for (int j = this.row; j < this.row + 3; j++)
                if  (((i < 8) && (i >= 0) && (j <= 8) && (j > 0)) && ((i != this.column) || (j != this.row + 1)))
                    possibleFields.add(columnArray[i] + j);

        return possibleFields;
    }
}
