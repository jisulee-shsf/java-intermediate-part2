package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요. (종료 0)");
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            nums.add(input);
        }

        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }

        double average = (double) sum / nums.size();
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
