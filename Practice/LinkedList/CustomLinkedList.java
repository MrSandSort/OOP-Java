package Practice.LinkedList;

public class CustomLinkedList {
    Node head;
    public Node next;

    public void displayContents() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + "-->");
            current = current.next;
        }

        System.out.println();

    }


    public void deleteHalfContents(){
        if(head== null || head.next== null){
            head= null;
        }

        Node fast= head;
        Node slow= head;
        Node prev= null;

        while(fast!=null && fast.next!=null){
            fast= fast.next.next;
            prev= slow;
            slow= slow.next;
        }
        prev.next= null;
    }

    public void addNodeValue(){
        int sum=0;
        
        while(head!=null){
          sum+= head.value;
          head= head.next;
        }
        System.out.println("Sum of items in a linked list is: "+ sum);
    }
 
}
