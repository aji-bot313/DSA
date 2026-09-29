public class Entity {
    Object value;

    public Entity(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}