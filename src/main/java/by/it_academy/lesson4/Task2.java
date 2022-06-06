package by.it_academy.lesson4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[]{3, 21, 5, 23, 5};
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            while (counter < array[i]) {
                System.out.print("*");
                counter++;
            }
            System.out.println();
        }
    }
}

