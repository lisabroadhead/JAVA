class Node{
    constructor(value){
        this.value=value;
        this.next=undefined;
    }
};

class List {
    constructor(){
        this.head=undefined;
    }

    IsEmpty(node){
        if(this.head === undefined){
            return "empty";
        }else{
            return "Has values";
        }
    }

    /**
     * Creates a new node with the given data and inserts that node at the front
     * of this list.
     * @param {any} data The data for the new node.
     * @returns {SinglyLinkedList} This list.
     */
    
    insertAtFront(value) {
        let newNode = new Node(value);
        if(this.head === null){
            newNode = this.head;
        }else{
            var temp = this.head;
            this.head = newNode;
            this.head.next = temp;
        }
    }

    /**
     * Removes the first node of this list.
     * @returns {any} The data from the removed node.
     */
    removeHead() {
        let temp = this.head;
        this.head = this.head.next.next;
        temp.next = null;
    }

    // EXTRA
    /**
     * Calculates the average of this list.
     * @returns {number|NaN} The average of the node's data.
     */
    average() {
        var runner = this.head;
        var sum = 0, ct = 0;
        while(runner.next != null){
            sum += runner.value;
            runner = runner.next;
            ct++;
        }

        return sum / ct;
    }

    PushBack(value){
        let newNode=new Node(value);

        if(this.head === undefined){
            this.head = newNode;
        }else{
            var runner = this.head;

            while(runner.next != null){
                runner = runner.next;
            }

            runner.next=newNode;
        }
        return value;
    }

    PushBackN(arr){
        let newNode=new Node(arr[0]);
        var runner;
        
        if(this.head === undefined){
            this.head = newNode;
            runner = this.head;
        }else if(this.head.next === null){
            let newNewNode =new Node(arr[0]);
            this.head.next = newNewNode;
        }else{
            runner = this.head;
            while(runner.next != null){
                runner = runner.next;
            }
        }

        for(var i=0;i < arr.length; i++){
            let anotherNewNode =new Node(arr[i]);
            runner.next = anotherNewNode;
            runner = runner.next;
        } 
    }

    // LOOP THROUGH AND SHOW ALL VALUES
    showValues(){
        var runner = this.head;
        while(runner != null){
            console.log(runner.value);
            runner = runner.next;
        }
    }
}

let test_data1=123;
let test_data2=234;
let test_data3=345;
let test_data4=456;
let test_data5=567;
let test_data6=678;
let test_data7=[111,222,333,444,555];
let test_data8=[666,777,888,999,1010];

let list=new List();

// IS EMPTY
// console.log(list.IsEmpty());

//ADD TO BACK
list.PushBack(test_data3);
list.PushBack(test_data2);

// ADD ARRAY
// list.PushBackN(test_data7);
// list.PushBackN(test_data8);

// ADD TO FRONT
// list.insertAtFront(test_data1);
// list.insertAtFront(test_data2);
// list.insertAtFront(test_data3);
list.insertAtFront(test_data4);
list.insertAtFront(test_data5);
list.insertAtFront(test_data6);

// REMOVE HEAD
// list.removeHead();

// AVERAGE
// console.log("Average: " + list.average());

// SHOW VALUES IN LINKED LIST
list.showValues();