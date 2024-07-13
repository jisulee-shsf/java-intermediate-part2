package collection.link;

public class MyLinkedListV3Main {

    public static void main(String[] args) {
        //1. String 타입
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        System.out.println(stringList); //MyLinkedListV3{first=null, size=0}

        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.get(0);
        System.out.println(stringList); //MyLinkedListV3{first=[a -> b -> c], size=3}

        //2.Integer 타입
        MyLinkedListV3<Integer> integerList = new MyLinkedListV3<>();
        System.out.println(integerList); //MyLinkedListV3{first=null, size=0}

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Integer integer = integerList.get(0);
        System.out.println(integerList); //MyLinkedListV3{first=[1 -> 2 -> 3], size=3}
    }
}
