class Node {
    int data;
    Node next;

    // constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class List {
    Node head = null;
    Node tail = null;

    // insertAtHead
    void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // print
    void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // insertAtTail
    void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // insertAtPosition
    void insertAtPosition(int position, int data) {
        if (position <= 0) {
            System.out.println("Invalid Postion");
            return;
        }
        if (position == 1) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 1;

        while (i < position - 1 && temp != null) {
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // delete Head
    void deleteHead() {
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    // delete Tail
    void deleteTail() {
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    // delete at position
    void deleteAtPosition(int position) {
        if (position <= 0) {
            System.out.println("Invalide postion");
            return;
        }
        if (position == 1) {
            deleteHead();
            return;
        }
        Node temp = head;
        int i = 1;

        while (i < position - 1 && temp != null) {
            temp = temp.next;
            i++;
        }
        if (temp.next == tail) {
            tail = temp;
        }
        temp.next = temp.next.next;

    }

    // length of list
    int lengthOfList() {
        if (head == null)
            return 0;

        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

}

public class Index {
    public static void main(String[] args) {
        List l1 = new List();
        l1.insertAtHead(10);
        l1.insertAtHead(20);
        l1.insertAtHead(30);
        l1.insertAtHead(40);
        l1.print();
        l1.insertAtTail(50);
        l1.insertAtTail(60);
        l1.print();
        l1.insertAtPosition(2, 100);
        l1.print();
        l1.insertAtPosition(7, 700);
        l1.print();
        l1.deleteHead();
        l1.print();
        l1.deleteTail();
        l1.print();
        l1.deleteTail();
        l1.print();
        l1.deleteAtPosition(5);
        l1.print();
        System.out.println(l1.lengthOfList());
    }

}