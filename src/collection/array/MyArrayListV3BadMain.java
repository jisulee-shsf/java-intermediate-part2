package collection.array;

public class MyArrayListV3BadMain {

    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        System.out.println(list); //[] size = 0 capacity = 5

        //숫자 입력을 기대한 경우
        list.add(1);
        list.add(2);
        list.add("test");
        System.out.println(list); //[1, 2, test] size = 3 capacity = 5

        //숫자 반환을 예상한 경우
        Integer integer1 = (Integer) list.get(0);
        Integer integer2 = (Integer) list.get(1);
        Integer integer3 = (Integer) list.get(2); //ClassCastException 발생
        System.out.println(list);
    }
}
