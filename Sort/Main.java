public class Main {
    public static void main(String[] args) {
        int[] values = {64, 25, 12, 22, 11, 90, 45, 33};

        Node original = LinkedListUtil.createList(values);
        System.out.println("Original List: ");
        LinkedListUtil.printList(original);
        System.out.println();

        // Bubble Sort
        Node bubbleCopy = LinkedListUtil.cloneList(original);
        BubbleSortLinkedList bubbleSort = new BubbleSortLinkedList();
        bubbleCopy = bubbleSort.sort(bubbleCopy);
        System.out.println("Bubble Sort: ");
        LinkedListUtil.printList(bubbleCopy);

        // Selection Sort
        Node selectionCopy = LinkedListUtil.cloneList(original);
        SelectionSortLinkedList selectionSort = new SelectionSortLinkedList();
        selectionCopy = selectionSort.sort(selectionCopy);
        System.out.println("Selection Sort: ");
        LinkedListUtil.printList(selectionCopy);

        // Insertion Sort
        Node insertionCopy = LinkedListUtil.cloneList(original);
        InsertionSortLinkedList insertionSort = new InsertionSortLinkedList();
        insertionCopy = insertionSort.sort(insertionCopy);
        System.out.println("Insertion Sort: ");
        LinkedListUtil.printList(insertionCopy);

        // Merge Sort
        Node mergeCopy = LinkedListUtil.cloneList(original);
        MergeSortLinkedList mergeSort = new MergeSortLinkedList();
        mergeCopy = mergeSort.sort(mergeCopy);
        System.out.println("Merge Sort: ");
        LinkedListUtil.printList(mergeCopy);

        // Quick Sort
        Node quickCopy = LinkedListUtil.cloneList(original);
        QuickSortLinkedList quickSort = new QuickSortLinkedList();
        quickCopy = quickSort.sort(quickCopy);
        System.out.println("Quick Sort: ");
        LinkedListUtil.printList(quickCopy);
    }
}