// Christy Park ITSS 3311.001
// Project 2 10/15/20 

import java.util.Scanner;

public class ConvertingChar {

    static boolean isSign(char c) {
        return c == '+' || c == '-';
    }

    public static void main(String[] args) {
        // Create scanner object
        Scanner input = new Scanner(System.in);
        // Prompt user to enter input
        System.out.print("Input:");
        String line = input.nextLine();
        input.close();
        line = line.trim();

        // Assuming number not found, print 0
        Number output = 0;
        // If letter or word come first, flag to stop conversion
        boolean numberPossible = true;
        // Output initially empty
        String potentialNumber = "";
        // Start loop
        for (int i = 0; i <line.length(); i++) {
            char c = line.charAt(i);

            if (isSign(c) || Character.isDigit(c)) {
                potentialNumber += String.valueOf(c);
            } else {
                if (Character.isWhitespace(c)) {
                } else {
                    if (potentialNumber.length() == 0) {
                        numberPossible = false;
                        break;
                    }
                }
            }
        }
        if (numberPossible) {
            output = Integer.parseInt(potentialNumber);
        }
        System.out.print("Output: " + output);
    }
}