package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍이1", 100);
        Cat cat = new Cat("냥이1", 300);

        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
//        AnimalHospitalV3<String> stringHospital = new AnimalHospitalV3<>();
//        AnimalHospitalV3<Object> objectHospital = new AnimalHospitalV3<>();

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

//        dogHospital.set(cat);

        Dog biggerDog = dogHospital.bigger(new Dog("멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
