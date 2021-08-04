package Session2;
// Session2.Scanner3.java
/*
This asks for your age and then roasts you regardless of what you put in, so have fun with that.
By Soleil Vivero
*/

import java.util.Scanner;
public class Scanner3 {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);

        System.out.println("What age are you?");
        age = input.nextInt();

        if(age < 18)
            System.out.println("Pfft, what, you can't even watch Joker on theaters without parental supervision? Pathetic.");
        else
            System.out.println("You have lived for too long, why are you here?");
    }
}
