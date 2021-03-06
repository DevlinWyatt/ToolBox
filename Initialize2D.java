/*
 * This program takes a wordlist.txt and sorts it alphabetically 
 * into a 2D Array.
 */
package toolbox;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Devlin Wyatt
 */
public class Initialize2D extends ToolBox {

    public static String[][] Initialize2D(File file) throws FileNotFoundException {
        
        int listSize = 0;

        Initialize a = new Initialize();
        String[] oneArray = a.Initialization(file);

        // Finds the size of the 2D array.
        for (int i = 0; i < 26; i++) {
            
            int sizeCheck = 0;

            for (int j = 0; j < oneArray.length; j++) {
                
                if (oneArray[j].charAt(0) == (char) (i + 97)) {
                    sizeCheck++;
                }
                if (sizeCheck > listSize) {
                    listSize = sizeCheck;
                }
            }
        }

        String[][] twoArray = new String[26][listSize];

        // Sorts and fills the 2D Array.
        for (int i = 0; i < 26; i++) {
            int k = 0;
            for (int j = 0; j < oneArray.length; j++) {

                if (oneArray[j].charAt(0) == (char) (i + 97)) {

                    twoArray[i][k++] = oneArray[j];

                }
            }
        }
        return twoArray;
    }
}
