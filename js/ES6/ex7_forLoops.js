// Loops in ECMAScript 6
// Students need to score at least 70 points to pass an exam. 
// The given program declares an array with results.
// Write a program to count and output to the console the number of students who pass the exam.

let scores = [68, 95, 54, 84, 77, 75, 63, 74, 69, 80, 71, 63]

//your code goes here

const passingScore = 70;

// for 'of' loop iterates over iterable obj
// ES6 introduces a variety of for loops 
function count(scores) {
    let pass = 0;
    for (let val of scores) {
        if (val >= passingScore) {
            pass++;
        }
    }
    return pass;
}

console.log(count(scores));