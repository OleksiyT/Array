package array.utility;

/**
 * Printing results to console.
 */
public class PrintAndPrepare {
    public void print(String square, String snake, String spiral) {
        System.out.print(Localization.SQUARE + square);
        System.out.print(Localization.SNAKE + snake + "\n");
        System.out.print(Localization.SPIRAL + spiral + "\n");
    }
    public String prepare(String square, String snake, String spiral)
    {
        String string = "";
        string = string + Localization.SQUARE + square;
        string = string + Localization.SNAKE + snake + "\n";
        string = string + Localization.SPIRAL + spiral + "\n";
        return string;
    }
}
