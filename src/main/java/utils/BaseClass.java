package utils;

import java.util.Arrays;

public abstract class BaseClass {

    /**
     *
     * In this class, i had realized methods,
     * which are general to classes, which will be implemented
     * in this project.
     * */

    public static void printIntArray(int[] incomingIntArray) {
        System.out.println("[PRINT INT ARRAY]: Started");
        for (int i =0; i < incomingIntArray.length; i++) {
            System.out.println(String.format("\tarray[%d] = %d", i, incomingIntArray[i]));
        }
        System.out.println("[PRINT INT ARRAY]: Finished\n");
    }

    public static void arrayToString(int[] incomingIntArray) {
        System.out.println(String.format("Array: %s \n", Arrays.toString(incomingIntArray)));
    }
}
