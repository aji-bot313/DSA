public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(char value) {
        Node newNode = new Node(value);
        newNode.setPreviousNode(top);
        top = newNode;
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        char val = top.getValue();
        top = top.getPreviousNode();
        return val;
    }

    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }
}