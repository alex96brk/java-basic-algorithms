package sort;

import utils.BaseClass;

public class BubbleSort extends BaseClass {
    public static void main(String[] args) {
        int[] array1 = {2, 5, 3, 7, 4, 8, 6, 9, 0, 2, 4, 3, 6, 4, 5, 7, 9, 8, 0, 5, 3, 5};
        printIntArray(array1);
        sortIntBubble_v1(array1);
        printIntArray(array1);

        int[] array2 = {4, 3, 6, 4, 5, 7, 9, 8, 5, 3, 7, 4, 8, 6, 9, 0, 2, 0, 5, 3, 52 };
        printIntArray(array2);
        sortIntBubble_v2(array2);
        printIntArray(array2);
    }

    public static void sortIntBubble_v1(int[] incomingIntArray) {
        boolean isSorted = false;
        do {
            isSorted = true;
            for (int i = 1; i < incomingIntArray.length; i++) {
                if(incomingIntArray[i] < incomingIntArray[i-1]) {
                    int temp = incomingIntArray[i];
                    incomingIntArray[i] = incomingIntArray[i-1];
                    incomingIntArray[i-1] = temp;
                    isSorted = false;
                }
            }
        } while (!isSorted);
    }

    public static void sortIntBubble_v2(int[] incomingIntArray) {
        for (int i = incomingIntArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (incomingIntArray[j] > incomingIntArray[j + 1]) {
                    int buffer = incomingIntArray[j];
                    incomingIntArray[j] = incomingIntArray[j + 1];
                    incomingIntArray[j + 1] = buffer;
                }
            }
        }
    }
}
