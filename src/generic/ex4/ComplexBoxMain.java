package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class ComplexBoxMain {

    public static void main(String[] args) {
        Dog dog = new Dog("멍이", 200);
        Cat cat = new Cat("냥이", 100);

        ComplexBox<Dog> dogComplexBox = new ComplexBox<>();
        dogComplexBox.set(dog);

        Cat returnCat = dogComplexBox.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }
}
