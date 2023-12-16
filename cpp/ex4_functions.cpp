// Palindrome Numbers
// A palindromic number is a number (such as 626) that remains the same when its digits are reversed.
// Write a function that returns true if a given number is a palindrome, and false, if it is not.
// Complete the given function, so that the code in main works and results in the expected output.

// Sample Input:
// 13431

// Sample Output:
// 13431 is a palindrome

#include <iostream>
#include <string>

// prototypes
bool isPalindrome(int);

// driver code
int main()
{
    int n;
    std::cin >> n;

    if (isPalindrome(n))
    {
        std::cout << n << " is a palindrome";
    }
    else
    {
        std::cout << n << " is NOT a palindrome";
    }
    return 0;
} // end main

// func defintions
bool isPalindrome(int x)
{
    std::string temp = std::to_string(x); // convert int to string

    bool flag = false;
    // compare opposite indicies and see if theyre eq
    for (int i = 0, j = (temp.length() - 1); i < temp.length(); i++, j--)
    {
        // std::cout << i << " " << temp[i] << " " << j << " " << temp[j] << "\n";
        if (temp[i] == temp[j])
        {
            flag = true; // set flag to true
            // std::cout << "flag = true\n";
        }
        else
        {
            flag = false;
            // std::cout << "flag = false\n";
            break;
        }
    }

    // if palindrome, return true
    // else return false
    if (flag == true)
    {
        return flag;
    }
    else
        return flag;
} // end func