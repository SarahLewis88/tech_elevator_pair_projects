/**
 * All named functions will have the function keyword and
 * a name followed by parentheses.
 * 
 * @returns {number} 1
 */
function returnOne() {
  return 1;
}

/**
 * Functions can also take parameters. These are just variables that are filled
 * in by whoever is calling the function.
 *
 * Also, we don't *have* to return anything from the actual function.
 *
 * @param {any} value the value to print to the console
 */
function printToConsole(value) {
  console.log(value);
}

/**
 * Write a function called multiplyTogether that multiplies two numbers together. But 
 * what happens if we don't pass a value in? What happens if the value is not a number?
 *
 * @param {number} firstParameter the first parameter to multiply
 * @param {number} secondParameter the second parameter to multiply
 */
function multiplyTogether(firstParameter, secondParameter) {
  return firstParameter * secondParameter;
}

console.log(multiplyTogether(5,2, 3));


/**
 * This version makes sure that no parameters are ever missing. If
 * someone calls this function without parameters, we default the
 * values to 0. However, it is impossible in JavaScript to prevent
 * someone from calling this function with data that is not a number.
 * Call this function multiplyNoUndefined
 *
 * @param {number} [firstParameter=0] the first parameter to multiply
 * @param {number} [secondParameter=0] the second parameter to multiply
 */
function multiplyNoUndefined(firstParameter = 0, secondParameter = 0) {
  return firstParameter * secondParameter;
}

console.log(multiplyNoUndefined(5));


/**
 * This method does something cool!
 * 
 * @param {Number} firstParameter This is the first number
 * @param {Number} secondParameter This is the second number
 * @returns - multiplies 2 numbers or adds two numbers
 */

function returnBeforeEnd(firstParameter, secondParameter) {
  console.log("This will always fire.");

  if (firstParameter == 0) {
    console.log("Returning secondParameter times two.");
    return secondParameter * 2;
  }

  //this only runs if firstParameter is NOT 0
  console.log("Returning firstParameter + secondParameter.");
  return firstParameter + secondParameter;
}



/**
 * Scope is defined as where a variable is available to be used.
 *
 * If a variable is declare inside of a block, it will only exist in
 * that block and any block underneath it. Once the block that the
 * variable was defined in ends, the variable disappears.
 */
function scopeTest() {
  // This variable will always be in scope in this function
  let inScopeInScopeTest = true;

  {
    // this variable lives inside this block and doesn't
    // exist outside of the block
    let scopedToBlock = inScopeInScopeTest;
  }

  // scopedToBlock doesn't exist here so an error will be thrown
  if (inScopeInScopeTest && scopedToBlock) {
    console.log("This won't print!");
  }
}


/**
 * STEVE NOTE:
 * WALK THRU ANONYMOUS FUNCTIONS HERE IN CHRONOLOGICAL ORDER OF
 * HOW TO CREATE THEM FROM NAMED FUNCTIONS
 * 
 * 1. anonymous functions
 * 2. arrow operator
 */

let x = (a,b) => {
  return a + b;
}



let y = (fn) => {
  return fn(1,2) + fn(2,2) + fn(2,4);
} 

console.log(y(x));    




// const myName =  (name) => {
//   return "My name is: " + name; 
// }

//console.log(myName("Steve"));


// let xyz = (name) => {
//   return name;
// }



let beers = ['Corona', 'Bud', 'Skunky', 'Free', 'Heineken'];

for (let i=0; i< beers.length; i++) {
 // console.log(beers[i]);
}

beers.forEach(output);

function output(item, index, array) {

//   console.log("Beer" + index + ": " + item );
}


let newbeers = ['Corona', 'Bud', 'Skunky', 'Free', 'Heineken'];

newbeers.forEach((item, index, array) => {
//  console.log("Beer" + index + ": " + item );
});




const stevesFavoriteBeer = newbeers.map((item, index, array) => {
  if (item == 'Free') {
    return item + " is my favorite type of beer!";
  }
  else {
    return item;
  }
});

console.log(stevesFavoriteBeer);



/**
 * Takes an array and, using the power of anonymous functions, generates
 * their sum.
 *
 * @param {number[]} numbersToSum numbers to add up
 * @returns {number} sum of all the numbers
 */
function sumAllNumbers(numbersToSum) {
  return numbersToSum.reduce(
    /**
     * Add each number to the previous sum using reduce
     */
    (sum, number) => {
      return sum + number;
    }
  );
}


const numbers = [10,5,5,3,5,2,27,6];
const res1 = sumAllNumbers(numbers);
console.log(res1);


/**
 * Takes an array and returns a new array of only numbers that are
 * multiples of 3
 *
 * @param {number[]} numbersToFilter numbers to filter through
 * @returns {number[]} a new array with only those numbers that are
 *   multiples of 3
 */
function allDivisibleByThree(numbersToFilter) {
  return numbersToFilter.filter((number) => {
    return number % 3 === 0;
  });
}

console.log(allDivisibleByThree(numbers));

/**
 * Takes an array and generates their sum. Uses non-anonymous function.
 *
 * @param {number[]} numbersToSum numbers to add up
 * @returns {number} sum of all the numbers
 */
function sumAllNumbersNonAnon(numbersToSum) {
  return numbersToSum.reduce(addNumbers);
}

function addNumbers(sum, number) {
  return sum + number;
}

/**
 * Takes an array and returns a new array of only numbers that are
 * multiples of 3, and uses a non-anonymous function.
 *
 * @param {number[]} numbersToFilter numbers to filter through
 * @returns {number[]} a new array with only those numbers that are
 *   multiples of 3
 */
function allDivisibleByThreeNonAnon(numbersToFilter) {
  return numbersToFilter.filter(isDivisibleByThree);
}

function isDivisibleByThree(number) {
  return number % 3 === 0;
}


/**
 * JSDoc Example
 *
 * Take the details of a person and create an English readable sentence
 * that uses that information to describe them. We join the quirks together
 * with the separator, or `, ` by default.
 *
 * @param {string} name the name of the person we're describing
 * @param {number} age the age of the person
 * @param {string[]} [listOfQuirks] a list of funny quirks that we'll list out
 * @param {string} [separator=', '] the string to separate the quirks by
 * @returns {string} the full descriptive string
 */
function createSentenceFromUser(name, age, listOfQuirks = [], separator = ', ') {
  let description = `${name} is currently ${age} years old. Their quirks are: `;
  return description + listOfQuirks.join(separator);
}