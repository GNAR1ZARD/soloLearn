/*  You can exit and re-enter generator functions
    and their variable bindings will be saved across re-entrances 
*/

// init array of string numbers and letters
const arr = ['0', '1', '4', 'a', '9', 'c', '16'];

// object with a custom iterator using generator function
const my_obj = {
  [Symbol.iterator]: function* () {
    for (let index of arr) {
      // yield each element of the array as a string:
      // when the generator is subsequently called by the iterator 
      // it resumes execution right after the yield statement 
      // where it was previously paused
      yield `${index}`;
    }
  }
};

// spread the object into an array, parse each element to an integer, 
// take the square root, filter out numbers less than 5, and sum them up
const all = [...my_obj] // spread the iterable object into an array of strings
  .map(i => parseInt(i, 10)) // parse each element to an int base 10
  .map(Math.sqrt) // take the sqrt of each number
  .filter((i) => i < 5) // filter numbers to include only those less than 5
  .reduce((i, d) => i + d); // sum up the remaining numbers

// output the result of the reduce operation
console.log(all);
