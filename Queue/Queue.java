public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }
    public void enqueue(char value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNextNode(newNode);
            newNode.setPreviousNode(rear);
            rear = newNode;
        }
    }
    public char dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        char val = front.getValue();
        front = front.getNextNode();
        if (front == null) {
            rear = null;
        } else {
            front.setPreviousNode(null);
        }
        return val;
    }
    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return front.getValue();
    }
    public boolean isEmpty() {
        return front == null;
    }
}