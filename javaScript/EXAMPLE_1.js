// Trip Planner
// You need to plan a road trip. You are traveling at an average speed of 40 miles an hour.
// Given a distance in miles as input (the code to take input is already present), output to the console the time it will take you to cover it in minutes.

// Sample Input:
// 150

// Sample Output:
// 225

// level
// Explanation: It will take 150/40 = 3.75 hours to cover the distance, which is equivalent to 3.75*60 = 225 minutes.

const speed = 40; // const speed 

function main() {
    // parseInt: converts a string to an integer of the specified radix (base)
    // reads a single line of text from standard input
    var dist = parseInt(readLine(), 10);

    // calc the time required in mins
    var timeInMinutes = (dist / speed) * 60;

    // output
    console.log(timeInMinutes);
}

// Node.js - a function will not execute unless its called explicitly or its an IIFE
// main(); // for local 