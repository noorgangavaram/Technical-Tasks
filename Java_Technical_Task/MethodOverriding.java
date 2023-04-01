abstract class Animal{
    abstract void eat();
    abstract void sound();
}

class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Dog eats biscuts");
    }

    @Override
    void sound() {
        System.out.println("Dog sounds bhow bhow bhow");
    }
}

class Cat extends Animal{

    @Override
    void eat() {
        System.out.println("cat drinks milk");
    }

    @Override
    void sound() {
        System.out.println("Cat sounds meow meow meow");
    }
}

public class MethodOverriding {
    public static void main(String args[]){
        Dog dog = new Dog();
        dog.eat();
        dog.sound();

        Cat cat = new Cat();
        cat.eat();
        cat.sound();
    }
}
