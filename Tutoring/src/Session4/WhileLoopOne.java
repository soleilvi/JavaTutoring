package Session4;
// Session4.WhileLoopOne.java
/*
While-loop experimentation; the program asks for a positive integer input and then prints out how many values, odd
numbers, and numbers above 100 were entered, along with the average of all the numbers.
By Soleil Vivero
*/

import java.util.Scanner;
public class WhileLoopOne {
    public static void main (String[] args){
        int number, numberCount = 0, oddCount = 0, sum = 0, overHundred = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a first positive whole number (-1 to exit): ");
        number = input.nextInt();

        while(number != -1) {
            numberCount++;

            if(number % 2 != 0)
                oddCount++;

            sum += number;

            if(number > 100)
                overHundred++;

            System.out.println("Please enter a first positive whole number (-1 to exit): ");
            number = input.nextInt();
        }

        System.out.println("\n\n========Results========\n\n" +
                "Number of values entered: " + numberCount +
                "\nNumber of odd values entered: " + oddCount +
                "\nNumber of values > 100 entered: " + overHundred +
                "\nAverage of the values entered: " + String.format("%.0f",(float)sum/numberCount));
    }
}
