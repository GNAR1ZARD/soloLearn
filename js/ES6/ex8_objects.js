// ES6 Objects
// You are making a workout app. 
// After completing the basic exercises in the app, 
// the user is able to access advanced content.
// The given program declares two classes - basic and advanced with corresponding properties. 
// Complete the code to combine basic and advanced level exercises into one new object named total, 
// so that the given code for final output works correctly.

let basic = {
    ex1: 'PushUps: 20 times',
    ex2: 'Jumps: 20 times'
};
let advanced = {
    ex3: 'Squats: 30 times',
    ex4: 'Run: 2km'
};

//your code goes here

// combine both objects properties into total
let total = Object.assign({}, basic, advanced);

// the for...in loop is intended for iterating over the enumerable keys of an object
for(let ex in total) {
    console.log(total[ex])
};