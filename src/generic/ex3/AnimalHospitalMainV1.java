package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍이1", 100);
        Cat cat = new Cat("냥이1", 300);

        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 매개변수 체크 실패
        dogHospital.set(cat);

        // 문제2: 다운 캐스팅 필요
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
