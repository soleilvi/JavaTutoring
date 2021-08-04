package Session2;
// Session2.Scanner2.java
/*
The program asks you for two numbers and prints out their sum.
By Soleil Vivero
*/

import java.util.Scanner;
public class Scanner2 {
    public static void main(String[] args){
        int num1, num2, sumTotal;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        num1 = input.nextInt();
        System.out.println("Enter another number:");
        num2 = input.nextInt();
        sumTotal = num1 + num2;
        System.out.println("The sum of what you put in is: " + sumTotal);
    }
}
