package Session4;
// Session4.ForLoopOne.java
/*
Takes 5 words and determines what the longest word is as well as the average number of vowels and consonants.
By Soleil Vivero
*/

import java.util.Scanner;
public class ForLoopOne {
    public static void main(String[] args) {
        String word, longestWord = "";
        int totalVowels = 0, totalLetters = 0;
        Scanner input = new Scanner(System.in);

        for(int i=1; i<=5; i++){
            System.out.print("Please enter word " + i + ": ");
            word = input.nextLine();
            word = word.toLowerCase();

            for(int j=0; j<word.length(); j++){
                switch(word.charAt(j)){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        totalVowels++;
                }
            }

            if(word.length() > longestWord.length())
                longestWord = word;

            totalLetters += word.length();
        }

        System.out.println("\n\nThe average number of vowels per word: " + String.format("%.2f", totalVowels / 5f) +
                "\nThe average number of consonants per word: " +
                String.format("%.2f", (totalLetters - totalVowels) / 5f) +
                "\nThe longest word: " + longestWord);
    }
}
