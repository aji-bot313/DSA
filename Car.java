public class Car extends Entity {
    public Car(Object value) {
        super(value);
    }

    public void swim() {
        System.out.println("Car [" + this.value + "] is swimming.");
    }
}