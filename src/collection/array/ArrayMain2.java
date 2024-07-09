package collection.array;

import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println("arr = " + Arrays.toString(arr)); //arr = [1, 2, 0, 0, 0]

        //1. 첫 번째 위치에 3 추가: O(n)
        int newValue1 = 3;
        addFirst(arr, newValue1);
        System.out.println("arr = " + Arrays.toString(arr)); //arr = [3, 1, 2, 0, 0]

        //2. index 위치에 4 추가: O(n)
        int index = 2;
        int newValue2 = 4;
        addAtIndex(arr, index, newValue2);
        System.out.println("arr = " + Arrays.toString(arr)); //arr = [3, 1, 4, 2, 0]

        //3. 마지막 위치에 5 추가: O(1)
        int newValue3 = 5;
        addLast(arr, newValue3);
        System.out.println("arr = " + Arrays.toString(arr)); //arr = [3, 1, 4, 2, 5]
    }

    private static void addLast(int[] arr, int newValue3) {
        arr[arr.length -1] = newValue3;
    }

    private static void addAtIndex(int[] arr, int index, int newValue2) {
        for (int i = arr.length - 1; i > index ; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = newValue2;
    }

    private static void addFirst(int[] arr, int newValue1) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i -1];
        }
        arr[0] = newValue1;
    }
}
