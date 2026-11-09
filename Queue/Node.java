public class Node {
    public char value;
    public Node previousNode;
    public Node nextNode;

    public Node(char value) {
        this.value = value;
        this.previousNode = null;
        this.nextNode = null;
    }

    public char getValue() {
        return this.value;
    }

    public Node getPreviousNode() {
        return this.previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    public Node getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}