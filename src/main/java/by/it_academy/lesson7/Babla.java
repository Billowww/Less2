package by.it_academy.lesson7;

import java.util.Arrays;

public class Babla {
    public static void main(String[] args) {
        String text = "Its nice";
        String[] array =text.split("");
        for(int i = 0; i<1;i++){
            for(int j = array.length-1;j>=i ;j-- ){
                System.out.print(array[j]);


            }

        }







    }
}

