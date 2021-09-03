package utils;

public abstract class BaseClass {

    public static void printIntArray(int[] incomingIntArray) {
        System.out.println("[PRINT INT ARRAY]: Started");
        for (int i =0; i < incomingIntArray.length; i++) {
            System.out.println(String.format("\tarray[%d] = %d", i, incomingIntArray[i]));
        }
        System.out.println("[PRINT INT ARRAY]: Finished\n");
    }
}
