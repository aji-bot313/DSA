public class InsertionSortLinkedList {

    public Node sort(Node head) {
        if (head == null || head.next == null) return head;

        Node sorted = null;  
        Node current = head;

        while (current != null) {
            Node next = current.next;
            sorted = insertSorted(sorted, current);
            current = next;
        }
        return sorted;
    }

    private Node insertSorted(Node sortedHead, Node newNode) {
        if (sortedHead == null || newNode.data < sortedHead.data) {
            newNode.next = sortedHead;
            return newNode;
        }
        Node current = sortedHead;
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return sortedHead;
    }
}