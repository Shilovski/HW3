package сhess;

import java.util.ArrayList;

public class Pawn extends ChessPiece {

    public Pawn(String color) {
        for (int i = 0; i < 8; i++) {
            if (color.equalsIgnoreCase("BLACK")) {
                column = i;
                row = 7;
            } else if (color.equalsIgnoreCase("WHITE")) {
                column = i;
                row = 0;
            }
        }
        countPawn++;
    }

    @Override
    public ArrayList<String> canMoveTo() {
        return null;
    }
}
