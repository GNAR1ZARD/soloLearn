// Sorting Lists
// For the manipulation of data in different collection types, the Java API provides a Collections class, which is included in the java.util package.
// One of the most popular Collections class methods is sort(), which sorts the elements of your collection type. The methods in the Collections class are static, so you don't need a Collections object to call them.
// Other useful methods in the Collections class:
// max(Collection c): Returns the maximum element in c as determined by natural ordering.
// min(Collection c): Returns the minimum element in c as determined by natural ordering.
// reverse(List list): Reverses the sequence in list.
// shuffle(List list): Shuffles (i.e., randomizes) the elements in list.


// The program you are given declares ArrayList of integers.
// Complete the program to take numbers as input and add them to ArrayList until its size isn't equal to 5. Then output its maximum and minimum values.

// Sample Input
// 4
// 12
// 3
// 88
// 96

// Sample Output
// 96
// 3

// Use Collections.max() and Collections.min() to get the maximum and the minimum.

package soloLearn.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex15_sortingList {
      public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        try (Scanner scanner = new Scanner(System.in)) {
            while (nums.size() < 5) {
                int num = scanner.nextInt();
                nums.add(num); // add the number to the ArrayList
            }
        }

        int maximum = Collections.max(nums); // find the max val
        int minimum = Collections.min(nums); // find the min val

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
