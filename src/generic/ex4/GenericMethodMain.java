package generic.ex4;

public class GenericMethodMain {

    public static void main(String[] args) {
        Integer i = 10;
        Double d = 10.0;

//        Object object = GenericMethod.objectMethod(integer);
        Integer result = (Integer) GenericMethod.objectMethod(i);

        Integer integerValue = GenericMethod.<Integer>genericMethod(i);
        Double doubleValue = GenericMethod.<Double>genericMethod(d);

//        String stringValue = GenericMethod.<String>numberGenericMethod("test");
        Integer integerValue2 = GenericMethod.numberGenericMethod(i);
        Double doubleValue2 = GenericMethod.numberGenericMethod(d);
    }
}