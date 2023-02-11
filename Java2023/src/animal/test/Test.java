package animal.test;

import animal.entity.Dog;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "欧欧";
        dog.health = 20;
        dog.love = 12;
        dog.sex = "Male";
        dog.print();
    }
}
