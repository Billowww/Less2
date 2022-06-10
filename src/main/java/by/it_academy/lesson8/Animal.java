package by.it_academy.lesson8;

public abstract class Animal {
    String name;

    public Animal(String name) {

        this.name = name;
    }
public String name(){
        return name;
}
public void eat(){
    System.out.println(name + "eats");
}
public void sleep(){
    System.out.println(name + " sleeps");

}
public void wakeUp(){
    System.out.println(name + " wakeups");
}
}
