package search;

import utils.BaseClass;

public class SearchMinimal extends BaseClass {

    /**
     * In this class i had implemented search of minimal value in
     * array of integer values
     * */

    public static void main(String[] args) {
        int[] array1 = {2, 5, 3, 7, 4, 8, 6, 9, 2, 4, 3, 6, 4, 5, 7, 9, 8, 5, 3, 5};
        printIntArray(array1);

        int minValue = searchMinimal(array1);
        System.out.println(String.format("Minimal value is %d", minValue));
    }

    public static int searchMinimal(int[] incomingArray) {
        int valueMin = incomingArray[0];
        int valueIndex = 0;

        for (int i = 0; i < incomingArray.length; i++) {
            if (incomingArray[i] < valueMin) {
                valueMin = incomingArray[i];
                valueIndex = i;
            }
        }

        return valueMin;
    }

}
