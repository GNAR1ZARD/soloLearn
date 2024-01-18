// LinkedList vs. ArrayList
// The most notable difference between the LinkedList and the ArrayList is in the way they store objects.
// The ArrayList is better for storing and accessing data, as it is very similar to a normal array.
// The LinkedList is better for manipulating data, such as making numerous inserts and deletes.

// In addition to storing the object, the LinkedList stores the memory address (or link) of the element that follows it. It's called a LinkedList because each element contains a link to the neighboring element.

// - Use an ArrayList when you need rapid access to your data.
// - Use a LinkedList when you need to make a large number of inserts and/or deletes.

// LinkedLists
// The program you are given declares LinkedList "words".
// Write a program to take words as input and add them to LinkedList untill its size isn't equal to 5, then output only those words whose length is more than 4 characters.

// Sample Input
// Java
// practice
// is
// makes
// perfect

// Sample Output
// practice
// makes
// perfect

// length() method returns the number of characters in a string.

package soloLearn.java.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class ex13_linkedList {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            LinkedList<String> words = new LinkedList<String>();

            while (words.size() < 5) {
                String word = scanner.nextLine();
                words.add(word); // add the word to the LinkedList
            }

            // iterate through the LinkedList and output words with length > 4
            for (String word : words) {
                if (word.length() > 4) {
                    System.out.println(word);
                }
            }
        }
    }
}
