package com.pluralsight;
import java.util.Scanner;
import java.util.Arrays;
public class FamousQuotes {
    public static void main(String[] args) {
        String[] famousQuotes = {
                "I' just a kid, and life is a nightmare.", "\nNo matter where life takes me, you'll find me with a smile.", "\nYou can love it, you can leave it, they say you're nothin' without it.",
                "\nIt’s hard to dream when you’re deep inside of one.", "\nStand by those who stand by you.", "\nLife goes on, days get brighter.",
                "\nPeople change and things go wrong, but just remember, life goes on.", "\nNever scared of death, but I ain’t ready for that day to come.",
                "\nThe day that I die on will turn me into an icon.", "\nI’m just an idea, nothing concrete."
        };
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10 to get a Mac Miller quote: ");
        int userChoice = myScanner.nextInt();

        if (userChoice >= 1 && userChoice <= 10) {

        System.out.println(" Mac miller quote #" + userChoice + ": " + famousQuotes[userChoice - 1]);
    } else {
            System.out.println("Invalid input. Please enter an number between 1 and 10.");
        }
    }
}