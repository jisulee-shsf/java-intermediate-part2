package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardExMain2 {

    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<Animal>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        writeBox(objectBox);
        writeBox(animalBox);
//        writeBox(dogBox);
//        writeBox(catBox);
    }

    public static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍이", 100));
    }
}
