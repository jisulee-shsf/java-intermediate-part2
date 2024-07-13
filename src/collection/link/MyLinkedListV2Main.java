package collection.link;

public class MyLinkedListV2Main {

    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        System.out.println(list); //MyLinkedListV2{first=null, size=0}

        //1. 마지막 항목에 데이터 추가 - O(n)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list); //MyLinkedListV2{first=[a -> b -> c], size=3}

        //2-1. 첫 번째 항목에 데이터 추가 및 삭제 - O(1)
        list.add(0, "d");
        System.out.println(list); //MyLinkedListV2{first=[d -> a -> b -> c], size=4}
        list.remove(0);
        System.out.println(list); //MyLinkedListV2{first=[a -> b -> c], size=3}

        //2-2. 중간 항목에 데이터 추가 및 삭제 - O(n)
        list.add(1, "e");
        System.out.println(list); //MyLinkedListV2{first=[a -> e -> b -> c], size=4}
        list.remove(1);
        System.out.println(list); //MyLinkedListV2{first=[a -> b -> c], size=3}
    }
}
