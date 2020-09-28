function mergeSortedArrays(arr1, arr2) {
  let mergeSortedArray = [];
  arr2Index = 0;
  for (var i = 0; i < arr1.length; i++) {
    if ((arr1[i] < arr2[arr2Index]) || !arr2[arr2Index]) {
      mergeSortedArray.push(arr1[i]);
      console.log("pushing "+ arr1[i] + " at the top of for loop");
    } else {
      do {
        mergeSortedArray.push(arr2[arr2Index]);
        console.log("pushing "+ arr2[arr2Index] + " do..");
        arr2Index++;
      } while (arr1[i] >= arr2[arr2Index]);
      mergeSortedArray.push(arr1[i]);
      console.log("pushing "+ arr1[i] + " after while loop");
    }
  }
  if (arr2[arr2Index]) {
    mergeSortedArray = mergeSortedArray.concat(arr2.slice(arr2Index))
  }



  console.log(mergeSortedArray);

}




mergeSortedArrays([4,6,30,31,35,67,100,300], [4,21,23,24,25,30,200])
