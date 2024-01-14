// Loan Calculator
// You take a loan from a friend and need to calculate how much you will owe him after 3 months.
// You are going to pay him back 10% of the remaining loan amount each month.
// Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months.

// Sample Input:
// 20000

// Sample Output:
// 14580

// Here is the monthly payment schedule:
// Month 1
// Payment: 10% of 20000 = 2000
// Remaining amount: 18000
// Month 2
// Payment: 10% of 18000 = 1800
// Remaining amount: 16200
// Month 3:
// Payment: 10% of 16200 = 1620
// Remaining amount: 14580

// Use a loop to calculate the payment and remaining amounts for each month.
// Also, use integers for amounts.

package soloLearn.java;

import java.util.Scanner;

public class ex2_loanCalc {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // input initial loan amount
            int loanAmount = scanner.nextInt();

            // calculate and display remaining amount for each month
            for (int month = 1; month <= 3; month++) {
                int payment = (int) (loanAmount * 0.10); // calc payment for this month
                loanAmount -= payment; // update remaining loan amount after payment

                System.out.println("Month " + month);
                System.out.println("Payment: 10% of " + loanAmount + " = " + payment);
                System.out.println("Remaining amount: " + loanAmount);

                // check if loan fully paid off
                if (loanAmount == 0) {
                    System.out.println("Loan fully paid off.");
                    break;
                }
            }
        }
    }
}
