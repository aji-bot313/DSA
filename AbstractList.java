public abstract class AbstractList {
    Node head;

    public abstract void insert(Object data);
    public abstract void append(Object data);
    public abstract void delete(Object data);
    public abstract void deleteFirst();
    public abstract void deleteLast();
    public abstract void print();
}