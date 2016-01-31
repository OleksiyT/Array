package array.realization;

import array.utility.Localization;

/**
 * Generating Spiral.
 */
public class Spiral {

    private int iterations;
    private int[][] array;
    private String spiralArray = "";

    public String getSpiralArray() {
        return spiralArray;
    }

    public Spiral(int[][] array) {
        this.array = array;
    }

    public void generateSpiralArray() {
        iterations = (array.length + 1) / 2;
        for (int i = 0; i < iterations; i++) {
            int a = 0 + i;
            for (int b = 0 + i; b < array[a].length - i; b++)
                spiralArray = spiralArray + Localization.SPACE + Integer.toString(array[a][b]);

            for (int aa = 1 + i; aa < array.length - 1 - i; aa++) {
                int bb = array[aa].length - 1 - i;
                spiralArray = spiralArray + Localization.SPACE + Integer.toString(array[aa][bb]);
            }

            a = array.length - 1 - i;
            // условие-костыль, дабы при нечетных проходах последнее число-итерация(центральное) не дублировалось
            if(iterations%2!=1 && i!=iterations-1 ) {
                for (int b = array[a].length - 1 - i; b > -1 + i; b--)
                    spiralArray = spiralArray + Localization.SPACE + Integer.toString(array[a][b]);
            }

                for (int aa = array.length - 2 - i; aa > 0 + i; aa--) {
                    int bb = 0 + i;
                    spiralArray = spiralArray + Localization.SPACE + Integer.toString(array[aa][bb]);
                }

        }
    }
}
