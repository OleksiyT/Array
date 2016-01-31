package array.realization;

import array.utility.Localization;

/**
 * Generating Snake.
 */
public class Snake {

    private int [][] array;
    private String snakeArray = "";

    public String getSnakeArray(){return snakeArray;}

    public Snake(int[][] array){this.array = array;}

    public void generateSnakeArray(){
        boolean direction = false;
        for (int a=array.length-1; a>-1; a--) {
            if (direction == false) {
                for (int b = array[0].length-1; b > -1; b--)
                    snakeArray = snakeArray + Localization.SPACE + Integer.toString(array[a][b]);
            }
            if (direction == true) {
                for (int b = 0; b < array[0].length; b++)
                    snakeArray = snakeArray + Localization.SPACE + Integer.toString(array[a][b]);
            }
            direction = !direction;
    }
    }
}
