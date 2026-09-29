public class Main {
    public static void main(String[] args) {
        Singly_Linked_List<String> list = new Singly_Linked_List<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("--- Initial List ---");
        list.display();
        System.out.println("Size: " + list.size());

        // Finding an element
        System.out.println("\n--- Finding Banana ---");
        Node<String> foundNode = list.find("Banana");
        if (foundNode != null) {
            System.out.println("Found: " + foundNode.get_data());
        } else {
            System.out.println("Not found");
        }

        // Removing an element
        System.out.println("\n--- Removing Banana ---");
        list.remove("Banana");
        list.display();
        System.out.println("New Size: " + list.size());
    }
}