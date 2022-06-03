package by.it_academy.lesson5;

public class Whistle {
    String sound;
    String name;

    public Whistle(String sound ,String name) {
        this.sound = sound;
        this.name = name;
    }
    public void sound(){
        System.out.println(sound);

    }

    public static void main(String[] args) {
        Whistle printSound = new Whistle("Ayyy","Bird");
        printSound.sound();
        System.out.println(printSound.name);

    }

}

