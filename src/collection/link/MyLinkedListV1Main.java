package collection.link;

public class MyLinkedListV1Main {

    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
        System.out.println(list); //MyLinkedListV1{first=null, size=0}

        //1. 데이터 추가
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list); //MyLinkedListV1{first=[a -> b -> c -> d -> e], size=5}

        //2. 기능 사용
        System.out.println(list.size()); //5
        System.out.println(list.get(1)); //b
        System.out.println(list.indexOf("c")); //2
        System.out.println(list.set(2, "z")); //c
        System.out.println(list); //MyLinkedListV1{first=[a -> b -> z -> d -> e], size=5}

        //3. 범위 초과 없음
        list.add("f");
        System.out.println(list); //MyLinkedListV1{first=[a -> b -> z -> d -> e -> f], size=6}
    }
}
