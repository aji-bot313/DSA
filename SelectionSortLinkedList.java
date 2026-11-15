public class SelectionSortLinkedList {

    public Node sort(Node head) {
        if (head == null || head.next == null) return head;

        Node current = head;
        while (current != null) {
            Node minNode = current;
            Node runner = current.next;
            while (runner != null) {
                if (runner.data < minNode.data) {
                    minNode = runner;
                }
                runner = runner.next;
            }
            int temp = current.data;
            current.data = minNode.data;
            minNode.data = temp;

            current = current.next;
        }
        return head;
    }
}