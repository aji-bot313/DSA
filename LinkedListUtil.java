public class LinkedListUtil {
    public static Node createList(int[] values) {
        if (values == null || values.length == 0) return null;
        Node head = new Node(values[0]);
        Node current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }
        return head;
    }
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }
    public static Node cloneList(Node head) {
        if (head == null) return null;
        Node newHead = new Node(head.data);
        Node curr = head.next;
        Node newCurr = newHead;
        while (curr != null) {
            newCurr.next = new Node(curr.data);
            newCurr = newCurr.next;
            curr = curr.next;
        }
        return newHead;
    }
}