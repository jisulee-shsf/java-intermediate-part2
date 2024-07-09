package collection.array;

public class MyArrayListV1Main {

    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();
        System.out.println(list); //[] size = 0 capacity = 5

        //1. 데이터 추가
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list); //[a, b, c, d, e] size = 5 capacity = 5

        //2. 기능 사용
        System.out.println(list.size()); //5
        System.out.println(list.get(1)); //b
        System.out.println(list.indexOf("c")); //2
        System.out.println(list.set(2, "z")); //c
        System.out.println(list); //[a, b, z, d, e] size = 5 capacity = 5

        //3. 범위 초과
        list.add("f"); //ArrayIndexOutOfBoundsException
        System.out.println(list);
    }
}
