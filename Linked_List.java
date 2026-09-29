public abstract class Linked_List<T extends Comparable<T>> {
    protected Node<T> head = null;
    protected Node<T> tail = null;
    protected int size = 0;

    public abstract void add(T data);
    public abstract boolean remove(T data);
    public abstract Node<T> find(T data);
    protected abstract Linked_List<T> create_empty_like_this();

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.get_data() + " -> ");
            current = current.get_next();
        }
        System.out.println("null");
    }
}