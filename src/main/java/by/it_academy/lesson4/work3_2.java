package by.it_academy.lesson4;

public class work3_2 {


    public static void main(String[] args) {

        int[] array = new int[4];
        array = new int[]{3, 21, 5, 23, 5};
        for (int i = 0; i < array.length; i++) {

            int abba = 1;
            while (abba <= array[i]){
                abba++;
                System.out.print("*");

            }



            System.out.println();

        }
    }
}

