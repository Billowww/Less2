package by.it_academy.lesson8;

public class Cat extends Animal implements NoiseCapable {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("Cat");
    }

    public void purr() {
        System.out.println(name + "purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Nissa ";
        cat.sleep();
        cat.eat();
        cat.makeNoise();

    }
}
