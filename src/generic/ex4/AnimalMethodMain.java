package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMethodMain {

    public static void main(String[] args) {
        Dog dog = new Dog("멍이", 100);
        Cat cat = new Cat("냥이", 100);

//        AnimalMethod.<Dog>checkup(dog);
        AnimalMethod.<Dog>checkup(dog);
//        AnimalMethod.<Cat>checkup(cat);
        AnimalMethod.checkup(cat);

//        Dog biggerDog = AnimalMethod.<Dog>bigger(dog, new Dog("멍멍이", 300));
        Dog biggerDog = AnimalMethod.bigger(dog, new Dog("멍멍이", 300));
        System.out.println("biggerDog = " + biggerDog);
    }
}
