package by.it_academy.lesson3;

public class Secondmission {
    public static void main(String[] args) {
        String grade = "A";

        if (grade.equals("A")) {
            System.out.println("Distinction");
        } else if (grade.equals("B")) {
            System.out.println("First class");
        } else if (grade.equals("C")) {
            System.out.println("First class");
        } else if (grade.equals("D")) {
            System.out.println("You have passed");
        } else if (grade.equals("F")) {
            System.out.println("Fail.Try again");
        } else {
            System.out.println("Invalid grade");
        }

    }
}
