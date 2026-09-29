public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(new Bird("Eagle"));
        list.append(new Car("Amphibian"));
        list.append(new Bird(99));

        System.out.println("Original list:");
        list.print();

        System.out.println("After deleteFirst():");
        list.deleteFirst();
        list.print();

        System.out.println("After deleteLast():");
        list.deleteLast();
        list.print();
    }
}