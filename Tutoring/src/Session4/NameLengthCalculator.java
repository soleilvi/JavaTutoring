package Session4;
// Session4.NameLengthCalculator.java
/*
Takes 3 names and outputs the longest and shortest name, as well as the average length of them all.
*/

import java.util.Scanner;
public class NameLengthCalculator {
    public static void main(String[] args) {
        String name, longestName = "", shortestName;
        int letters = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a name: ");
        name = input.nextLine();
        name = name.toLowerCase();
        shortestName = name;

        for(int i=1; i<3; i++){
            if(name.length() > longestName.length())
                longestName = name;
            if(name.length() < shortestName.length())
                shortestName = name;

            letters += name.length();

            System.out.print("Enter a name: ");
            name = input.nextLine();
            name = name.toLowerCase();
        }
        letters += name.length();

        System.out.println("\n\nLongest name: " + longestName +
                           "\nShortest name: " + shortestName +
                           "\nAverage name length: " + String.format("%.3f", letters/3f));
    }
}
