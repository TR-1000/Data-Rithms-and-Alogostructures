class Node {
  constructor(value){
    this.value = value;
    this.next = null;
  }
}

class Stack {
  constructor(){
    this.top = null;
    this.bottom = null;
    this.length = 0;
  }

  push(value){
    let newNode = new Node(value);
    if (this.length == 0) {
      this.top = newNode;
      this.bottom = newNode;
    } else {
      newNode.next = this.top;
      this.top = newNode;
    }
    this.length++;
  }

  peek(){
    return this.top;
  }

  pop(){
    let topNode = this.top;
    this.top = this.top.next;
    this.length--;
    return topNode;
  }

  empty(){
    this.top = null;
    this.bottom = null;
    this.length = 0;
  }




};

let myStack = new Stack();

myStack.push('apple');

myStack.push('caramel');

myStack.push('sprinkles');

myStack.push('chocolate');

myStack.push('bananas')

console.log(myStack.pop());

console.log(myStack.peek());

console.log(myStack);

myStack.empty();

console.log(myStack);

myStack.push('chocolate');

console.log(myStack);
