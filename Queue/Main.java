import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Queue Operations Menu ===");
        Queue queue = new Queue();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n-----------------------------");
                System.out.println("1. Enqueue (Add)");
                System.out.println("2. Dequeue (Remove)");
                System.out.println("3. Peek (View front)");
                System.out.println("4. Check if Empty");
                System.out.println("5. Quit");
                System.out.print("Select choice (1-5): ");

                if (!scanner.hasNextLine()) {
                    break;
                }
                String choice = scanner.nextLine().trim();

                if (choice.equals("5") || choice.equalsIgnoreCase("q")) {
                    System.out.println("Exiting program.");
                    break;
                }

                switch (choice) {
                    case "1":
                        System.out.print("Enter character: ");
                        String input = scanner.nextLine().trim();
                        if (!input.isEmpty()) {
                            char val = input.charAt(0);
                            queue.enqueue(val);
                            System.out.println("Enqueued: " + val);
                        } else {
                            System.out.println("Input cannot be empty.");
                        }
                        break;

                    case "2":
                        try {
                            System.out.println("Dequeued: " + queue.dequeue());
                        } catch (IllegalStateException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case "3":
                        try {
                            System.out.println("Front element: " + queue.peek());
                        } catch (IllegalStateException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case "4":
                        System.out.println("Is empty: " + queue.isEmpty());
                        break;

                    default:
                        System.out.println("Invalid option. Enter 1 to 5.");
                        break;
                }
            }
        }
    }
}