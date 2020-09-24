let boxes = ['a','b','c','d','e'];

function logArrayPairs(array) {
  for (box of array) {
    for (box_pair of array) {
      console.log(`${box},${box_pair}`);
    }
  }
}

// logArrayPairs(boxes);

nums = [1,2,3,9]

function containsSum(array, targetSum) {
  for (let i=0; i < array.length; i++) {
    for (let j=(i+1); j < array.length; j++) {
      console.log(`sum: ${array[i]} + ${array[j]} = ${array[i] + array[j]}`);
      if ((array[i]+array[j]) == targetSum) {
        return true;
      }
    }
  }
  return false;
}

console.log(containsSum(nums, 8));

/* What did we learn from this?
  -know what your code does before you run it!!!!
  -loop fundementals
  -return stopping your loop prematurely */
