// Iterators
// An Iterator is an object that enables to cycle through a collection, obtain or remove elements.
// Before you can access a collection through an iterator, you must obtain one. Each of the collection classes provides an iterator() method that returns an iterator to the start of the collection. By using this iterator object, you can access each element in the collection, one element at a time.

// The Iterator class provides the following methods:
// hasNext(): Returns true if there is at least one more element; otherwise, it returns false.
// next(): Returns the next object and advances the iterator.
// remove(): Removes the last object that was returned by next from the collection.

// The Iterator class must be imported from the java.util package.

// Typically, iterators are used in loops. At each iteration of the loop, you can access the corresponding list element.

// The program you are given declares a LinkedList of integers, takes 5 numbers from user, and add them to it.
// Write a program to calculate and output the sum of them elements.

// Sample Input
// 4
// 3
// 50
// 3
// 8

// Sample Output
// 68

// Use Iterator and its methods to execute the calculation using the while loop.

package soloLearn.java.practice;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class ex16_iterators {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            LinkedList<Integer> nums = new LinkedList<Integer>();

            while (nums.size() < 5) {
                int num = scanner.nextInt();
                nums.add(num);
            }

            int sum = 0;
            Iterator<Integer> iterator = nums.iterator(); // create an Iterator

            while (iterator.hasNext()) {
                int num = iterator.next();
                sum += num; // add each element to the sum
            }

            System.out.println(sum);
        }
    }
}
