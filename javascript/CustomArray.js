class CustomArray {
  constructor() {
    this.length = 0;
    this.data = {};
  }

  get(index) {
    return this.data[index];
  }

  set(index, value) {
    if (!this.data[index]) {
      this.length++;
    }
    this.data[index] = value;

  }

  push(value) {
    this.set(this.length, value);
  }

  pop() {
    let lastItem = this.data[this.length-1];
    delete this.data[this.length-1];
    this.length--;
    return lastItem;
  }


}

let myArray = new CustomArray();
myArray.set(1, 'chicken');
myArray.set(0, 'turkey');
myArray.push('duck');
myArray.set(2, 'hen');
myArray.push('duck');

console.log(myArray.pop());
console.log(myArray);
