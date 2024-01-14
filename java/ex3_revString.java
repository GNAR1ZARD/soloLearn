// Reverse a String
// Write a program to take a string as input and output its reverse.
// The given code takes a string as input and converts it into a char array, which contains letters of the string as its elements.

// Sample Input:
// hello there

// Sample Output:
// ereht olleh

// You can loop through the char array, starting from the end, using arr.length to get the size of the array.

package soloLearn.java;

import java.util.Scanner;

public class ex3_revString {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String text = scanner.nextLine();
            char[] arr = text.toCharArray();

            // create a StringBuilder to store the reversed string
            StringBuilder reversedText = new StringBuilder();

            // loop through the char array in reverse order
            for (int i = arr.length - 1; i >= 0; i--) {
                reversedText.append(arr[i]); // append each character to the StringBuilder
            }

            // output the reversed string
            System.out.println(reversedText.toString());
        }
    }
}
