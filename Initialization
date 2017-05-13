/*
 * Stores every item in a list into its own array element.
 */
package toolbox;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * @author Devlin Wyatt
 */
public class Initialize extends ToolBox {

    public String[] Initialization(File file) throws FileNotFoundException {

        int listSize = 0;
        Scanner inputFile = new Scanner(file);

        //Creates the list size for the array.
        while (inputFile.hasNext()) {
            inputFile.nextLine();
            listSize++;
        }
        inputFile.close();

        //Creates the array.
        String[] book = new String[listSize];
        inputFile = new Scanner(file);

        //Fills the array with each item.
        for (int i = 0; i < listSize; i++) {
            book[i] = inputFile.nextLine();
        }
        inputFile.close();

        return book;
    }
}
