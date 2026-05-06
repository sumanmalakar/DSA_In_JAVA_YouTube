class De_Queue {
    int arr[];
    int front, rear, n;

    De_Queue(int size) {
        arr = new int[size];
        front = -1;
        rear = 0;
        n = size;
    }

    // isFull
    boolean isFull() {
        return (front == 0 && rear == n - 1) || (front == rear + 1);
    }

    // isEmpty
    boolean isEmpty() {
        return front == -1;
    }

    // insertFromFront
    void insertFromFront(int element) {
        if (isFull()) {
            System.out.println("Queue is FUll");
            return;
        }
        if (front == -1) {
            front = rear = 0;
        } else if (front == 0) {
            front = n - 1;
        } else {
            front--;
        }

        arr[front] = element;

    }

    // insertFromRear
    void insertFromRear(int element) {
        if (isFull()) {
            System.out.println("Queue is FUll");
            return;
        }
        if (front == -1) {
            front = rear = 0;
        } else if (rear == n - 1) {
            rear = 0;
        } else {
            rear++;
        }

        arr[rear] = element;
    }

    // RemoveFromFront
    int removeFromFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int element = arr[front];

        if (front == rear) {
            element = arr[front];
            front = rear = -1;
        } else if (front == n - 1) {
            element = arr[front];
            front = 0;
        } else {
            front++;
        }

        return element;
    }

    // RemoveFromRear
    int removeFromRear(){
         if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int element = arr[rear];

        if (front == rear) {
            element = arr[rear];
            front = rear = -1;
        } else if(rear == 0){
            element = arr[rear];
           rear = 0;
        }else{
            rear--;
        }
        return element;
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
}

public class Dequeue {
    public static void main(String[] args) {
       De_Queue dq = new De_Queue(10);
       dq.insertFromFront(10);
       dq.insertFromFront(20);
       dq.print();
       dq.insertFromRear(30);
       dq.insertFromRear(40);
       dq.print();
       System.out.println(dq.removeFromFront());
       dq.print();
       System.out.println(dq.removeFromRear());
       dq.print();
    }
}
