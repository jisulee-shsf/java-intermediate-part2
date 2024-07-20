package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(60);
        nums.add(70);
        nums.add(80);
        nums.add(90);
        nums.add(100);

        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }

        double average = (double) sum / nums.size();
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
