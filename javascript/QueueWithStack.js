
class QueueWithStack {
  constructor(){
    this.stack1 = [];
    this.stack2 = [];
  }

  enqueue(value) {
    if (this.stack1.length == 0) {
      this.stack1.push(value);
    } else {
      while (this.stack1[0]) {
        this.stack2.push(this.stack1.pop());
      }

      this.stack1.push(value)

      while (this.stack2[0]) {
        this.stack1.push(this.stack2.pop());
      }
    }
  }

  dequeue() {
    const first = this.stack1.pop();
    return first;
  }

  peek() {
    return this.stack1[this.stack1.length-1]
  }

  empty() {
    this.stack1 = [];
  }

}

let myQueue = new QueueWithStack();
myQueue.enqueue('pancake_1');
myQueue.enqueue('pancake_2');
myQueue.enqueue('pancake_3');
myQueue.enqueue('pancake_4');
console.log(myQueue);
console.log(myQueue.dequeue());
console.log(myQueue);
console.log(myQueue.peek());

// let myArrayStack = new Stack();
// myArrayStack.push('pancake_1');
// myArrayStack.push('pancake_2');
// myArrayStack.push('pancake_3');
// myArrayStack.push('pancake_4');
// console.log(myArrayStack.pop());
// console.log(myArrayStack.pop());
// console.log(myArrayStack);
// console.log(myArrayStack());
