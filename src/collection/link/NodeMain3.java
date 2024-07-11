package collection.link;

public class NodeMain3 {

    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");
        System.out.println(first); //[A -> B -> C]

        //1. 모든 노드 탐색
        printAll(first); //ABC

        //2. 마지막 노드 조회
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode.item); //lastNode = C

        //3. 특정 인덱스의 노드 조회
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node.item); //index2Node = C

        //4. 데이터 추가
        System.out.println(first);
        add(first, "D"); //[A -> B -> C]
        System.out.println(first); //[A -> B -> C -> D]
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.print(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x. next;
        }
        return x;
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }
}
