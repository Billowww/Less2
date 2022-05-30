package by.it_academy.lesson4;

public class Job {
    public static void main(String[] args) {

        int[] array = new int[10];
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 9} ;
        for (int i = 0; i <= array.length; i++) {
            if (i == 1) {
                System.out.println("*");
            } else if (i == 2) {
                System.out.println("**");
            } else if (i == 3) {
                System.out.println("***");
            } else if (i == 4) {
                System.out.println("****");
            } else if (i == 5) {
                System.out.println("*****");
            } else if (i == 6) {
                System.out.println("******");
            } else if (i == 7) {
                System.out.println("*******");
            } else if (i == 8) {
                System.out.println("********");
            } else if (i == 9) {
                System.out.println("*********");
            } else if (i == 10) {
                System.out.println("**********");
            }


        }
    }
}
