public class QuickSortLinkedList {

    public Node sort(Node head) {
        return quickSort(head, getTail(head));
    }

    private Node getTail(Node head) {
        while (head != null && head.next != null) {
            head = head.next;
        }
        return head;
    }

    private Node quickSort(Node head, Node tail) {
        if (head == null || head == tail) return head;

        Node[] partition = partition(head, tail);
        Node newHead = partition[0];
        Node pivot = partition[1];
        Node pivotNext = pivot.next;
        pivot.next = null;

        if (newHead != pivot) {
            Node temp = newHead;
            while (temp.next != pivot) temp = temp.next;
            temp.next = null;

            Node left = quickSort(newHead, temp);
            Node temp2 = left;
            while (temp2.next != null) temp2 = temp2.next;
            temp2.next = pivot;
            pivot.next = quickSort(pivotNext, getTail(pivotNext));
            return left;
        } else {
            pivot.next = quickSort(pivotNext, getTail(pivotNext));
            return pivot;
        }
    }

    private Node[] partition(Node head, Node tail) {
        Node pivot = tail;
        Node prev = null, current = head, newHead = null;

        while (current != pivot) {
            if (current.data < pivot.data) {
                if (newHead == null) newHead = current;
                prev = current;
                current = current.next;
            } else {
                if (prev != null) prev.next = current.next;
                Node temp = current.next;
                current.next = null;
                Node tailNext = pivot.next;
                pivot.next = current;
                // Move pivot forward
                current.next = tailNext;
                current = temp;
            }
        }
        if (newHead == null) newHead = pivot;
        return new Node[]{newHead, pivot};
    }
}