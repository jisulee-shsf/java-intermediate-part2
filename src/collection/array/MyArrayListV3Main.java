package collection.array;

public class MyArrayListV3Main {

    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        System.out.println(list); //[] size = 0 capacity = 5

        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list); //[a, b, c] size = 3 capacity = 5

        //1-1. addLast - O(1)
        list.add(3, "addLast");
        System.out.println(list); //[a, b, c, addLast] size = 4 capacity = 5

        //1-2. addFirst - O(n)
        list.add(0, "addFirst");
        System.out.println(list); //[addFirst, a, b, c, addLast] size = 5 capacity = 5

        //2-1. removeLast - O(1)
        Object removedValue1 = list.remove(list.size() - 1);
        System.out.println("removedValue1 = " + removedValue1); //removedValue1 = addLast
        System.out.println(list); //[addFirst, a, b, c] size = 4 capacity = 5

        //2-2. removeFirst - O(n)
        Object removedValue2 = list.remove(0);
        System.out.println("removedValue2 = " + removedValue2); //removedValue2 = addFirst
        System.out.println(list); //[a, b, c] size = 3 capacity = 5
    }
}
