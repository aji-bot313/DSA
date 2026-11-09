public class Node {
    private final char value;
    private Node previousNode;

    public Node(char value) {
        this.value = value;
        this.previousNode = null;
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
}