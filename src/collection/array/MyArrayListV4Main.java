package collection.array;

public class MyArrayListV4Main {

    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
//        stringList.add(1);
        String str = stringList.get(0);
        System.out.println("str = " + str); //a

        MyArrayListV4<Integer> integerList = new MyArrayListV4<>();
        integerList.add(1);
//        integerList.add("a");
        Integer integer = integerList.get(0);
        System.out.println("integer = " + integer); //1
    }
}
