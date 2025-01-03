// ES6 Variables and Strings
// You need to make country cards for a school project.
// The given program takes the country and its capital name as input.
// Complete the function to return a string in the format you are given in the sample output:

// Sample Input
// Portugal
// Lisbon

// Sample Output
// Name: Portugal, Capital: Lisbon

function main() {
    var country = readLine();
    var capital = readLine();

    console.log(countryCard(country, capital));
}

function countryCard(country, capital) {
    //complete the function
    //use backtick (` `) for template literal

    return `Name: ${country}, Capital: ${capital}`;
}