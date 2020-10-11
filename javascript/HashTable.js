class HashTable {
  constructor(size) {
    this.data = new Array(size);
  }

  _hash(key) { // private method
    let hash = 0;
    for (var i = 0; i < key.length; i++) {
      hash = (hash + key.charCodeAt(i) * i) % this.data.length
    }
    return hash;
  }

  checkIfKeyExists(key) {
    for (let item of this.data[this._hash(key)]) {
      if (item[0] == key) {
        return item;
      }
    }
    return undefined;
  }


  set(key, value) {
    //if address isn't empty check if key already exists, update if it does
    if (this.data[this._hash(key)] && this.checkIfKeyExists(key)) {
      this.checkIfKeyExists(key)[1] = value

    //if address isn't empty and key doesn't exist push k,v to bucket array
    } else if (this.data[this._hash(key)]) {
      this.data[this._hash(key)].push([key, value]);

    } else {
      this.data[this._hash(key)] = [[key, value]];
    }
  }


  get(key) {
    let bucket = this.data[this._hash(key)]
    // If bucket has more than one item
    if (bucket.length > 1) {
      for (let item of bucket) {
        if (item[0] == key) {
          return item[1]
        }
      }
    // if bucket only has one item
    } else if (bucket.length == 1) {
      return bucket[0][1];
    }
    // if key isn't found
    return undefined;
  }

  keys() {
    let keys = []
    for (let bucket of this.data) {
      if (bucket && bucket.length > 1) {
        for (let item of bucket) {
          keys.push(item[0]);
        }
      } else if (bucket) {
        keys.push(bucket[0][0]);
      }
    }
    return keys;
  }

}
