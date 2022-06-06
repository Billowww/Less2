package by.it_academy.lesson5;

public class Whistle {
    private String sound;
    public Whistle(String whistleSound){
        this.sound = whistleSound;

    }
    public void sound(){
        System.out.println(sound);
    }

    public static void main(String[] args) {
        Whistle printSound = new Whistle("Ayyy");
        printSound.sound();

    }
}
