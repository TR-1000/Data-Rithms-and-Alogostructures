// const basket = ['apples', 'grapes', 'pears']
//
// linked list: apples --> grapes --> pears
//
// apples
// 8947 --> grapes
//           8742 --> pears
//                     372 --> null

// Create the below linked list:
// 10-->5--16
// let myLinkedList = {
//   head: {
//     value: 10,
//     next: {
//       value: 5,
//       next: {
//         value: 16,
//         next: null
//       }
//     }
//   },
//   length:3
// };


class Node {
  constructor(value) {
    this.value = value;
    this.next = null;
  };
};



class LinkedList {
  constructor(value) {
    this.head = {
      value: value,
      next: null
    };
    this.tail = this.head;
    this.length = 1;
  };

  append(value) {
    let newNode = new Node(value);
    this.tail.next = newNode;
    this.tail = newNode;
    this.length++;
  };

  prepend(value) {
    let newNode = new Node(value);
    newNode.next = this.head;
    this.head = newNode;
    this.length++;
  };

  get(index) {
    if (index == 0) {
      return this.head;
    } else if (index == this.length-1) {
      return this.tail;
    } else if (index > this.length) {
      return undefined;
    } else {
      let currentNode = this.head.next;
      let count = 1;
      while (count < index) {
        currentNode = currentNode.next;
        count++;
      };
      return currentNode;
    };
  };

  insert(value, index) {
    if(index == 0) {
      this.prepend(value);
    } else if (index == this.length-1) {
      this.append(value);
    } else {
      let currentNode = this.get(index)
      let precedingNode = this.get(index-1)
      let newNode = new Node(value);
      newNode.next = currentNode;
      precedingNode.next = newNode;
      this.length++;
      return this.get(index);
    };
  };

  update(value, index) {
    this.get(index).value = value;
  }

  remove(index) {
    if (index < 0 || index > this.length-1) {
      return undefined;
    } else {
      if(index == 0) {
        this.head = this.head.next;
      } else if (index == this.length-1) {
        let targetNode = this.get(index-1);
        targetNode.next = null;
      } else {
        let targetNode = this.get(index-1);
        targetNode.next = this.get(index).next;
      }
      this.length--;
    };
  };

  getNodeValues() {

    let nodeArray = [];
    let currentNode = this.head;
    do {
      nodeArray.push(currentNode.value);
      currentNode = currentNode.next;
    } while (currentNode != null);
    return nodeArray;
  };

  reverse() {
    let reverseArray = this.getNodeValues().reverse();
    let newList = new LinkedList(reverseArray[0])
    for(let i=1; i<reverseArray.length; i++) {
      newList.append(reverseArray[i]);
    };
    return newList;
  }


};

let myLinkedList = new LinkedList(10);
myLinkedList.append(5);
myLinkedList.append(16);
myLinkedList.prepend(11);
console.log(myLinkedList.getNodeValues());

myLinkedList.insert(1, 1);
console.log(myLinkedList.getNodeValues());

myLinkedList.insert(20, 3);
console.log(myLinkedList.getNodeValues());

myLinkedList.update(18, 2);
console.log(myLinkedList.getNodeValues());

console.log(myLinkedList.reverse());
