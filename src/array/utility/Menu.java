package array.utility;

import java.util.Scanner;

/**
 * Receiving value.
 */
public class Menu {

    private int arraysize;

    public int getArraySize () {return arraysize;}

    public void getSize() {
        boolean menuState = true;
        System.out.print(Localization.HELLO);

        do {
            System.out.print(Localization.INPUT);
            Scanner Value = new Scanner(System.in);
            String input = Value.nextLine();
            boolean check = CheckForInt.isInteger(input);
            if (input.equals(Localization.EXIT))
                System.exit(0);
            if (check)
            {
                int temp = Integer.parseInt(input);
                if(temp > 0 && temp <11) {
                    arraysize = temp;
                    menuState = false;
                }
                else
                    System.out.print(Localization.ERROR);
            }
            else
                System.out.print(Localization.ERROR);
        }
        while (menuState);
    }
    public void done(){System.out.print(Localization.SAVED);
    }
}
