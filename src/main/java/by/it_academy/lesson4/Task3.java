package by.it_academy.lesson4;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{52, 123, 1235, 346346, 142432};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}