// Binary Converter
// The binary numeric system uses only two digits: 0 and 1. Computers operate in binary, meaning they store data and perform calculations using only zeros and ones.

// You need to make a program to convert integer numbers to their binary representation.
// Create a Converter class with a static toBinary() method, which returns the binary version of its argument.
// The code in main takes a number as input and calls the corresponding static method. Make sure the code works as expected.

// Sample Input:
// 42
// Sample Output:
// 101010

// You can use the following code to convert a number to binary:

// String binary="";
// while(num > 0) {
//    binary = (num%2)+binary;
//    num /= 2;
// }
// JAVA
// The code above uses a loop to convert num to binary and stores the result in the binary String.

package soloLearn.java;

import java.util.Scanner;

//your code goes here
class Converter {
    public static String toBinary(int num) {
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
        return binary;
    }
}

public class ex4_binaryConvertor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            System.out.print(Converter.toBinary(x));
        }
    }
}
