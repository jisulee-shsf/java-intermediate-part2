package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        BatchProcessor batchProcessor1 = new BatchProcessor(new MyArrayList<>());
        batchProcessor1.logic(50_000); //size = 50000 time = 3368ms

        BatchProcessor batchProcessor2 = new BatchProcessor(new MyLinkedList<>());
        batchProcessor2.logic(50_000); //size = 50000 time = 7ms
    }
}
