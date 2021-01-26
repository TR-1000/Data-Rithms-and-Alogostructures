let myString = "happy";



function reverseString(str) {
  // Without cheating
  // let rev = "";
  // for (i=str.length-1; i>=0; i--) {
  //   rev += str[i];
  // }
  // return(rev);

  return str.split("").reverse().join("");

}



console.log(reverseString(myString));
