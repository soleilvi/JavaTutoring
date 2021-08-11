package MiniLessons;
// MiniLessons.SwitchScanner.java
/*
Give the program a number between 1-12 to get the name of the month corresponding to that number. Experimentation with
switch statements.
By Soleil Vivero
*/

import java.util.Scanner;
public class SwitchScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type out the number of a month.");
        int month = input.nextInt();

        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Please enter a number between 1-12");
        }
    }
}
