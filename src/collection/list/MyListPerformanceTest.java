package collection.list;

public class MyListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("===MyArrayList 추가===");
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size);
        addLast(new MyArrayList<>(), size);
        System.out.println();

        System.out.println("===MyLinkedList 추가===");
        addFirst(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size);
        addLast(new MyLinkedList<>(), size);
        System.out.println();

        int loop = 10_000;
        System.out.println("===MyArrayList 조회===");
        MyList<Integer> myArrayList = new MyArrayList<>(); //조회용 데이터
        addLast(myArrayList, size);

        getIndex(myArrayList, loop, 0);
        getIndex(myArrayList, loop, size / 2);
        getIndex(myArrayList, loop, size - 1);
        System.out.println();

        System.out.println("===MyLinkedList 조회===");
        MyList<Integer> myLinkedList = new MyLinkedList<>(); //조회용 데이터
        addLast(myLinkedList, size);

        getIndex(myLinkedList, loop, 0);
        getIndex(myLinkedList, loop, size / 2);
        getIndex(myLinkedList, loop, size - 1);
        System.out.println();

        System.out.println("===MyArrayList 검색===");
        search(myArrayList, loop, 0);
        search(myArrayList, loop, size / 2);
        search(myArrayList, loop, size - 1);
        System.out.println();

        System.out.println("===MyLinkedList 검색===");
        search(myLinkedList, loop, 0);
        search(myLinkedList, loop, size / 2);
        search(myLinkedList, loop, size - 1);
    }

    private static void addFirst(MyList<Integer> myList, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            myList.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("addFirst - 크기 = " + size + ", 시간 = " + (endTime - startTime) + "ms");
    }

    private static void addMid(MyList<Integer> myList, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            myList.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("addMid - 크기 = " + size + ", 시간 = " + (endTime - startTime) + "ms");
    }

    private static void addLast(MyList<Integer> myList, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            myList.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("addLast - 크기 = " + size + ", 시간 = " + (endTime - startTime) + "ms");
    }

    private static void getIndex(MyList<Integer> myList, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            myList.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("getIndex - 반복 = " + loop + ", index = " + index + ", 시간 = " + (endTime - startTime) + "ms");
    }

    private static void search(MyList<Integer> myList, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++)  {
            myList.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("search - 반복 = " + loop + ", findValue = " + findValue + ", 시간 = " + (endTime - startTime) + "ms");
    }
}
