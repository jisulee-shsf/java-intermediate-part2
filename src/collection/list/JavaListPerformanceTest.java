package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("===ArrayList 추가===");
        addFirst(new ArrayList<>(), size);
        addMid(new ArrayList<>(), size);
        addLast(new ArrayList<>(), size);
        System.out.println();

        System.out.println("===LinkedList 추가===");
        addFirst(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size);
        addLast(new LinkedList<>(), size);
        System.out.println();

        int loop = 10_000;
        System.out.println("===ArrayList 조회===");
        List<Integer> arrayList = new ArrayList<>(); //조회용 데이터
        addLast(arrayList, size);

        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);
        System.out.println();

        System.out.println("===LinkedList 조회===");
        List<Integer> linkedList = new LinkedList<>(); //조회용 데이터
        addLast(linkedList, size);

        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size / 2);
        getIndex(linkedList, loop, size - 1);
        System.out.println();

        System.out.println("===ArrayList 검색===");
        search(arrayList, loop, 0);
        search(arrayList, loop, size / 2);
        search(arrayList, loop, size - 1);
        System.out.println();

        System.out.println("===LinkedList 검색===");
        search(linkedList, loop, 0);
        search(linkedList, loop, size / 2);
        search(linkedList, loop, size - 1);
    }

    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("addFirst - 크기 = " + size + ", 시간 = " + (endTime - startTime) + "ms");
    }

    private static void addMid(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("addMid - 크기 = " + size + ", 시간 = " + (endTime - startTime) + "ms");
    }

    private static void addLast(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("addLast - 크기 = " + size + ", 시간 = " + (endTime - startTime) + "ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("getIndex - 반복 = " + loop + ", index = " + index + ", 시간 = " + (endTime - startTime) + "ms");
    }

    private static void search(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++)  {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("search - 반복 = " + loop + ", findValue = " + findValue + ", 시간 = " + (endTime - startTime) + "ms");
    }
}
