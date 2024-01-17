package soloLearn.java.practice;

// Multiple Exceptions
// You need to write a divider program which will operate with integers,
// The program you are given should take two integers as input and execute the division, but we need to handle two exceptions:
// 1. the divider shouldn't be zero
// 2. both inputs should be integers.
// Complete the program to handle them. For the first exception, the program should output "Mistake: division by zero"; and for the second one, "Mistake: wrong value type".

// Sample Input
// 1
// b

// Sample Output
// Mistake: wrong value type

// Use ArithmeticException for first exception and InputMismatchException for the second one.

import java.util.Scanner;
import java.util.InputMismatchException;

public class ex9_multipleExceptions {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            String input1 = scanner.next();
            String input2 = scanner.next();
            
            int num1, num2;
            
            try {
                num1 = Integer.parseInt(input1);
                num2 = Integer.parseInt(input2);
            } catch (NumberFormatException e) {
                throw new InputMismatchException("Mistake: wrong value type");
            }
            
            if (num2 == 0) {
                throw new ArithmeticException("Mistake: division by zero");
            }
            
            int result = num1 / num2;
            System.out.println(result);
            
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
