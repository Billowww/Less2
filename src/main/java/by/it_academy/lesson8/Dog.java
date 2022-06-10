package by.it_academy.lesson8;

public class Dog extends Animal implements NoiseCapable{
    public Dog(String name){
        super(name);
    }
    public Dog(){
        super("Dog");
    }
    public void bark(){
        System.out.println(name + "barks");
    }

    @Override
    public void makeNoise() {
        bark();
    }

    public static void main(String[] args) {
        Dog dogich = new Dog();


        dogich.name = "Crex ";
        dogich.makeNoise();
        dogich.sleep();
        dogich.eat();
        }

        }



