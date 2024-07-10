package collection.array;

public class MyArrayListV2Main {

    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2();
        System.out.println(list); //[] size = 0 capacity = 5

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list); //[a, b, c, d, e] size = 5 capacity = 5
        list.add("f");
        System.out.println(list); //[a, b, c, d, e, f] size = 6 capacity = 10
    }
}
