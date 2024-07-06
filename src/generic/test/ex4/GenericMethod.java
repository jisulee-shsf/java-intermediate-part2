package generic.test.ex4;

public class GenericMethod {

    public static Object objectMethod(Object obj) {
        System.out.println("objectMethod = " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t) {
        System.out.println("genericMethod = " + t);
        return t;
    }

    public static <T extends Number> T numberGenericMethod(T t) {
        System.out.println("numberGenericMethod = " + t);
        return t;
    }
}