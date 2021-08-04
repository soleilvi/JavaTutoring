package BasicCalculator;
// BasicCalculator.SimpleCalculator.java
/*
A calculator that asks the user which operation they want to do (addition, subtraction, multiplication, division,
modulo) and which two numbers they want to use. Once it has that, it performs the operation of those two numbers
and prints the result.
By Soleil Vivero
*/

import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){
        String operator;
        float num1, num2, result = 0.0f;
        Scanner input = new Scanner(System.in);

        System.out.println("What operator do you want to use? (options: +, -, *, /, %)");
        operator = input.nextLine();
        System.out.println("What is the first number of the operation?");
        num1 = input.nextInt();
        System.out.println("What is the second number of the operation?");
        num2 = input.nextInt();
        // TODO: incorporate a for-loop for checking whether the inputs for each question are valid

        // Removes all the spaces from the input string. "\\s" is a single space in unicode.
        operator = operator.replaceAll("\\s", "");

        switch (operator) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
            case "%" -> result = num1 % num2;
            default -> System.out.println("Invalid operator, please try again.");
        }

        System.out.println("Your result is: " + String.format("%.3f", result));
    }
}