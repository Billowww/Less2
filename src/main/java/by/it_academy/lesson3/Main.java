package by.it_academy.lesson3;

public class Main {
    public static void main(String[] args) {

        double giftValue = 50000;
        if (giftValue < 5000) {
            System.out.println("Without tax");
        }
        if (giftValue >= 5000 && giftValue <= 25000) {
            System.out.println("The tax is " + (100 + (giftValue - 5000) * 0.08));
        }
        if (giftValue > 25000) {
            System.out.println("The tax is " + (1700 + (giftValue - 25000) * 0.1));
        }


    }
}