// Type Casting
// Assigning a value of one type to a variable of another type is known as Type Casting.
// To cast a value to a specific type, place the type in parentheses and position it in front of the value.

// Java supports automatic type casting of integers to floating points, since there is no loss of precision.
// On the other hand, type casting is mandatory when assigning floating point values to integer variables.

// For classes, there are two types of casting.

// Upcasting
// You can cast an instance of a subclass to its superclass.

// Downcasting
// Casting an object of a superclass to its subclass is called downcasting.

// Why is upcasting automatic, downcasting manual? 
// Well, upcasting can never fail. But if you have a group of different Animals and want to downcast them all to a Cat, then there's a chance that some of these Animals are actually Dogs, so the process fails.


// Computers understand only numbers, so every character has a numeric representation.
// The program you are given takes a character as input. Write a program to output its numeric value.

// Sample Input
// a

// Sample Output
// 97

// Use cast to assign value of character to an integer.

package soloLearn.java.practice;

import java.util.Scanner;

public class ex7_casting {
   public static void main(String[] args) {
       try (Scanner read = new Scanner(System.in)) {
        char a = read.next().charAt(0);
           
           // convert the character 'a' to its numeric representation
           int numericValue = (int) a;
           
           // output the numeric value
           System.out.println(numericValue);
    }
    }   
}
