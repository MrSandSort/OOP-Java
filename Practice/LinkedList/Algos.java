package Practice.LinkedList;

// node--> current [head]--> 

public class Algos {

 public static void main(String[] args){
    
 CustomLinkedList linkedList= new CustomLinkedList();

 Node firstNode= new Node(3);
 Node secondNode= new Node(4);
 Node thirdNode= new Node(5);
 Node fourthNode= new Node(9);

 linkedList.head= firstNode;
 firstNode.next= secondNode;
 secondNode.next= thirdNode;
 thirdNode.next= fourthNode;

 linkedList.displayContents();
 linkedList.deleteHalfContents();
 linkedList.displayContents();
 linkedList.addNodeValue();

 }
    

 

    
}
