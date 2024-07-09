package collection.array;

import java.util.Arrays;

public class ArrayMain1 {

    public static void main(String[] args) {
        int[] arr = new int[5];

        //1. index 입력: O(1)
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println("arr = " + Arrays.toString(arr)); //arr = [1, 2, 3, 0, 0]

        //2. index 변경: O(1)
        arr[2] = 10;
        System.out.println("arr = " + Arrays.toString(arr)); //arr = [1, 2, 10, 0, 0]

        //3. index 조회: O(1)
        System.out.println("arr[2] = " + arr[2]); //arr[2] = 10

        //4. 순차 검색: O(n)
        System.out.println("arr = " + Arrays.toString(arr)); //arr = [1, 2, 10, 0, 0]
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]); //arr[i] = 1 -> arr[i] = 2 -> arr[i] = 10
            if (arr[i] == value) {
                break;
            }
        }
    }
}
