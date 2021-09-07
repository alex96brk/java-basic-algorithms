package search;

import utils.BaseClass;

public class LinearSearch extends BaseClass {

    /**
     * In this class i had implemented linear search of
     * integer array value
     * */

    public static void main(String[] args) {
        int[] array1 = {2, 5, 3, 7, 4, 8, 6, 9, 0, 2, 4, 3, 6, 4, 5, 7, 9, 8, 0, 5, 3, 5};
        System.out.println("Before sort:");
        arrayToString(array1);

        int result = searchLinear(array1, 4);
        System.out.println(String.format("[Result]: index = %d", result));

    }

    public static int searchLinear( int[] incomingArray, int searchValue) {
        for (int i = 0; i < incomingArray.length; i++) {
            if (searchValue == incomingArray[i]) {
                return i;
            }
        }
        return -1;
    }
}
