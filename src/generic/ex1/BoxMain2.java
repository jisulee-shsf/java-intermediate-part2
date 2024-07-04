package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        //다형성을 통한 코드 중복 제거 시도
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("test");
        String str = (String) stringBox.get();
        System.out.println("str = " + str);

        //잘못된 인수를 전달하는 경우
        integerBox.set("100");
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result); //ClassCastException
    }
}
