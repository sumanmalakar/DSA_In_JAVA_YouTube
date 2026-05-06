class Queue {
    int arr[];
    int front, rear, size, capacity;

    // constructor
    Queue(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
        front = 0;
        rear = -1;
        size = 0;
    }

    // isFull
    boolean isFull() {
        return size == capacity;
    }

    // isEmpty
    boolean isEmpty() {
        return size == 0;
    }

    // Enqueue ( Insert Element )
    void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is already full");
            return;
        }

        arr[++rear] = element;
        size++;
    }

    // Dequeu ( Remove Element )
    int dequeu(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int element = arr[front++];
        size--;
        return element;

    }
    
    // peek ( Top most element )
    int peek(){
         if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    // print
    void print(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i = front; i<= rear; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}

public class Index {
    public static void main(String[] args) {
    Queue q = new Queue(10);
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.enqueue(50);
    q.print();
    System.out.println(q.peek());
    System.out.println(q.dequeu());
    q.print();
    q.enqueue(60);
    q.print();

    }
}
