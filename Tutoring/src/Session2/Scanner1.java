package Session2;
// Session2.Scanner1.java
/*
Prints out "Hello x", with x being any name you give the program through the terminal input feature.
By Soleil Vivero
*/

import java.util.Scanner;
public class Scanner1 {
    public static void main(String[] args){
        String name;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name here: ");
        name = input.nextLine();

        System.out.println("Hello " + name);
    }
}
