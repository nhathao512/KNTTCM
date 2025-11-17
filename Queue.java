public class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void enqueue(int value) {
        if (nItems < maxSize) {
            if (rear == maxSize - 1) {
                rear = -1; // wrap around
            }
            queueArray[++rear] = value;
            nItems++;
        } else {
            System.out.println("Queue is full");
        }
    }

    public int dequeue() {
        if (nItems > 0) {
            int temp = queueArray[front++];
            if (front == maxSize) {
                front = 0; // wrap around
            }
            nItems--;
            return temp;
        } else {
            System.out.println("Queue is empty");
            return -1; // Indicating queue is empty
        }
    }

    public int peekFront() {
        if (nItems > 0) {
            return queueArray[front];
        } else {
            System.out.println("Queue is empty");
            return -1; // Indicating queue is empty
        }
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element is: " + queue.peekFront());
        System.out.println("Dequeued element is: " + queue.dequeue());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
