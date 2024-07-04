package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.set(100);
        Integer integer = integerGenericBox.get();
        System.out.println("integer = " + integer);
    }
}
