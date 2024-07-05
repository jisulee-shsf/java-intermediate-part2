package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍이1", 100);
        Cat cat = new Cat("냥이1", 300);

        DogHospital dogHospital = new DogHospital();
        dogHospital.set(dog);
        dogHospital.checkup();

        CatHospital catHospital = new CatHospital();
        catHospital.set(cat);
        catHospital.checkup();

        Dog biggerDog = dogHospital.bigger(new Dog("멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
