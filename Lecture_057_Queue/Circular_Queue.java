class CicularQueue {
    int arr[];
    int front, rear, n;

    CicularQueue(int size) {
        arr = new int[size];
        front = rear = -1;
        n = size;
    }

    // isFUll
    boolean isFull() {
        return (rear + 1) % n == front;
    }

    // isEmpty
    boolean isEmpty(){
        return front == -1;
    }

    // enqueue
    void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(front == -1){
            front = 0;
        }

        rear = (rear + 1)%n;

        arr[rear] = element;
    }

    // dequeue
    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        
        if(rear == front){
            front = rear = -1;
            int element = arr[front];
            return element;
        }

        front = (front + 1)%n;

        return arr[front];
    }

    // print
    void print(){
         if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        int i = front;

        while (true) {
            System.out.print(arr[i]+" ");

            if(i == rear) break;

            i = (i+1)%n;
        }
        System.out.println();
    }

    // peek
    int peek(){
          if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }
}

public class Circular_Queue {
    public static void main(String[] args) {
     CicularQueue cq = new CicularQueue(10);
     cq.enqueue(10);
     cq.enqueue(20);
     cq.enqueue(30);
     cq.enqueue(40);
     cq.print();
     System.out.println(cq.peek());
     System.out.println(cq.dequeue());
     cq.print();
    }
}
