public class Bird extends Entity {
    public Bird(Object value) {
        super(value);
    }

    public void fly() {
        System.out.println("Bird [" + this.value + "] is flying.");
    }
}