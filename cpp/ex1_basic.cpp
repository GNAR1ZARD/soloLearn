// Transportation
// You are making a program for a bus service.
// A bus can transport 50 passengers at once.
// Given the number of passengers waiting in the bus station as input,
// you need to calculate and output how many empty seats the last bus will have.

// Sample Input:
// 126

// Sample Output:
// 24

// Explanation: The first bus will transport 50 passengers, leaving 126-50=76 in the station.
// The next one will leave 26 in the station, thus, the last bus will take all of the 26 passengers,
// having 50-26=24 seats left empty.

#include <iostream>
const int BUS_SIZE = 50;
int main()
{
    // local var
    int input = 0;

    // std in
    std::cin >> input;

    // while input is less than bus size
    while (input > BUS_SIZE)
    {
        input = input - BUS_SIZE; // decrement input by bus size
    }
    int remainder = (BUS_SIZE - input); // set remainder 
    std::cout << remainder << "\n"; // output 

    return 0;
}