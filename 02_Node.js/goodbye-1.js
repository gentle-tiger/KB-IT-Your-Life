// function sumAll() {
//   let sum = 0;

//   for (let i = 0; i < arguments.length; i++) {
//     sum += arguments[i];
//   }
//   let argsString = Array.from(arguments).join(', ');

//   console.log(argsString);
//   return sum;sdf
// }

// console.log('sum All : ', sumAll(1, 2, 3, 4, 5, 6, 7, 8, 9));

function sumAll(...args) {
  return args.reduce((sum, current) => sum + current, 0);
}

console.log('sum All : ', sumAll(1, 2, 3, 4, 5, 6, 7, 8, 9)); // Output: sum All : 45
