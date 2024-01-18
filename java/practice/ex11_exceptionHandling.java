// Exception Handling
// An online electronics store has 5 product categories - PCs, Notebooks, Tablets, Phones, and Аccessories.
// The program you are given declares an array and stores that types into it.
// Write a program to take N number as input and output the element of the array with N index. If the index is out of range, program should output "Wrong Option".

// Sample Input
// 5

// Sample Output
// Wrong Option

// Use the Exception type to catch all possible exceptions.

package soloLearn.java.practice;

import java.util.Scanner;

public class ex11_exceptionHandling {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = scanner.nextInt();

            String[] categories = { "PCs", "Notebooks", "Tablets", "Phones", "Аccessories" };

            try {
                // check if the index is within the valid range
                if (choice >= 0 && choice < categories.length) {
                    System.out.println(categories[choice]);
                } else {
                    System.out.println("Wrong Option");
                }
            } catch (Exception e) {
                // handle any possible exceptions (though none are expected here)
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}
