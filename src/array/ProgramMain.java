package array;

import array.realization.Snake;
import array.realization.Spiral;
import array.realization.Square;
import array.utility.*;

/**
 * Main
 */
public class ProgramMain {
    public static void main (String[] args)
    {
        Menu input = new Menu();
        input.getSize();

        Generate intarray = new Generate(input.getArraySize());
        intarray.generateArray();

        Square squareArray = new Square(intarray.getArray());
        squareArray.generateSquareArray();

        Snake snakeArray = new Snake(intarray.getArray());
        snakeArray.generateSnakeArray();

        Spiral spiralArray = new Spiral(intarray.getArray());
        spiralArray.generateSpiralArray();

        PrintAndPrepare console = new PrintAndPrepare();
        console.print(squareArray.getSquareArray(), snakeArray.getSnakeArray(),spiralArray.getSpiralArray());

        SaveToFile.write(Localization.PATH + Localization.FILENAME + Localization.EXTENSION, console.prepare(squareArray.getSquareArray(), snakeArray.getSnakeArray(),spiralArray.getSpiralArray()));

        input.done();
    }
}
