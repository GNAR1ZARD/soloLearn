// Rest & Spread
// You are making a program to calculate the sum of any number of values.
// Complete the given function so that it takes as parameters 
// as many numbers as needed and returns the sum.

//complete the function
function Add() {
    let total = 0;
    // arguments object allows access to all values passed as params
    for (let i = 0; i < arguments.length; i++) {
        total += arguments[i];
    }
    return total;
}

console.log(Add(1, 2, 3));
console.log(Add(4, 14, 5, 9, 14));
console.log(Add(2, 36));