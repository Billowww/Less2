package by.it_academy.lesson4;

public class work3_3 {
    public static void main(String[] args) {
        int[] array = new int[10];

        array = new int[]{52,123,1235,346346,142432};
        int sum = 0;
        for(int i = 0 ; i <array.length; i++){

                sum = sum + array[i];
            }

        System.out.println(sum);
        }
    }