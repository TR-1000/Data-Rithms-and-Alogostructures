// # of nodes = 2^h-1
// log nodes = height

class Node{
  constructor(value){
    this.value = value;
    this.left = null;
    this.right = null;
  }

}

class BinarySearchTree {
  constructor(){
    this.root = null;
  }

  insert(value){
    if (this.root == null) {
      this.root = new Node(value);
    } else {
      let currentNode = this.root;
      while (true) {
        if (value < currentNode.value) {
          if (!currentNode.left) {
            currentNode.left = new Node(value);
            return this;
          } else {
            currentNode = currentNode.left;
          }
        } else {
          if (!currentNode.right) {
            currentNode.right = new Node(value)
            return this;
          } else {
            currentNode = currentNode.right;
          }
        }
      }
    }
  }


  lookup(value){
    let currentNode = this.root;
    while (true) {
      if (currentNode.value == value) {
        return true;
      } else if (value < currentNode.value) {
        if (!currentNode.left) {
          return false;
        } else {
          currentNode = currentNode.left;
        }
      } else {
        if (!currentNode.right) {
          return false;
        } else {
          currentNode = currentNode.right;
        }
      }
    }
  }

}


let tree = new BinarySearchTree();
tree.insert(9)
tree.insert(4)
tree.insert(6)
tree.insert(20)
tree.insert(170)
tree.insert(15)
tree.insert(1)
console.log(JSON.stringify(traverse(tree.root), undefined, 4));
console.log(tree.lookup(2))

function traverse(node) {
  const tree = { value: node.value };
  tree.left = node.left === null ? null : traverse(node.left);
  tree.right = node.right === null ? null : traverse(node.right);
  return tree;
}
