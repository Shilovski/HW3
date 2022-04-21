package сhess;

import сhess.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        King king = new King("BLACK");
        king.setPosition("h5");
        System.out.println(king.toStringInCoordinate());
        System.out.println(king.canMoveTo());

        Queen queen = new Queen("BLACK");
        queen.setPosition("a7");
        System.out.println(queen.toStringInCoordinate());
        System.out.println(queen.canMoveTo());

        Rook rook = new Rook("White");
        rook.setPosition("a1");
        System.out.println(rook.toStringInCoordinate());
        System.out.println(rook.canMoveTo());
    }
}
