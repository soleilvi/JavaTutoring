package Session4;
// Session4.HeightStats.java
/*
Takes 6 height inputs and prints out the average, the smallest height value, the number of height values between 1.3m
and 1.9m, and the percentage of heights that are greater than the global average height.
By Soleil Vivero
*/

import java.util.Scanner;
public class HeightStats {
    public static void main(String[] args) {
        int count = 1, between = 0, exceed = 0;
        float height, average = 0, smallest = 100, loopLimit = 6;
        final float GLOBAL_AVERAGE_HEIGHT = 1.665f, MIN_HEIGHT = 0.5464f, MAX_HEIGHT = 2.73f;
        Scanner input = new Scanner(System.in);

        while(count <= loopLimit) {
            System.out.print("\nLoop " + count + " - Please enter height: ");
            height = input.nextFloat();

            while(height <= MIN_HEIGHT || height >= MAX_HEIGHT) {
                System.out.print("Loop " + count + " - Height value invalid, please re-enter height: ");
                height = input.nextFloat();
            }

            if(height < smallest)
                smallest = height;

            if(height >= 1.3 && height <= 1.9)
                between++;

            if(height > GLOBAL_AVERAGE_HEIGHT)
                exceed++;

            count++;
            average += height;
        }
        System.out.println(
                "\n-------------------------------------\n" +
                "\tHeight Statistics\n" +
                "-------------------------------------\n\n" +
                "The average of the heights entered is " + String.format("%.1f", (average / loopLimit)) + "m\n" +
                "The smallest height value entered is " + smallest + "m\n" +
                "The number of height values between 1.3m and 1.9m inclusive is " + between + "\n" +
                "the percentage of height values exceeding the global average height is " +
                String.format("%.2f", 100 * (exceed / loopLimit)) + "%"
        );
    }
}
