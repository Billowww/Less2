package by.it_academy.lesson4;

public class Task1 {
    public static void main(String[] args) {
        int[] array=new int[]{15, 30, 45, 520, 132};
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}