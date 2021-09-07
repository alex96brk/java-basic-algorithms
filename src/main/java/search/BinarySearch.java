package search;

import sort.BubbleSort;
import utils.BaseClass;

public class BinarySearch extends BaseClass {

    /**
     * In this class i had implemented linear search of
     * integer array value
     */

    public static void main(String[] args) {
        int[] array1 = {2, 5, 3, 7, 4, 8, 6, 9, 0, 2, 4, 3, 6, 4, 5, 7, 9, 8, 0, 5, 3, 5};
        System.out.println("Before sort:");
        arrayToString(array1);

        System.out.println("After sort:");
        BubbleSort.sortIntBubble_v1(array1);
        arrayToString(array1);

        int result = binarySearch(array1, 6);
        if (result == -1) {
            System.out.println("[RESULT]: not found");
        } else {
            System.out.println(String.format("[RESULT]: result = %d", result));
        }


    }

    public static int binarySearch(int[] incomingArray, int searchValue) {
        int leftBorder = 0;
        int rightBorder = incomingArray.length - 1;
        int center = 0;
        while (leftBorder <= rightBorder) {
            center = leftBorder + (rightBorder - leftBorder) / 2;

            if (incomingArray[center] == searchValue) {
                return center;
            }

            if (incomingArray[center] > searchValue) {
                rightBorder = center - 1;
            }
            if (incomingArray[center] < searchValue) {
                leftBorder = center + 1;
            }
        }

        return -1;
    }
}
