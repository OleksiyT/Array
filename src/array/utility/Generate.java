package array.utility;

/**
 * Generating array.
 */
public class Generate {

    private int arraysize;
    private int array[][];

    public int[][] getArray(){return array;}

public Generate (int arraysize) {this.arraysize = arraysize;}

public void generateArray ()
{
    array = new int[arraysize][arraysize];
    for (int a =0; a<arraysize; a++)
    {
        for (int b=0; b<arraysize; b++)
            array[a][b] = (int)(Math.random()*201)-100;
    }
}
}

