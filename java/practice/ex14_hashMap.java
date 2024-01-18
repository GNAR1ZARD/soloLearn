// HashMap
// Arrays and Lists store elements as ordered collections, with each element given an integer index.
// HashMap is used for storing data collections as key and value pairs. One object is used as a key (index) to another object (the value).
// The put, remove, and get methods are used to add, delete, and access values in the HashMap.

// A HashMap cannot contain duplicate keys. Adding a new item with a key that already exists overwrites the old element.
// The HashMap class provides containsKey and containsValue methods that determine the presence of a specified key or value.
// If you try to get a value that is not present in your map, it returns the value of null.

// null is a special type that represents the absence of a value.

// The program you are given defines and outputs HashMap, where the names of employees are stored as keys, and their ages as values.
// It also takes N number from user as age limit. Write code to delete all the employees whom age is less than N number.
// The line of code for the output of HashMap object is already provided.

// Sample Input
// 25

// Sample Output
// {Robert=32, John=28}

// Hint
// Use get() method to access values in the HashMap and remove() to delete them.

// nameArr is an array of given HashMap keys and created for iteration.

package soloLearn.java.practice;

import java.util.HashMap;
import java.util.Scanner;

public class ex14_hashMap {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            HashMap<String, Integer> ages = new HashMap<String, Integer>();
            ages.put("David", 22);
            ages.put("Tom", 23);
            ages.put("Robert", 32);
            ages.put("Alice", 21);
            ages.put("Sophie", 19);
            ages.put("Maria", 24);
            ages.put("John", 28);

            String[] nameArr = new String[ages.size()];
            nameArr = ages.keySet().toArray(nameArr);

            int ageLimit = scanner.nextInt();

            for (String emp : nameArr) {
                // check if the age of the employee is less than the ageLimit
                if (ages.get(emp) < ageLimit) {
                    // remove the employee if their age is less than ageLimit
                    ages.remove(emp);
                }
            }

            System.out.println(ages);
        }
    }
}
