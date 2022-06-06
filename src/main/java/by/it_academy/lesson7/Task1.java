package by.it_academy.lesson7;

import java.lang.reflect.Parameter;
import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String array[] = new String[]{"Geogrio,2015", "lucas,2017", "Nikolay,2002", "Sasuki,2000", "Quanti,2003"};
        Pattern Names = Pattern.compile("\\w+");
        Pattern Year = Pattern.compile("\\d+");
        String nameLong = " ";
       int middleyear = 0;


        for (int i = 0; i < array.length; i++) {
            Matcher matcher = Names.matcher(array[i]);
            Matcher matcher1 = Year.matcher(array[i]);

            matcher.find();
            matcher.group();
            matcher1.find();
            matcher1.group();


            if (matcher.group().length() > nameLong.length()) {
                nameLong = matcher.group();
            }
             middleyear = middleyear + Integer.parseInt(matcher1.group()) ;





        }
        System.out.println(nameLong);
        System.out.println(middleyear/ array.length);




        //        System.out.println(array[1].length());
//        for (int i = 0, i<array.length, i++){
//        }
//        System.out.println(array.length[1]-5);
//        System.out.println(array[1]);

    }
}
