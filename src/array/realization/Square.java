package array.realization;

import array.utility.Localization;

/**
 * Generating Square.
 */
public class Square {

    private int [][] array;
    private String squareArray = "";

    public String getSquareArray(){return squareArray;}

    public Square(int[][] array){this.array = array;}

    public void generateSquareArray(){
        for (int a=0; a<array.length; a++) {
            for (int b = 0; b < array[0].length; b++)
                squareArray = squareArray + Localization.SPACE + Integer.toString(array[a][b]);
            squareArray = squareArray+"\n";
        }
    }
}
