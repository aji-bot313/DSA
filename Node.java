public abstract class Node<T extends Comparable<T>> {
    protected T data;
    protected Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T get_data() {
        return data;
    }

    public void set_data(T data) {
        this.data = data;
    }

    public Node<T> get_next() {
        return next;
    }

    public void set_next(Node<T> next) {
        this.next = next;
    }

    public static <T extends Comparable<T>> boolean equals_safe(T a, T b) {
        if (a == b) return true;
        if (a == null || b == null) return false;
        return a.equals(b);
    }
}