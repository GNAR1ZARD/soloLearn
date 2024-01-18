// ArrayList
// The Java API provides special classes to store and manipulate groups of objects.
// One such class is the ArrayList. Standard Java arrays are of a fixed length, which means that after they are created, they cannot expand or shrink.
// On the other hand, ArrayLists are created with an initial size, but when this size is exceeded, the collection is automatically enlarged.
// When objects are removed, the ArrayList may shrink in size. Note that the ArrayList class is in the java.util package, so it's necessary to import it before using it.
// Create an ArrayList as you would any object.

// The ArrayList class provides a number of useful methods for manipulating its objects.
// The add() method adds new objects to the ArrayList. Conversely, the remove() method removes objects from the ArrayList.
// Other useful methods include the following:
// - contains(): Returns true if the list contains the specified element
// - get(int index): Returns the element at the specified position in the list
// - size(): Returns the number of elements in the list
// - clear(): Removes all of the elements from the list

// Note: As with arrays, the indexing starts with 0.


// The program you are given declares an even nums ArrayList.
// Write a program to take numbers as input and add them an ArrayList while the size of the ArrayList isn't equal to 3.
// Then calculate and output the average of all values in integers.

// Sample Input
// 5
// 2
// 4


// Sample Output
// 3
package soloLearn.java.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ex12_arrayList {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Integer> evennums = new ArrayList<Integer>();

            while (evennums.size() < 3) {
                int num = scanner.nextInt();
                evennums.add(num); // add input numbers to the ArrayList
            }

            int sum = 0;
            for (int num : evennums) {
                sum += num;
            }

            int average = sum / evennums.size(); // calc the average

            System.out.println(average);
        }
    }
}
