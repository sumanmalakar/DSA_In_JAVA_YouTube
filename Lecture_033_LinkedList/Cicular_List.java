class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class List{
    Node head = null;
    
    // insert At Beginning
    void insertAtBegining(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }
    // insert At end
    void insertAtEnd(int data){
            Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    // print list
    void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while(temp != head);
        System.out.println();
    }
    // deleteHead
    void deleteHead(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == head){
            head = null; return;
        }
        Node temp = head;

        while(temp.next != head){
            temp = temp.next;
        }
        head = head.next;
        temp.next = head;
    }
    // deleteEnd
    void deleteEnd(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == head){
            head = null; return;
        }
        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
    }
}
public class Cicular_List {
    public static void main(String[] args) {
        List cl = new List();
        cl.insertAtBegining(10);
        cl.insertAtBegining(20);
        cl.insertAtBegining(30);
        cl.insertAtBegining(40);
        cl.print();
        cl.insertAtEnd(50);
        cl.print();
        cl.deleteHead();
        cl.print();
        cl.deleteEnd();
        cl.print();
    }
    
}
