//Google Question
//Given an array = [2,5,1,2,3,5,1,2,4]:
//It should return 2

//Given an array = [2,1,1,2,3,5,1,2,4]:
//It should return 1

//Given an array = [2,3,4,5]:
//It should return undefined

function firstRecurringNumber (arr) {
  let numbers = {}
  for (var num of arr) {
    if (numbers[num]) {
      console.log("first recurring number is " + num)
      return num;
    } else {
      numbers[num] = true;
    }
  }
  console.log("no recurring numbers")
  return undefined;
}


console.log(firstRecurringNumber([2,3,4,5]));
