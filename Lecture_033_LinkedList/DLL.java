class Node{
    int data; 
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class List{
    Node head = null;
    Node tail = null;
    
    // insertAtHead
    void insertAtHead(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode; return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    // insertAtTail
    void insertAtTail(int data){
        Node newNode = new Node(data);
        if(tail == null){
            head = tail = newNode; return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    // print forward
    void printForward(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
        System.out.print(temp.data+" ");
        temp = temp.next;
        }
        System.out.println();
    }
    // print Backward
        void printBackward(){
        if(tail == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = tail;
        while (temp != null) {
        System.out.print(temp.data+" ");
        temp = temp.prev;
        }
        System.out.println();
    }
    // insertAtPosition
    void insertAtPosition(int position, int data){
        if(position <= 0){
            System.out.println("Invalid Position");
            return;
        }
        if(position == 1){
            insertAtHead(data); return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 1;
        while (i<position - 1 && temp != null) {
            temp = temp.next;
            i++;
        }
        if(temp == null){
            System.out.println("Position out of range");
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }
    // delete at head
    void deleteAtHead(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }
    // deleteAtTail
    void deleteAtTail(){
        if(tail == null){
            System.out.println("List is empyt");
            return;
        }
        if(head == tail){
            head = tail = null;
        }
        tail = tail.prev;
        tail.next = null;
    }
    // delete at position
    void deleteAtPositoin(int position){
        if(head == null || position <=0 ){
            System.out.println("Invalide position or list is empty");
            return;
        }
       
        if(position == 1){
            deleteAtHead();
            return;
        }
        Node temp = head;
        int i = 1;
        while (temp != null && i < position - 1) {
            temp = temp.next;
            i++;
        }

        if(temp == null){
            System.out.println("Position out of range");
            return;
        }
        
        Node nodeToDelete = temp.next;
        
        temp.next = nodeToDelete.next; // temp.next.next;

        if(nodeToDelete.next != null){
            nodeToDelete.next.prev = temp;
        }
    }
 
    
    
}
public class DLL {
    public static void main(String[] args) {
        List dl = new List();
        dl.insertAtHead(10);
        dl.insertAtHead(20);
        dl.insertAtHead(30);
        dl.insertAtHead(40);
        // dl.printForward();
        // dl.printBackward();
        dl.printForward();
        dl.insertAtTail(50);
        dl.printForward();
        dl.insertAtPosition(3, 100);
        dl.printForward(); 
        dl.insertAtPosition(6, 200);
        dl.printForward();
        dl.deleteAtHead();
        dl.printForward();
         dl.deleteAtHead();
        dl.printForward();
        dl.deleteAtTail();
        dl.printForward();
        dl.deleteAtPositoin(2);
        dl.printForward();
        dl.deleteAtPositoin(3);
        dl.printForward();
  


    }
    
}
