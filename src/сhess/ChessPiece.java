package сhess;

import java.util.ArrayList;

public abstract class ChessPiece {

    protected static int countBishops;
    protected static int countKnight;
    protected static int countRook;
    protected static int countPawn;
    protected static String[] columnArray = {"a", "b", "c", "d", "e", "f", "g", "h"};

    int column;
    int row;
    String color;

    public int getColumn() { return column; }

    public int getRow() {
        return row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setPosition(String coordinates) {
        int counter = 0;
        for (int i = 0; i < columnArray.length; i++) {
            if (coordinates.substring(0, 1).equalsIgnoreCase(columnArray[i]))
                setColumn(i);
            else
                counter++;
            if (counter == columnArray.length + 1)
                System.out.println("Invalid column entry");
        }
        setRow(Integer.parseInt(String.valueOf(coordinates.charAt(1))) - 1);
    }

    public abstract ArrayList<String> canMoveTo();

    @Override
    public String toString() {
        return "Position of the " + color.toLowerCase() + " " + this.getClass().getSimpleName()
                + ": " + "[" + column + ", " + row + "]";
    }

    public String toStringInCoordinate() {
        return "Position of the " + color.toLowerCase() + " " + this.getClass().getSimpleName()
                + ": " + columnArray[column] + (row + 1);
    }

    public ArrayList<String> canMoveToDownLeft() {
        ArrayList<String> possibleFields = new ArrayList<>();
        int i = this.column - 1;
        int j = this.row;
        while (true) {
            if (((i < 8) && (i >= 0) && (j <= 8) && (j > 0)) && ((i != this.column) || (j != this.row + 1))) {
                possibleFields.add(columnArray[i] + j);
                i--;
                j--;
            } else break;
        }
        return possibleFields;
    }

    public ArrayList<String> canMoveToUpLeft() {
        ArrayList<String> possibleFields = new ArrayList<>();
        int i = this.column - 1;
        int j = this.row + 2;
        while (true) {
            if (((i < 8) && (i >= 0) && (j <= 8) && (j > 0)) && ((i != this.column) || (j != this.row + 1))) {
                possibleFields.add(columnArray[i] + j);
                i--;
                j++;
            } else break;
        }
        return possibleFields;
    }

    public ArrayList<String> canMoveToUpRight() {
        ArrayList<String> possibleFields = new ArrayList<>();
        int i = this.column + 1;
        int j = this.row + 2;
        while (true) {
            if (((i < 8) && (i >= 0) && (j <= 8) && (j > 0)) && ((i != this.column) || (j != this.row + 1))) {
                possibleFields.add(columnArray[i] + j);
                i++;
                j++;
            } else break;
        }
        return possibleFields;
    }

    public ArrayList<String> canMoveToDownRight() {
        ArrayList<String> possibleFields = new ArrayList<>();
        int i = this.column + 1;
        int j = this.row;
        while (true) {
            if (((i < 8) && (i >= 0) && (j <= 8) && (j > 0)) && ((i != this.column) || (j != this.row + 1))) {
                possibleFields.add(columnArray[i] + j);
                i++;
                j--;
            } else break;
        }
        return possibleFields;
    }

    protected ArrayList<String> canMoveRows() {
        ArrayList<String> possibleFields = new ArrayList<>();
        for (int i = this.row; i > 0; i--)
            possibleFields.add(columnArray[this.column] + i);
        for (int j = this.row + 2; j <= 8; j++)
            possibleFields.add(columnArray[this.column] + j);

        return possibleFields;
    }

    protected ArrayList<String> canMoveColumns() {
        ArrayList<String> possibleFields = new ArrayList<>();
        for (int i = this.column - 1; i >= 0; i--)
            possibleFields.add(columnArray[i] + (this.row + 1));
        for (int j = this.column + 1; j < 8; j++)
            possibleFields.add(columnArray[j] + (this.row + 1));

        return possibleFields;
    }
}