/*
Pseudocode:
- Initialize Scanner to read from the console.
- Prompt the user to enter their age.
- Read the age value from the console.
- If the age is 21 or over, display a message indicating they get a wrist band.
- If the age is under 21, do not display any message.
*/

import java.util.Scanner;

public class EntryKiosk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int customerAge = input.nextInt();

        if (customerAge >= 21) {
            System.out.println("You get a wrist band.");
        }

    }
}
