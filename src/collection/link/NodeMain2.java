package collection.link;

public class NodeMain2 {

    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        //IDE 생성 toString() 호출
        System.out.println(first); //Node{item=A, next=Node{item=B, next=Node{item=C, next=null}}}

        //직접 작성 toString() 호출
        System.out.println(first); //[A -> B -> C]
        System.out.println(first.next); //[B -> C]
        System.out.println(first.next.next); //[C]
    }
}
